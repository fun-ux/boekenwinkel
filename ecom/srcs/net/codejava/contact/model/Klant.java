package net.codejava.contact.model;

public class Klant {
	private String Voornaam;
	private String Achternaam;
	private String Email;
	private String Telefoonnummer;
	private String Address;
	private String Postcode;
	
	public Klant(String voornaam, String achternaam, String email, String telefoonnummer, String address, String postcode) {
		Voornaam = voornaam;
		Achternaam = achternaam;
		Email = email;
		Telefoonnummer = telefoonnummer;
		Address = address;
		Postcode = postcode;
	}

	public String getVoornaam() {
		return Voornaam;
	}

	public void setVoornaam(String voornaam) {
		Voornaam = voornaam;
	}

	public String getAchternaam() {
		return Achternaam;
	}

	public void setAchternaam(String achternaam) {
		Achternaam = achternaam;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPostcode() {
		return Postcode;
	}

	public void setPostcode(String postcode) {
		Postcode = postcode;
	}

	
	
	
	
}
