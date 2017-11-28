package models;

import java.util.Date;

public class Item {
	private int id;
	private int price;
	private String name;
	private Date buyingdate;
	private Boolean expire;
	private String details;
	
	public void setId(int id){
		this.id = id;			
	}
	public int getId(){
		return this.id;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setBuyingdate(Date buyingdate) {
		this.buyingdate = buyingdate;
	}
	public Date getBuyingdate() {
		return buyingdate;
	}
	public void setExpire(Boolean expire) {
		this.expire = expire;
	}
	public Boolean getExpire() {
		return expire;
	}
	public void setDetails(String propertyDetails) {
		this.details = propertyDetails;
	}
	public String getDetails() {
		return details;
	}
		
}
