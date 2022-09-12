package com.qa.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name;
	private String email;
	private String contactNo;
	private double salary;
	
	
	private Address homeaddress;
	
	
	
	private Address officeaddress;
	
	
	/*
	 * public Employee() { System.out.println("Employee() is called..."); }
	 */
	
	/*
	 * @Autowired public Employee(@Qualifier("officeaddress") Address address) {
	 * System.out.println("Employee(Address) is called"); this.address = address; }
	 */
	
	


	/*
	 * public Employee(int id, String name, String email, String contactNo, double
	 * salary) {
	 * System.out.println("Employee(id,String,String,String,double) is called...");
	 * this.id = id; this.name = name; this.email = email; this.contactNo =
	 * contactNo; this.salary = salary; }
	 */




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Address getHomeaddress() {
		return homeaddress;
	}

	@Autowired
	@Qualifier("homeaddress")
	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}


	public Address getOfficeaddress() {
		return officeaddress;
	}

	@Autowired
	@Qualifier("officeaddress")
	public void setOfficeaddress(Address officeaddress) {
		this.officeaddress = officeaddress;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", salary="
				+ salary + ", homeaddress=" + homeaddress + ", officeaddress=" + officeaddress + "]";
	}




	
	/*
	 * public void init() { System.out.println("Initialization code ..."); }
	 * 
	 * public void cleanup() { System.out.println("Clean up code..."); }
	 */
	
	
	
	
	
	
	

}
