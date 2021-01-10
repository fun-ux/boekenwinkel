package net.codejava.contact.service;

import java.util.List;

import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.CartItem;
import net.codejava.contact.model.GetKlantID;
import net.codejava.contact.model.Klant;
import net.codejava.contact.model.ShoppingCart;

public interface ShoppingService {
	
	 
	public List<Boeken> getBooks();
	
	public List<Boeken> getFilter(String filter);

	public CartItem get(Integer id); 

	public List<int[]> addToCart(CartItem item, List<int[]> cart);
	
	public List<int[]> removeFromCart(CartItem item, List<int[]> cart);
	
	public ShoppingCart getBoek(Integer id);

	public String getPostStatusCode();
	
	/*public String PostStatusCode(String status);*/
	
	public int insertKlant(Klant klant);
	
	public int nieuwBestelling(Integer bestelDetailsID, Integer klantID, Integer quantity);
	
	public int updateVoorraad(Integer id, Integer nieuwVooraad);
	
	public List<GetKlantID> getKlantId();
}
