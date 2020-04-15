package com.globant.java.bank; 

import java.text.SimpleDateFormat;  
import java.util.Date;

public class Accounts {

	public int customerCode;
	public int accountNumber;
	public double balance;
	public Date openingDate;
		
	public Accounts(int customerCode, int accountNumber, double balance, String openingDate) throws Exception {
		this.customerCode = customerCode;
		this.accountNumber = accountNumber;
		this.balance = balance;
	    Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(openingDate);  
		this.openingDate = date1;
	  
				
	}
}
