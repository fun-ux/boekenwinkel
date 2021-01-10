package net.codejava.contact.service;

import java.util.List;

import net.codejava.contact.model.Bestelling;
import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.GetBoekID;

public interface BoekenService {
	
	public int save(Boeken boeken);
	
	public int saveDetails(Boeken boeken, Integer boekID);
	 
	public List<GetBoekID> GetBoekid();
	
	public int update(Boeken boeken, Integer id);
	
	public int updateDetails(Boeken boeken, Integer id);
	
	public Boeken get(Integer id);
	
	public List<Bestelling> getAankopen();
	
	public int delete(Integer id);

	public List<Boeken> list();
}
