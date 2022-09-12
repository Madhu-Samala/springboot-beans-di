package com.qa.springboot.bean;

public class Address {
	
	private int id;
	private String houseNo;
	private String street;
	private String city;
	private int zipCode;
	
	public Address() {
	System.out.println("Address() is called..");
		
	}

	public Address(int id, String houseNo, String street, String city, int zipCode) {
		System.out.println("Address(int,String,String...)");
		this.id = id;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", zipCode="
				+ zipCode + "]";
	}
	
	
	
	

}
