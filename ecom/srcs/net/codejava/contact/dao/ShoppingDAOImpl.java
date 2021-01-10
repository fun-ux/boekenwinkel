package net.codejava.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.GetKlantID;
import net.codejava.contact.model.Klant;
import net.codejava.contact.model.ShoppingCart;

@Transactional
@Repository
public class ShoppingDAOImpl  implements ShoppingDAO {

	private JdbcTemplate JdbcTemplate;
	
	public ShoppingDAOImpl(DataSource dataSource) {
		this.JdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	@Override
	public Boeken get(Integer id) {
		String sql = "SELECT * FROM boeken inner join besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0 and boeken.id ="+id;
		
		ResultSetExtractor<Boeken> extractor = new ResultSetExtractor<Boeken>() {
			
			@Override
			public Boeken extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					Integer id = rs.getInt("boeken.id");
					String titel = rs.getString("titel");
					String auteur = rs.getString("auteur");
					String taalID = rs.getString("taalID");
					String afbeelding = rs.getString("afbeelding");
					String omschrijving = rs.getString("omschrijving");
					Double prijs = rs.getDouble("prijs");
					Integer vooraad = rs.getInt("vooraad");
					Integer teKoop = rs.getInt("teKoop");
					Integer TeLeen = rs.getInt("TeLeen");
					String categorie = rs.getString("categorie");

					return new Boeken(id,titel,auteur,taalID,afbeelding,omschrijving, prijs, vooraad, teKoop, TeLeen, categorie);
				}
				return null;
			}
		};
		
		return JdbcTemplate.query(sql, extractor);
	}

	@Override
	public List<Boeken> getBooks() {
		String sql = "SELECT * FROM boeken inner join besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0";
		
		RowMapper<Boeken> rowMapper = new RowMapper<Boeken>() {
			
			@Override
			public Boeken mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Integer id = rs.getInt("boeken.id");
				String titel = rs.getString("titel");
				String auteur = rs.getString("auteur");
				String taalID = rs.getString("taalID");
				String afbeelding = rs.getString("afbeelding");
				String omschrijving = rs.getString("omschrijving");
				Double prijs = rs.getDouble("prijs");
				Integer vooraad = rs.getInt("vooraad");
				Integer teKoop = rs.getInt("teKoop");
				Integer TeLeen = rs.getInt("TeLeen");
				String categorie = rs.getString("categorie");

				return new Boeken(id,titel,auteur,taalID,afbeelding,omschrijving, prijs, vooraad, teKoop, TeLeen, categorie);
			}
		};
		
		return JdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public List<Boeken> getFilter(String filter) {
		
		
		String query_url = null;
		
		if(filter.contentEquals("All")) {
			query_url = "SELECT * FROM boeken inner join besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0";
		}
		
		if(filter.contentEquals("0,00 - 15,00")) {
			query_url = "SELECT * FROM db_books.boeken inner join db_books.besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0  and prijs > 0 and prijs <= 15";
		}
		
		if(filter.contentEquals("15,00 - 30,00")) {
			query_url = "SELECT * FROM db_books.boeken inner join db_books.besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0  and prijs >= 15 and prijs <= 30";
		}
		
		if(filter.contentEquals("30,00 - 50,00")) {
			query_url = "SELECT * FROM db_books.boeken inner join db_books.besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0  and prijs >= 30 and prijs <= 50";
		}
		
		if(filter.contentEquals("50,00 en hoger")) {
			query_url = "SELECT * FROM db_books.boeken inner join db_books.besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0  and prijs >= 50";
		}
		
		if(filter.contentEquals("Nederlands")) {
			query_url = "SELECT * FROM boeken inner join besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0 and taalID = 1";
		}
		
		if(filter.contentEquals("Engels")) {
			query_url = "SELECT * FROM boeken inner join besteldetails on boeken.id = besteldetails.id where besteldetails.vooraad > 0 and taalID = 2";
		}
		
 		
		
		RowMapper<Boeken> rowMapper = new RowMapper<Boeken>() {
			
			@Override
			public Boeken mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Integer id = rs.getInt("boeken.id");
				String titel = rs.getString("titel");
				String auteur = rs.getString("auteur");
				String taalID = rs.getString("taalID");
				String afbeelding = rs.getString("afbeelding");
				String omschrijving = rs.getString("omschrijving");
				Double prijs = rs.getDouble("prijs");
				Integer vooraad = rs.getInt("vooraad");
				Integer teKoop = rs.getInt("teKoop");
				Integer TeLeen = rs.getInt("TeLeen");
				String categorie = rs.getString("categorie");

				return new Boeken(id,titel,auteur,taalID,afbeelding,omschrijving, prijs, vooraad, teKoop, TeLeen, categorie);
			}
		};
		
		return JdbcTemplate.query(query_url, rowMapper);
	}

	@Override
	public int insertKlant(Klant klant) {
		String sql = "INSERT INTO klanten (voornaam, achternaam, adres, postcode, Email, Telefoonnummer) VALUES (?, ?, ?, ?, ?, ?)";
		return JdbcTemplate.update(sql,klant.getVoornaam(), klant.getAchternaam(), klant.getAddress(), klant.getPostcode(), klant.getEmail(), klant.getTelefoonnummer());

		
	}	
	
	@Override
	public int nieuwBestelling(Integer bestelDetailsID, Integer klantID, Integer quantity) {
		String sql = "INSERT INTO bestellingen (bestelDetailsID, klantID, bestelDatum, aantal) VALUES (?, ?, CURRENT_TIMESTAMP, ?)";
		return JdbcTemplate.update(sql, bestelDetailsID, klantID, quantity);

		
	}
	

	
	@Override
	public int updateVoorraad(Integer id, Integer nieuwVooraad) {
		String sql = "UPDATE besteldetails SET vooraad = ? WHERE id = ?";
		return JdbcTemplate.update(sql, nieuwVooraad, id);
	}
	
	 


	@Override
	public List<GetKlantID> getKlantId() {
		String sql = "SELECT MAX(id) FROM klanten";
		
		RowMapper<GetKlantID> rowMapper = new RowMapper<GetKlantID>() {
			
			@Override
			public GetKlantID mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Integer id = rs.getInt("MAX(id)");
				 
				
				return new GetKlantID(id);
			}
		};
		
		return JdbcTemplate.query(sql, rowMapper);
	}
}
