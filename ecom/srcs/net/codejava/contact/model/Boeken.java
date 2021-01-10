package net.codejava.contact.model;

public class Boeken {

	private Integer id;
	private String titel;
	private String auteur;
	private String taalID;
	private String afbeelding;
	private String omschrijving;
	private Double prijs;
	private Integer vooraad;
	private Integer teKoop;
	private Integer TeLeen;
	private String categorie;
	
	public Boeken() {

	}
	
	public Boeken(Integer id, String titel, String auteur, String taalID, String afbeelding, String omschrijving
			,Double prijs, Integer vooraad, Integer teKoop, Integer TeLeen, String categorie) {
		
		this(titel, auteur, taalID, afbeelding, omschrijving, prijs, vooraad, teKoop, TeLeen, categorie);
		this.id = id;
	}

	public Boeken(String titel, String auteur, String taalID, String afbeelding, String omschrijving,Double prijs, Integer vooraad, Integer teKoop, Integer TeLeen,String categorie) {
		this.titel = titel;
		this.auteur = auteur;
		this.taalID = taalID;
		this.afbeelding = afbeelding;
		this.omschrijving = omschrijving;
		this.prijs = prijs;
		this.vooraad = vooraad;
		this.teKoop = teKoop;
		this.TeLeen = TeLeen;
		this.categorie = categorie;
	}

	public String getTaalID() {
		return taalID;
	}

	public void setTaalID(String taalID) {
		this.taalID = taalID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getAfbeelding() {
		return afbeelding;
	}

	public void setAfbeelding(String afbeelding) {
		this.afbeelding = afbeelding;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Double getPrijs() {
		return prijs;
	}

	public void setPrijs(Double prijs) {
		this.prijs = prijs;
	}

	public Integer getVooraad() {
		return vooraad;
	}

	public void setVooraad(Integer vooraad) {
		this.vooraad = vooraad;
	}

	public Integer getTeKoop() {
		return teKoop;
	}

	public void setTeKoop(Integer teKoop) {
		this.teKoop = teKoop;
	}

	public Integer getTeLeen() {
		return TeLeen;
	}

	public void setTeLeen(Integer teLeen) {
		TeLeen = teLeen;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Boeken [id=" + id + ", titel=" + titel + ", auteur=" + auteur + ", taalID=" + taalID + ", afbeelding="
				+ afbeelding + ", omschrijving=" + omschrijving + ", prijs=" + prijs + ", vooraad=" + vooraad
				+ ", teKoop=" + teKoop + ", TeLeen=" + TeLeen + ", categorie=" + categorie + "]";
	}



	

}
