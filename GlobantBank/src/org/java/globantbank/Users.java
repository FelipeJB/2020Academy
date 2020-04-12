package org.java.globantbank;

public class Users {
	
	public String user;
	public String password;
	public String name;
	
	
	public Users(String user, String password, String name) {
		
		this.user=user;
		this.password=password;
		this.name=name;
		
	}

	public String toString() {
		return " Name: "+name;
	}
	
		
}
