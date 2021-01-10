package net.codejava.contact.model;

public class GetKlantID {

	private Integer id;

	public GetKlantID(Integer id) {
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
