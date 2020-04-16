package org.globant.java.basic.globant.bank2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static String currentDate() { // Current Date
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");  
        String strDate = dateFormat.format(date);
        return strDate;
	}
	
	public static int selectOption() { // Transaction selection
	    int option;
	    option = scan.nextInt();
	    return option;
	}
	
	public static void menuClient() {  // Menu Clients
		   System.out.println("Select an option:" + "\n" + "Press 1 to check your balance" + "\n" + "Press 2 to deposit money" + "\n" + "Press 3 to withdraw money" + "\n" + "Press 4 to Transfer money" + "\n" + "\n" + "Press 5 to finish and return" + "\n" + ".................................");	 
		}
	
	public static void menuBank() {	// Menu Bank
		   System.out.println("Select an option:" + "\n" + "Press 1 to add clients" + "\n" + "Press 2 to print clients info" + "\n" + "\n" + "Press 3 to finish and return" + "\n" + ".................................");	 
		}
		
	public static void menuRole() {  // Select role
		   System.out.println("Press 1 to Clients " + "\n" + "Press 2 to Bank" + "\n" + ".................................");	 
		}
	
	public static void welcome() {  
		System.out.println("Welcome to Olympus Bank $$$" + "\n" + "To start, please enter the number of clients to add to your bank");
		//System.out.println("Welcome to Olympus Bank" + "\n" + "To start, please enter your role. Press 1 for Clients or Press 2 for Bank Manager");
		}

	public static void main(String[] args) {
				
		//BankMgmt newBankMgmt = new BankMgmt(); //Constructors
		Clients newClient = new Clients();
		Accounts newAccount = new Accounts();
		
		welcome();
		
		newClient.clientQuantity = scan.nextInt(); // Add Inventory
		int q = newClient.clientQuantity;
		
		System.out.println(".................................");
		System.out.println("Enter the name of your new " + q + " clients");
		System.out.println(".................................");
		
		newClient.addClients(q); // Add Products
		System.out.println(".................................");
		System.out.println("This is your clients list:" + "\n" + ".................................");
		newClient.showClients(q);
		System.out.println(".................................");
		
		System.out.println("Now, let's open the client's accounts with an amount of money");
		System.out.println("Enter the money of each added client");
		System.out.println(".................................");
		
		newAccount.addMoneyToAccount(q); // Add Products Quantity
		System.out.println("This is your clients list:" + "\n" + ".................................");
		newAccount.checkAccounts(q);
		System.out.println(".................................");
						
		menuRole();
		
		int roleOption;
		roleOption = scan.nextInt();
		
		do {
		switch (roleOption) {
		// Client
		  case 1:
			menuClient();
			int choiseCient;
			do {
				choiseCient = selectOption();
			switch (choiseCient) {
			  case 1:
				  // Check Balance
				int clientID;
				System.out.println("Please enter your ID:" + "\n" + ".................................");
				clientID = scan.nextInt();
				newAccount.checkClientAccount(clientID);
				menuClient();
				break;
			  case 2:
				  // Deposit
				System.out.println("Please enter your ID:" + "\n" + ".................................");
				clientID = scan.nextInt();
				newClient.addMoney(clientID);  
				menuClient();
				break;
			  case 3:
				  // Withdraw
				System.out.println("Please enter your ID:" + "\n" + ".................................");
				clientID = scan.nextInt();
				newClient.withdrawMoney(clientID); 
				menuClient();
				break;
			  case 4:
					// Transfer
				  System.out.println("Please enter your ID:" + "\n" + ".................................");
					int origin = scan.nextInt();
					System.out.println("Please enter the destination ID:" + "\n" + ".................................");
					int destiny = scan.nextInt();
					newClient.transferMoney(origin, destiny);
				menuClient();
				break;
			  case 5:
				  // Return to menu
				System.out.println("Bye");
				System.exit(1);
				break;
				default: menuClient();
		    }
		    } while (choiseCient!=4);
			break;
			
		// Bank
		  case 2:
			menuBank();
			int choiseBank;
			do {
				choiseBank = selectOption();
			switch (choiseBank) {
			  case 1:
				// Add Clients
				menuBank();
				break;
			  case 2:
				// Print Clients Info
				menuBank();
				break;
			  case 3:
				System.out.println("Bye");
				System.exit(1);
				break;
				default: menuBank();
		    }
		    } while (choiseBank!=3);
			
		break;			
		default: welcome();
	    }
	    } while (roleOption!=3);
		
	}

	
}
