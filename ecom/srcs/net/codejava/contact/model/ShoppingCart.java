package net.codejava.contact.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.platform.commons.util.CollectionUtils;

public class ShoppingCart {

	private Integer id;
	private String titel;
	private String auteur;
	private String afbeelding;
	private Double prijs;
	private Integer vooraad;
	private String categorie;
	public Integer Quantity;
	
	
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

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", titel=" + titel + ", auteur=" + auteur + ", afbeelding=" + afbeelding
				+ ", prijs=" + prijs + ", vooraad=" + vooraad + ", categorie=" + categorie + ", Quantity=" + Quantity
				+ "]";
	}
	
	
}
