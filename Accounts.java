package org.globant.java.basic.globant.bank2;

public class Accounts {
	public static double accountOpMoney[];
	//public boolean productAvailability;
	
public void addMoneyToAccount(int q) {
	
	accountOpMoney = new double [q];
	
	for (int i = 0; i < q; i++)
	{
		System.out.println("Money for the client ID: " + Clients.clientID[i] + " | Name: " + Clients.clientName[i] + "\n" + ".................................");
		accountOpMoney[i] =  Main.scan.nextInt();
		Main.scan.nextLine();
	}
	}

public void checkAccounts(int q) {
	for (int i = 0; i < q; i++)
	{
		System.out.println("Client ID: " + Clients.clientID[i] + " | Name: " + Clients.clientName[i] + " | Account ID: " + Clients.clientAccount[i] + " | Balance: " + accountOpMoney[i] + " | Acc. Opening Date: " + Clients.accountOpDate[i] + "\n" + ".................................");
	}
}

public void checkClientAccount(int q) {
		System.out.println("Client ID: " + Clients.clientID[q] + " | Name: " + Clients.clientName[q] + " | Account ID: " + Clients.clientAccount[q] + " | Balance: " + accountOpMoney[q] + " | Acc. Opening Date: " + Clients.accountOpDate[q] + "\n" + ".................................");
	}

}
