package net.codejava.contact.model;

public class loggedIn {
	private Integer logged;
	private String Status;
	
	
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public loggedIn(Integer logged) {
		this.logged = logged;
	}

	public Integer getLogged() {
		return logged;
	}

	public void setLogged(Integer logged) {
		this.logged = logged;
	}

	@Override
	public String toString() {
		return "loggedIn [logged=" + logged + "]";
	}
	
	
}
