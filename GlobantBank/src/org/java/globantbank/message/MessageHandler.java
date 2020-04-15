package org.java.globantbank.message;

import org.java.globantbank.Account;
import org.java.globantbank.users.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MessageHandler {
	
	Scanner myInitialOpt = new Scanner(System.in);
    Scanner myadminUser = new Scanner(System.in);
    Scanner myadmiPassword = new Scanner(System.in);
    Scanner myOptAdmin=new Scanner(System.in);
    Scanner myUserAccount = new Scanner(System.in);
    Scanner myUserPassword = new Scanner(System.in);
    Scanner myOptUser=new Scanner(System.in);
    Scanner myAccountToTransfer = new Scanner(System.in);
    Scanner myMoneyToTransfer= new Scanner(System.in);
    Scanner myMoneyToAdd= new Scanner(System.in);
    Scanner myMoneyToWithdraw= new Scanner(System.in);
	
	public int showInitialMessage() {
		int myOptSelected=0;
		try {
        System.out.println("*****------------------*****");
        System.out.println("Are you an admin user or a normal user?, we will need your credentials");
        System.out.println("1. Press 1 if you are an admin user.");
        System.out.println("2. Press 2 if you are a normal user.");
        System.out.println("*****------------------*****");
        myOptSelected=myInitialOpt.nextInt();
        return myOptSelected;
		}catch (InputMismatchException inPutEx) {
            System.err.println("You tried to insert a non-numeric value, please select one of the numeric options. Thank you!! ");
            
        }return myOptSelected;
	}
	
	public void showInitialAdminMessage(ArrayList<Account> accountList) {
			System.out.println("*****------------------*****");
			System.out.println("Enter your admin user name: Clue - AdminCam - test1234");
			String adminUser=myadminUser.next();
			System.out.println("*****------------------*****");
			System.out.println("Enter your admin password:");
			String adminPassword=myadmiPassword.next();
			
			new adminUsersHandler().validateAdminUser(adminUser, adminPassword, accountList); 
			
	}
	
	public int showMenuAdminMessage() {
		int adminOpt=0;
		try {
		System.out.println("*****------------------*****");
		System.out.println("Welcome Admin, do you want to know the accounts information?:");
		System.out.println("1. Press 1 if yes.");
		System.out.println("2. Press 2 to close.");
		System.out.println("*****------------------*****");
		adminOpt=myOptAdmin.nextInt();
		return adminOpt;
		}catch (InputMismatchException inPutEx) {
            System.err.println("You tried to insert a non-numeric value, please select one of the numeric options. Thank you!! ");
            
        }return adminOpt;
		
	}
	
	public void showInitialNormalUserMessage(ArrayList<Account> accountList) {
		System.out.println("*****---HI, PLEASE INSERT YOUR USER AND PASSWORD---*****");
		System.out.println("*****------------------*****");
		System.out.println("Enter your user name: Clue - paezcamilo - 1234");
		String normalUser=myUserAccount.next();
		System.out.println("*****------------------*****");
		System.out.println("Enter your password:");
		String normalUserPass=myUserPassword.next();
		new normalUsersHandler().validateNormalUser(normalUser, normalUserPass, accountList);
	}
	
	public int showMenuNormalUsermessage(String normalUser) {
		System.out.println("*****------"+normalUser+"------*****");
		System.out.println("Welcome, what operation do you want to execute?:");
		System.out.println("1. Press 1 to know your balance.");
		System.out.println("2. Press 2 to do a wire transfer to another bank account.");
		System.out.println("3. Press 3 to add money to your account.");
		System.out.println("4. Press 4 to do a withdrawal.");
		System.out.println("5. Press 5 to close your account information.");
		System.out.println("*****------------------*****");
		
		int userOpt=myOptUser.nextInt();
		return userOpt;
	}
	
	public void showBalanceNormalUserMessage(String normalUser,ArrayList<Account> accountList, int i) {
		
		System.out.println("*****-----"+normalUser+"-------------*****");
		System.out.println("This is your balance account: "+accountList.get(i).user.toString()+", Balance: "+accountList.get(i).balance);
		System.out.println("*****------------------*****");
	}
	
	public String showAccToTransNormalUserMessage() {
		
		System.out.println("*****------------------*****");
		System.out.println("please insert the account number of the account you want send money");
		System.out.println("*****------------------*****");
		String accountToTrans=myAccountToTransfer.next();
		return accountToTrans;
	}
	
	public Double showMoneyToTransNormalUserMessage(String accountToTrans) {
		
		System.out.println("*****------------------*****");
		System.out.println("The bank account " +accountToTrans+" exist, enter the amount of money to transfer");
		System.out.println("*****------------------*****");
		Double moneyToTransfer=myMoneyToTransfer.nextDouble();
		return moneyToTransfer;
	}
	
	public void showNewBalanceNormalUserMessage(ArrayList<Account> accountList, int i) {
		
		System.out.println("*****------------------*****");
		System.out.println("The wire transer cost is: $100");
		System.out.println("Your new balance is: "+accountList.get(i).balance);
		System.out.println("*****------------------*****");
	}
	
	public Double requestMoneyToAdd() {
		
		System.out.println("*****------------------*****");
		System.out.println("Please insert the amount of money you want to add.");
		System.out.println("*****------------------*****");
		Double moneyToAdd=myMoneyToAdd.nextDouble();
		return moneyToAdd;
	}
	
	public Double requestMoneyToWithdraw() { 
		
		System.out.println("*****------------------*****");
		System.out.println("Please insert the amount of money you want to withdraw.");
		System.out.println("Remember tax is 200 for amounts less than 1000");
		System.out.println("Remember tax is 200 plus 15% of the amount, for withdraw higher than 1000");
		System.out.println("*****------------------*****");
		Double moneyToWithdraw=myMoneyToWithdraw.nextDouble();
		return moneyToWithdraw;
	}
	
	public void showNewBalanceNormalUserMessage2(ArrayList<Account> accountList, int i) {
		
		System.out.println("*****------------------*****");
		System.out.println("Your new balance is: "+accountList.get(i).balance);
		System.out.println("*****------------------*****");
	}
	
}