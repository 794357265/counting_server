package com.zyb.domain;

public class ItemVo extends Item {
	
	private String u_name;
	
	private String t_name;

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	@Override
	public String toString() {
		String itemString = super.toString();
		itemString = itemString.substring(1, itemString.length()-1);
		return "{"+itemString+", u_name:" + u_name + ", t_name:" + t_name + "}";
	}
	
	
	
}
