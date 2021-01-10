package net.codejava.contact.model;

public class CartItem {
	 public Integer Id;
     public Double Prijs;
     public Integer Quantity;
     
     
     public CartItem(Double prijs, Integer quantity) {
		 
		Prijs = prijs;
		Quantity = quantity;
	}		
     
     public CartItem(Integer id, Double prijs, Integer quantity) {
    	 this(prijs, quantity);
    	 this.Id = id;
 	}		
     
     public CartItem() {
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Double getPrijs() {
		return Prijs;
	}
	public void setPrijs(Double prijs) {
		Prijs = prijs;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItem [Id=" + Id + ", Prijs=" + Prijs + ", Quantity=" + Quantity + "]";
	}
}
