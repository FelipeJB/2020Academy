package com.globant.academy.java;

public class User {

	String userName;
	String password;
    SavingsAccount userAccount;	
    
    public User(String name,String pass,SavingsAccount account) {
    	this.userName=name;
    	this.password=pass;
    	this.userAccount=account;
    	
    }
}


