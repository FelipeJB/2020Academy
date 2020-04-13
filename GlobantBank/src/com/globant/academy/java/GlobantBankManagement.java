package com.globant.academy.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GlobantBankManagement {

	public static void main(String[] args) {

		int op = 0;
		Scanner scan = new Scanner(System.in);


		SavingsAccount svsaccount = new SavingsAccount();

		List<User> userList = new ArrayList<>();
		userList.add(new User("Dani","1234",new SavingsAccount(new Date(),5000)));
		userList.add(new User("Juli","4321",new SavingsAccount(new Date(),2000)));


		while(op!=6) {

			System.out.println("********************************************");
			System.out.println("Enter the type of transaction you want to make:");
			System.out.println("1.Register a new user to the bank.");
			System.out.println("2.List of the users");
			System.out.println("3.Deposit to my account");
			System.out.println("4.Withdrawal of my account");
			System.out.println("5.Transfer to another account");
			System.out.println("6.Exit");
			System.out.println("********************************************");

			op = scan.nextInt(); 


			switch(op) {
			case 1:
				System.out.println("Enter the name of the user:");
				String newUser = scan.next();
				System.out.println("Enter the password of the user:");
				String newPass = scan.next();
				System.out.println("Enter the inicial balance for the user savings account:");
				double newBalance= scan.nextDouble();
				userList.add(new User(newUser, newPass, new SavingsAccount(new Date(), newBalance)));
				break;	

			case 2:
				System.out.println("The avaiable users are:");
				System.out.println("User   ||   Balance   || Creation Date");
				for (int i=0;i<userList.size();i++) {
					System.out.println(userList.get(i).userName+"||"+userList.get(i).userAccount.balance+"||"+userList.get(i).userAccount.openDate);
				}
				break;
			case 3:
				System.out.println("Enter the user that you want to deposit:");
				String depoUser = scan.next();
				for (int j=0;j<userList.size();j++) {
					if(depoUser.compareTo(userList.get(j).userName) == 0) {
						System.out.println("Enter the amount that you want to deposit:");
						double amtDepo = scan.nextDouble();
						svsaccount.deposit(userList.get(j).userAccount, amtDepo);
						System.out.println(svsaccount.message);
					}
				}
				break;
			case 4:
				System.out.println("Enter the user that you want to withdrawal:");
				String withUser = scan.next();
				for (int k=0;k<userList.size();k++) {
					if(withUser.compareTo(userList.get(k).userName) == 0) {
						System.out.println("Enter the amount that you want to withdrawal:");
						double amtWith = scan.nextDouble();
						svsaccount.withdrawal(userList.get(k).userAccount, amtWith);
						System.out.println(svsaccount.message);
					}
				}
				break;
			case 5:
				System.out.println("Enter the user of the origin account:");
				String origUser = scan.next();
				for (int l=0;l<userList.size();l++) {
					if(origUser.compareTo(userList.get(l).userName) == 0) {
						System.out.println("Enter the user of the transfer account::");
						String transUser = scan.next();
						for (int m=0;m<userList.size();m++) {
							if(transUser.compareTo(userList.get(m).userName) == 0) {
								System.out.println("Enter the amount that you want to transfer:");
								double amtTrans = scan.nextDouble();
								svsaccount.transfer(userList.get(l).userAccount, userList.get(m).userAccount, amtTrans);
								System.out.println(svsaccount.message);
							}
						}
					}
				}
				break;
			}

		}

	}
}
