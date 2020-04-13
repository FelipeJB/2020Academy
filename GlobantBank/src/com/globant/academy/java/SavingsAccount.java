package com.globant.academy.java;

import java.util.Date;

public class SavingsAccount {
//	User userAccount;
	Date openDate;
	double balance;
	String message;
	double tax;

	public SavingsAccount(Date openDate, double balance) {
		this.openDate = openDate;
		this.balance = balance;
	}


	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}


	public void withdrawal(SavingsAccount account, double amount) {
		if(account.balance>=amount) {
			account.balance= account.balance-amount;

			if (amount>1000) {
				tax = (amount * 0.15) + 200;
				account.balance = account.balance - tax ;
				message = "Successful Withdrawal! The new balance for the account of-->"+"is -->"+ account.balance+" "+"Your tax was:"+tax;
			}
			if (amount<=1000) {
				tax = 200;
				account.balance = account.balance - tax;
				message = "Successful Withdrawal! The new balance for the account of-->"+"is -->"+ account.balance+" "+"Your tax was:"+tax;
			}
		}
		else {
			message = "Insufficient funds, the balance is -->" +account.balance;
		}
	}

	public void deposit(SavingsAccount account,double amount) {
		account.balance= account.balance + amount;
		message= "Successful deposit! The new balance is -->"+ account.balance;
	}

	public void transfer(SavingsAccount accountOrigin,SavingsAccount accountTrans, double transferAmount) {
		if(accountOrigin.balance >= transferAmount) {
			accountTrans.balance = accountTrans.balance + transferAmount;
			tax = 100;
			accountOrigin.balance = accountOrigin.balance - tax;
			message = "Transfer was succesfully, your new balance is: "+ accountOrigin.balance+" "+"Your tax was:"+tax;;
		} else {
			message = "Your account doesn't have enough money for the transfer"+" "+"Your tax was:"+tax;
		}

	}

}
