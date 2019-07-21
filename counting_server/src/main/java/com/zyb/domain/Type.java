package com.zyb.domain;

public class Type {
    private Integer id;

    private String t_Name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


	public String getT_Name() {
		return t_Name;
	}

	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}

	@Override
	public String toString() {
		return "{t_id:'" + id + "', t_Name:'" + t_Name + "'}";
	}
    
}