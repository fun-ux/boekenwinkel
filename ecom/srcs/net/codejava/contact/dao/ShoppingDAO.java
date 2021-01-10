package net.codejava.contact.dao;

import java.util.List;

import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.GetKlantID;
import net.codejava.contact.model.Klant;
import net.codejava.contact.model.ShoppingCart;

public interface ShoppingDAO {
	
	 
	public List<Boeken> getBooks();
	
	public List<Boeken> getFilter(String filter);
	
	public Boeken get(Integer id); 

	public int insertKlant(Klant klant);
	
	public int nieuwBestelling(Integer bestelDetailsID, Integer klantID, Integer quantity);
	
	public int updateVoorraad(Integer id, Integer nieuwVooraad);
	
	public List<GetKlantID> getKlantId();
}
