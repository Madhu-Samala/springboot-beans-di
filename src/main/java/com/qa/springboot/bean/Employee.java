package com.qa.springboot.bean;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	private String contactNo;
	private double salary;
	
	
	public Employee() {
		System.out.println("Employee() is called...");
	}
	
	


	public Employee(int id, String name, String email, String contactNo, double salary) {
		System.out.println("Employee(id,String,String,String,double) is called...");
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.salary = salary;
	}




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


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
	
	

}
