package com.globant.java.bank; 

import java.util.ArrayList;
import java.util.Scanner;

public class BankOperations {

	public int customerCode = 100;
	public int customerAccount = 10000001;
	public boolean loginStatus = false;
	public int control;
	public double opeMoney;
	public double opeTax;
	public int opeAccount; 
	public String user;
	public String password;
	public int listIndicator;
	
	ArrayList<Customer> customerList = new ArrayList<>();
	ArrayList<Accounts> accountList = new ArrayList<>();

	
	Scanner reader = new Scanner(System.in);
	
	public void initValues() throws Exception {
		customerList.add(new Customer(customerCode++, "Oscar", "Diaz", "Oscar", "1234"));
		accountList.add(new Accounts(customerCode, customerAccount++, 1000000, "20/02/2007"));
		customerList.add(new Customer(customerCode++, "Carol", "Bohorq", "Carol", "1234"));
		accountList.add(new Accounts(customerCode, customerAccount++, 2000000, "11/07/2003"));
		customerList.add(new Customer(customerCode++, "Felipe", "Jimenez", "Felipe", "1234"));
		accountList.add(new Accounts(customerCode, customerAccount++, 3000000, "12/10/2001"));
		customerList.add(new Customer(customerCode++, "Fredy", "Peña", "Fredy", "1234"));
		accountList.add(new Accounts(customerCode, customerAccount++, 4000000, "11/11/2004"));
	}
		
	public void operations (int operationType) {
		
		switch (operationType) {
		case 1:
			this.login();
			
			if (loginStatus == true) {
				System.out.println("Enter the amount that do you want to add to your account.");
				opeMoney = reader.nextInt();
				accountList.get(listIndicator).balance = accountList.get(listIndicator).balance + opeMoney; 
				System.out.println("The new balance for your account is: " + accountList.get(listIndicator).balance);
				loginStatus = false;
			}
		break;
		case 2:
			this.login();
			
			if (loginStatus == true) {
				System.out.println("Enter the amount that do you want to withdraw from you Account.");
				opeMoney = reader.nextInt();
				if (opeMoney <= 1000 ) {
					opeMoney = opeMoney + 200;
					if (accountList.get(listIndicator).balance >= opeMoney) {
						accountList.get(listIndicator).balance = accountList.get(listIndicator).balance - opeMoney;
						System.out.println("The money were withdrow. The new balance for your account is: " + accountList.get(listIndicator).balance);
						loginStatus = false;
					}else {
						System.out.println("Account does not have enough funds. The balance for your account is: " + accountList.get(listIndicator).balance);
						loginStatus = false;
					}
				} else {
					opeTax = opeMoney * 0.15;
					opeMoney = opeMoney + 200 + opeTax;
					if (accountList.get(listIndicator).balance >= opeMoney) {
						accountList.get(listIndicator).balance = accountList.get(listIndicator).balance - opeMoney;
						System.out.println("The money were withdrawn. The new balance for your account is: " + accountList.get(listIndicator).balance);
						loginStatus = false;
					}else {
						System.out.println("Account does not have enough funds. The balance for your account is: " + accountList.get(listIndicator).balance);
						loginStatus = false;
					}
				}
			}
		break;
		case 3:
			this.login();
			control = 0;
			
			if (loginStatus == true) {
				System.out.println("Enter the account number that do you want to transfer.");
				opeAccount = reader.nextInt();
				
				for (int i=0; i < customerList.size(); i++) {
					if (opeAccount == accountList.get(i).accountNumber) {
						control = 1;
						System.out.println("Enter the ammount that do you want to transfer from you Account.");
						opeMoney = reader.nextInt();
						opeTax = opeMoney + 100;
						if (accountList.get(listIndicator).balance >= opeTax) {
							accountList.get(listIndicator).balance = accountList.get(listIndicator).balance - opeTax;
							accountList.get(i).balance = accountList.get(i).balance + opeMoney;
							System.out.println("Successful transfer. The new balance for your account is: " + accountList.get(listIndicator).balance);
							loginStatus = false;
						} else {
							System.out.println("Account does not have enough funds. The balance for your account is: " + accountList.get(listIndicator).balance);
							loginStatus = false;
						}
					}
				}
				if (control != 1) {
					System.out.println("The account number does not exist, please try again.");
				}
			}
		break;
		case 4:
			this.printList();			
		break;
		default:
			System.out.println("You chose a wrong option.");
		}
	}
	
	public void printList () {
		System.out.println("Glober Bank Customer List.\nCustomer Code\tFirst Name\tLast Name\tBalance\t\t\tOpening Date");
				
		for (int i=0; i < customerList.size(); i++) {
			
			System.out.println(customerList.get(i).customerCode + "\t\t" + customerList.get(i).firstName + "\t\t" + customerList.get(i).lastName + "\t\t" + accountList.get(i).balance + "\t\t" + accountList.get(i).openingDate);
			
		}
				
	}
	
	public void login() {
		control = 0;
		System.out.println("Please, Enter the customer User.");
		user = reader.next();
				
		for (int i=0; i < customerList.size(); i++) {
			if (user.equals(customerList.get(i).user)) {
				control = 1;
				System.out.println("Now, Enter the customer password.");
				password = reader.next();
				if (password.equals(customerList.get(i).password)) {
					System.out.println("Wellcome " + customerList.get(i).firstName + ".");
					loginStatus = true;
					listIndicator = i;
				} 
			}
		}
		if (control == 0) {
			System.out.println("Invalid User, please try again.");
		}else if (control == 1 && loginStatus == false  ) {
			System.out.println("Incorrect Password, please try again.");
		}
	}
}

