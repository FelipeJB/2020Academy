package org.java.globantbank.accounts;

import java.util.ArrayList;

import org.java.globantbank.Account;

public class UserValidationHandler {
	
	public String accountUser;
	public String passUser;
	public String bankAccToTrans;
	public ArrayList<Account> acc;
	

	
	//Method created to validate if the user exists
	public int validateUserArray(String accountUser,String passUser, ArrayList<Account> acc) {
		
		this.accountUser=accountUser;
		this.passUser=passUser;
		this.acc=acc;
		
		ArrayList<Account> accountList= new ArrayList<Account>();
		accountList=acc;
		int i=0;
		while(i<accountList.size()) {
			if (accountList.get(i).user.user.equals(accountUser) && accountList.get(i).user.password.equals(passUser)) {
				return i;
			}i++;
		}
		return accountList.size();
	}
	
	//Method created to validate if the bank Account to transfer the money exist
	public int validateBankAccountArray(String bankAccToTrans, ArrayList<Account> acc) {
		this.bankAccToTrans = bankAccToTrans;
		this.acc = acc;
		
		ArrayList<Account> accountList= new ArrayList<Account>();
		accountList=acc;
		int i=0;
		while(i<accountList.size()) {
			if (accountList.get(i).accountNumber.equals(bankAccToTrans)) {
				return i;
			}i++;
		}
		return accountList.size();
	}
	
}

