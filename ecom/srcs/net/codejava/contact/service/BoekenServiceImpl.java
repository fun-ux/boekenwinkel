package net.codejava.contact.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.contact.dao.BoekenDAOImpl;
import net.codejava.contact.dao.ShoppingDAOImpl;
import net.codejava.contact.model.Bestelling;
import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.GetBoekID;
import net.codejava.contact.model.GetKlantID;

@Transactional
@Service
public class BoekenServiceImpl implements BoekenService {

	private BoekenDAOImpl sDao;
	
	public BoekenServiceImpl(DataSource dataSource) {
		System.out.println("service layer created");
		this.sDao = new BoekenDAOImpl(dataSource);
	}	
	
	@Override
	public int save(Boeken boeken) {
		try {
			return sDao.save(boeken);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public int saveDetails(Boeken boeken, Integer boekID) {
		try {
			return sDao.saveDetails(boeken, boekID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public List<GetBoekID> GetBoekid() {
		 
		return sDao.GetBoekid();
	}

	@Override
	public int update(Boeken boeken, Integer id) {
		return sDao.update(boeken, id);
	}
	
	@Override
	public int updateDetails(Boeken boeken, Integer id)
	{
		return sDao.updateDetails(boeken, id);

	}
	@Override
	public Boeken get(Integer id) {
		
			return sDao.get(id);
		
	}

	@Override
	public List<Bestelling> getAankopen() {
		
			return sDao.getAankopen();
		
	}
	
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Boeken> list() {
		try {
			return sDao.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}



}
