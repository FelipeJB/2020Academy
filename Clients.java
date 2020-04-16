package org.globant.java.basic.globant.bank2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clients {
	
	public int clientQuantity;
	
	public static String clientID[];
	public static String clientName[];
	public static String clientPassword[];
	public static String clientAccount[];
	public static double accountBalance[];
	public static String accountOpDate[];
	

	private static final String ALPHA_NUMERIC_STRING = "0123456789";
	
	public static String randomAlphaNumeric(int count) {
	StringBuilder builder = new StringBuilder();
	while (count-- != 0) {
	int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
	builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	}
	return builder.toString();
	}
	
	public void addClients(int q) {
		
		clientID = new String [q];
		clientName = new String [q];
		clientPassword = new String [q];
		clientAccount = new String [q];
		accountBalance = new double [q];
		accountOpDate = new String [q];
				
		for (int i = 0; i < q; i++)
		{
		int p = i + 1;
		clientID[i] = "CL000" + p;
		System.out.println("Enter the name of the client #" + p);
		clientName[i] =  Main.scan.next();
		Main.scan.nextLine();
		clientPassword[i] =  randomAlphaNumeric(4);
		clientAccount[i] =  "AC000" + p;
		accountBalance[i] =  0;
		accountOpDate[i] =  Main.currentDate();
		}
	}
	
	/*public static void setPassword(int q) {
		
		String confirmPassword;
		clientPassword = new String [q];
				
		for (int i = 0; i < q; i++)
		{
		//int p = i + 1;
		
		System.out.println("Please, enter your transanction password");
		clientPassword[i] =  Main.scan.next();
		Main.scan.nextLine();
		
		System.out.println("Please, confirm your password");
		confirmPassword =  Main.scan.next();
		Main.scan.nextLine();
		
		}
	}*/
	
	public static int logIn(int q) {
		System.out.println("Please, enter your user ID:");
		String inputID;
		inputID = Main.scan.nextLine();

			for (int i = 0; i < q; i++)
			{
				if(inputID == clientID[i]) {
					int id = i;
					System.out.println("Welcome" + clientName[id]);
					System.out.println("Please, enter your PIN:");
					String inputPIN = Main.scan.nextLine();
						for (int j = 0; i < q; j++)
						{
							if(inputPIN == clientPassword[j]) {
								int pass = j;
								System.out.println("Log in sucess for: " + clientName[pass]);
								return 1;
							}
						}
					}
				}
			return 1;
	}
	
	public double addMoney(int q){
		double moneyIn;
	    System.out.println("Enter the amount of money to deposit:" + "\n" + "................................."); 
	    moneyIn = Main.scan.nextInt();	    
	    Accounts.accountOpMoney[q] = Accounts.accountOpMoney[q] + moneyIn;	
		return Accounts.accountOpMoney[q];
	}
			
	public double withdrawMoney(int q) { //Retrieve Money
		
		// Apply Taxes: Withdrawals tax is $200 for amounts less than $1000. Withdrawals of more than $1000 tax is $200 plus 15% of the amount to withdraw.
		
		if (Accounts.accountOpMoney[q]>0)
		{
	    int moneyOut;
	    System.out.println("Enter the amount of money to withdraw:" + "\n" + "................................."); 
	    moneyOut = Main.scan.nextInt();
	    if (moneyOut <= Accounts.accountOpMoney[q]) {
	    	Accounts.accountOpMoney[q] = Accounts.accountOpMoney[q] - moneyOut;
	    	System.out.println("Your withdraw was success." + "\n" + ".................................");
	    }
	    else {
	    	System.out.println("Your withdraw can not be processed. Insufficient founds." + "\n" + 								".................................");
	    }
		}
		else {
			System.out.println("Your withdraw can not be processed. Insufficient founds." + "\n" + 								".................................");
		}
		return Accounts.accountOpMoney[q];
	}
	
	public double transferMoney(int q, int p){
		// Apply Taxes: Transferring money to another account tax is $100.
		
		if (Accounts.accountOpMoney[q]>0)
		{
	    int moneyOut;
	    System.out.println("Enter the amount of money to transfer:" + "\n" + "................................."); 
	    moneyOut = Main.scan.nextInt();
	    if (moneyOut <= Accounts.accountOpMoney[q]) {
	    	Accounts.accountOpMoney[q] = Accounts.accountOpMoney[q] - moneyOut;
	    	Accounts.accountOpMoney[p] = Accounts.accountOpMoney[p] + moneyOut;	
			//return Accounts.accountOpMoney[q];
	    	System.out.println("Your transfer was success." + "\n" + ".................................");
	    }
	    else {
	    	System.out.println("Your transfer can not be processed. Insufficient founds." + "\n" + 								".................................");
	    }
		}
		else {
			System.out.println("Your transfer can not be processed. Insufficient founds." + "\n" + 								".................................");
		}
		return Accounts.accountOpMoney[q];
		    
	    
	}	
	
	public void showClients(int q) {
		for (int i = 0; i < q; i++)
		{
		System.out.println("Client ID: " + clientID[i] + " | Name: " + clientName[i] + " | PIN: " + clientPassword[i] + " | Account ID: " + clientAccount[i] + " | Balance: " + accountBalance[i] + " | Acc. Opening Date: " + accountOpDate[i]);
		}
	}

}
