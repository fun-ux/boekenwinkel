package net.codejava.contact.model;

public class GetBoekID {

	private Integer id;

	public GetBoekID(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "GetKlantID [id=" + id + "]";
	}
	
}
