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

import net.codejava.contact.model.Bestelling;
import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.GetBoekID;
import net.codejava.contact.model.GetKlantID;

@Transactional
@Repository
public class BoekenDAOImpl implements BoekenDAO {

	private JdbcTemplate JdbcTemplate;
	
	public BoekenDAOImpl(DataSource dataSource) {
		this.JdbcTemplate = new JdbcTemplate(dataSource);
	}	
	@Override
	public int save(Boeken b) {
		
		String sql = "INSERT INTO boeken (titel, auteur, taalID, categorie, afbeelding, omschrijving) VALUES (?, ?, ?, ?, ?, ?)";
		return JdbcTemplate.update(sql, b.getTitel(), b.getAuteur(), b.getTaalID(), b.getCategorie(), b.getAfbeelding(), b.getOmschrijving());
	}


	 @Override
	 public int saveDetails(Boeken b, Integer boekID){
		String sql = "INSERT INTO besteldetails (prijs, boekenID, vooraad) VALUES (?, ?, ?)";
		return JdbcTemplate.update(sql, b.getPrijs(), boekID, b.getVooraad());
	}
	 
	 @Override
	public List<GetBoekID> GetBoekid() {
		String sql = "SELECT MAX(id) FROM boeken";
		
		RowMapper<GetBoekID> rowMapper = new RowMapper<GetBoekID>() {
			
			@Override
			public GetBoekID mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Integer id = rs.getInt("MAX(id)");
				 
				
				return new GetBoekID(id);
			}
		};
		
		return JdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public int update(Boeken b, Integer id) {
		String sql = "UPDATE boeken SET titel=?, auteur=?, taalID=?, categorie=?, afbeelding=?, omschrijving=? WHERE id=?";
		return JdbcTemplate.update(sql,b.getTitel(), b.getAuteur(), b.getTaalID(), b.getCategorie(), b.getAfbeelding(), b.getOmschrijving(), b.getId());
	}

	@Override
	public int updateDetails(Boeken b, Integer id) {
		String sql = "UPDATE besteldetails SET prijs=?, vooraad=? WHERE id=?";
		return JdbcTemplate.update(sql,b.getPrijs(), b.getVooraad(), b.getId());

	}
	
	@Override
	public Boeken get(final Integer id) {
		String sql =  "SELECT * FROM boeken inner join besteldetails on boeken.id = besteldetails.id where boeken.id ="+id;
		
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
	public List<Bestelling> getAankopen(){

		String sql = " \r\n"
				+ "SELECT bestellingen.id, bestelDatum, aantal,voornaam,Email,Telefoonnummer,titel,afbeelding FROM db_books.bestellingen \r\n"
				+ "inner join klanten on bestellingen.klantID = klanten.id \r\n"
				+ "inner join besteldetails on bestellingen.bestelDetailsID = besteldetails.id \r\n"
				+ "inner join boeken on besteldetails.boekenID = boeken.id";
		
		RowMapper<Bestelling> rowMapper = new RowMapper<Bestelling>() {
			
			@Override
			public Bestelling mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Integer id = rs.getInt("bestellingen.id");
				String bestelDatum = rs.getString("bestelDatum");
				Integer aantal = rs.getInt("aantal");
				String voornaam = rs.getString("voornaam");
				String Email = rs.getString("Email");
				String Telefoonnummer = rs.getString("Telefoonnummer");
				String titel = rs.getString("titel");
				String afbeelding = rs.getString("afbeelding");
				

				return new Bestelling(id,bestelDatum,aantal,voornaam,Email,Telefoonnummer, titel, afbeelding);
			}
		};
		
		return JdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM boeken WHERE id="+id;
		return JdbcTemplate.update(sql);
	}

	@Override
	public List<Boeken> list() {
		
		String sql = "SELECT * FROM boeken inner join besteldetails on boeken.id = besteldetails.id";
		
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
	

}
