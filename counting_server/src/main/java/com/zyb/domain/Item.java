package com.zyb.domain;

public class Item {
    private int id;

    private String remark;

    private int user_id;

    private int type_id;

    private String date;
    
    private String start_date;
    
    private String end_date;
    
    private String price;
    
    private String start_price;
    
    private String end_price;

    public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getDate() {
        return date;
    }

	public void setDate(String date) {
        this.date = date;
    }
	
    public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	public String getStart_price() {
		return start_price;
	}

	public void setStart_price(String start_price) {
		this.start_price = start_price;
	}

	public String getEnd_price() {
		return end_price;
	}

	public void setEnd_price(String end_price) {
		this.end_price = end_price;
	}

	@Override
	public String toString() {
		return "{i_id:" + id + ", i_remark:" + remark + ", i_userId:" + user_id + ", i_typeId:" + type_id + ", i_price:" + price + ", i_date:" + date
				+ "}";
	}

}