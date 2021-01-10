package net.codejava.contact.model;

public class Bestelling {
	private Integer id;
	private String bestelDatum;
	private Integer aantal;
	private String Voornaam;
 	private String Email;
	private String Telefoonnummer;
	private String titel;
	private String afbeelding;
	
 
	
	public Bestelling(Integer id, String bestelDatum, Integer aantal, String voornaam, String email,
			String telefoonnummer, String titel, String afbeelding) {
 		this.id = id;
		this.bestelDatum = bestelDatum;
		this.aantal = aantal;
		this.Voornaam = voornaam;
		this.Email = email;
		this.Telefoonnummer = telefoonnummer;
		this.titel = titel;
		this.afbeelding = afbeelding;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBestelDatum() {
		return bestelDatum;
	}

	public void setBestelDatum(String bestelDatum) {
		this.bestelDatum = bestelDatum;
	}

	public Integer getAantal() {
		return aantal;
	}

	public void setAantal(Integer aantal) {
		this.aantal = aantal;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAfbeelding() {
		return afbeelding;
	}

	public void setAfbeelding(String afbeelding) {
		this.afbeelding = afbeelding;
	}

	public String getVoornaam() {
		return Voornaam;
	}

	public void setVoornaam(String voornaam) {
		Voornaam = voornaam;
	}

	 

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefoonnummer() {
		return Telefoonnummer;
	}

	public void setTelefoonnummer(String telefoonnummer) {
		Telefoonnummer = telefoonnummer;
	}

	@Override
	public String toString() {
		return "Bestelling [id=" + id + ", bestelDatum=" + bestelDatum + ", aantal=" + aantal + ", Voornaam=" + Voornaam
				+ ", Email=" + Email + ", Telefoonnummer=" + Telefoonnummer + ", titel=" + titel + ", afbeelding="
				+ afbeelding + "]";
	}

	 

	 
	
	
	
	
}
