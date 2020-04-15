package com.globant.java.bank; 

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) throws Exception {
		
		int operationType;
		Scanner reader = new Scanner(System.in);

		BankOperations bankOpe = new BankOperations();
		
		bankOpe.initValues();
		
		do {
			System.out.println("Welcome to Globan Bank! Enter what operation do you want to do?\n1. Add new Money.\n2. Withdraw Money\n3. Transfer Money\n4. Print Client Information.\n0 to Exit.");
			operationType = reader.nextInt();
		
			if(operationType!=0) {
			bankOpe.operations(operationType);
					}
		}while (operationType!=0);
		
	}

	
}
