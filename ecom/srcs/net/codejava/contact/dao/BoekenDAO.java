package net.codejava.contact.dao;

import java.util.List;

import net.codejava.contact.model.Bestelling;
import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.GetBoekID;

public interface BoekenDAO {
	
	public int save(Boeken boeken);
	
	public int saveDetails(Boeken b, Integer boekID);
	
	public List<GetBoekID> GetBoekid();
	
	public int update(Boeken boeken, Integer id);
	
	public int updateDetails(Boeken boeken, Integer id);
	
	public Boeken get(Integer id);
	
	public List<Bestelling> getAankopen();
	
	public int delete(Integer id);

	public List<Boeken> list();

}
