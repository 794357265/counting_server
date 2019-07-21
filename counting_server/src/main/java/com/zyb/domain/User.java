package com.zyb.domain;

public class User {

	private int id;
	
	private String u_Name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getU_Name() {
		return u_Name;
	}

	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}
	
	@Override
	public String toString() {
		return "{u_id:'" + id + "', u_Name:'" + u_Name + "'}";
	}

}
