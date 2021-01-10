package net.codejava.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Boeken;

class BoekenDAOTest {

	private DriverManagerDataSource dataSource;
	private BoekenDAO dao;
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_bookstore?serverTimezone=Europe/Amsterdam");
		dataSource.setUsername("root");
		dataSource.setPassword("34dilv;1223gKK");
		
		dao = new BoekenDAOImpl(dataSource);
	}
	
	@Test
	void testSave() {
		Boeken boeken = new Boeken("Bill Gates", "Bill Gates", "boekcover afbeelding", "Tour rond het leven van Bill Gates en MICROSOFT Inc");
		int result = dao.save(boeken);
		
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Boeken boeken = new Boeken(5, "Bill Jan", "Bill Gates", "boekcover afbeelding", "Tour rond het leven van Bill Gates en MICROSOFT Inc");
		int result = dao.update(boeken);
		
		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		Integer id = 3;
		Boeken boeken = dao.get(id);
		
		if(boeken != null) {
			System.out.println(boeken);
		}
		
		assertNotNull(boeken);
	}

	@Test
	void testDelete() {
		Integer id = 6;
		int result = dao.delete(id);
		
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Boeken> listBoeken = dao.list();

		for (Boeken aBoeken : listBoeken) {
			System.out.println(aBoeken);
		}
		
		assertTrue(!listBoeken.isEmpty());
	}

}
