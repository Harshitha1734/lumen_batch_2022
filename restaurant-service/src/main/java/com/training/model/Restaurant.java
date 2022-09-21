package com.training.model;

public class Restaurant {
	
	private int id;
	private String restaurantName;
	private long pincode;
	private String cuisine;
	
	public Restaurant() {
		super();

	}
	public Restaurant(int id, String restaurantName, long pincode, String cuisine) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.pincode = pincode;
		this.cuisine = cuisine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantName=" + restaurantName + ", pincode=" + pincode + ", cuisine="
				+ cuisine + "]";
	}
	

}
