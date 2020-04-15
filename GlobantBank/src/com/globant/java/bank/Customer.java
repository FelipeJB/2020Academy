package com.globant.java.bank; 

public class Customer {

	public int customerCode;
	public String firstName;
	public String lastName;
	public String user;
	public String password;
		
	public Customer(int customerCode, String firstName, String lastName, String user, String password) {
		this.customerCode = customerCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.user = user;
		this.password = password;
		
	}
	
}
