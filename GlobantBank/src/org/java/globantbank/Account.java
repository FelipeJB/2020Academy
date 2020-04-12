package org.java.globantbank;

public class Account {
	
	public Users user;
	public String accountNumber;
	public double balance;
	public String initialDate;
	
	public Account(Users user, String accountNumber, double balance, String initialDate) {
		
		this.user=user;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.initialDate=initialDate;
		
	}
	
	public String toString() {
		return "Account Number: "+accountNumber+""+user.toString()+" - Balance: "+balance+" - Date of opening: "+initialDate;
	}

}
