package net.codejava.contact.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import net.codejava.contact.dao.ShoppingDAOImpl;
import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.CartItem;
import net.codejava.contact.model.GetKlantID;
import net.codejava.contact.model.Klant;
import net.codejava.contact.model.ShoppingCart;

@Transactional
@Service
public class ShoppingServiceImpl implements ShoppingService {
	
	
	private ShoppingDAOImpl sDao;
	public String PostStatusCode;
	
	public ShoppingServiceImpl(DataSource dataSource) {
		System.out.println("service layer created");
		this.sDao = new ShoppingDAOImpl(dataSource);
	}	
	
	@Override
	public List<Boeken> getBooks() {
		
 		try {
			return sDao.getBooks();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	@Override
	public List<Boeken> getFilter(String filter) {
			
		
		
		try {
			return sDao.getFilter(filter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	
	public CartItem get(Integer id) {
		//zoek het cart-product en check of het nog beschikbaar is
		Boeken boek = sDao.get(id);
		
		//als probleem is met instantie maken want het al bestaat. maak dan een check of er al een instantie van is
		CartItem item = new CartItem();
		item.setId(boek.getId());
		item.setPrijs(boek.getPrijs());
		item.setQuantity(1);
		
		return item;
	}
	
	public ShoppingCart getBoek(Integer id) {
		//zoek het cart-product en check of het nog beschikbaar is
		Boeken boek = sDao.get(id);
		
		//als probleem is met instantie maken want het al bestaat. maak dan een check of er al een instantie van is
		ShoppingCart item = new ShoppingCart();
		item.setId(boek.getId());
		item.setTitel(boek.getTitel());
		item.setAuteur(boek.getAuteur());
		item.setAfbeelding(boek.getAfbeelding());
		item.setPrijs(boek.getPrijs());
		item.setVooraad(boek.getVooraad());
		item.setCategorie(boek.getCategorie());
		
		return item;
	}
	
	
	public List<int[]> addToCart(CartItem item, List<int[]> cart) {
		
		/*cart.setId(item.getId());
		cart.setQuantity(item.getQuantity());*/
		
 		//System.out.println("itemid = " + item.getId());
 		
 		
		Boeken boek = sDao.get(item.getId());
		
		Integer vooraadBoek = boek.getVooraad();
 		
 		int found_duplicate = 0;
 		
		 for(int i=0; i < cart.size(); i++) {
	         
		 		/*System.out.println("id = " + cart.get(i)[0]);
	 			System.out.println("quant = " + cart.get(i)[1]  );*/
	 			
	 			//cart.get(i)[0]
	 			if(item.getId().compareTo(cart.get(i)[0]) == 0) {
	 				found_duplicate = cart.get(i)[0];
	 				
	 				//cart.get(i)[1].compareTo(cart.get(i)[1] != 0){}
	 				
	 				item.setQuantity(cart.get(i)[1]);
	 				
	 				//System.out.println("itemquantity = " + item.getQuantity());
	 				
	 				if(item.getQuantity().compareTo(vooraadBoek) != 0){
	 					cart.get(i)[1]++;
	 					setPostStatusCode("toegevoegd");
	 				}
	 				else {
	 					//System.out.println("je hebt de max in voorraad");
	 					setPostStatusCode("max");
	 				}
	 				
	 				//
	 			}
		 		
	    }
			//System.out.println("gevonden id = " + found_duplicate);
		if(found_duplicate == 0) {
			cart.add(new int[] {item.getId(), item.getQuantity()});
			setPostStatusCode("nieuw");
		}
		// 
	 
		
	
		return cart;
	}

		public String getPostStatusCode() {
			return PostStatusCode;
		}
	
		public void setPostStatusCode(String postStatusCode) {
			PostStatusCode = postStatusCode;
		}

		@Override
		public List<int[]> removeFromCart(CartItem item, List<int[]> cart) {
			
			
			int found_duplicate = 0;
			
 			 for(int i=0; i < cart.size(); i++) {
		         
			 		/*System.out.println("id = " + cart.get(i)[0]);
		 			System.out.println("quant = " + cart.get(i)[1]  );*/
		 			
		 			//cart.get(i)[0]
		 			if(item.getId().compareTo(cart.get(i)[0]) == 0) {
		 				
		 				
		 				found_duplicate = cart.get(i)[0];
		 				 
		 				setPostStatusCode("verwijderd");
		 				//System.out.println(found_duplicate);
		 				cart.remove(cart.get(i));
		 			}
		 			 
			 		
		    }
			 if(found_duplicate == 0) {
				 	setPostStatusCode("niks");
				}
 
			return cart;
		}

		@Override
		public int insertKlant(Klant klant) {
			
			return sDao.insertKlant(klant);
		}
		
		@Override
		public int nieuwBestelling(Integer bestelDetailsID, Integer klantID, Integer quantity) {
			return sDao.nieuwBestelling(bestelDetailsID, klantID, quantity);
		}

		@Override
		public int updateVoorraad(Integer id, Integer nieuwVooraad) {
			
			return sDao.updateVoorraad(id, nieuwVooraad);
		}

		@Override
		public List<GetKlantID> getKlantId() {
			 
			return sDao.getKlantId();
		}
	 
		
	
	
}
