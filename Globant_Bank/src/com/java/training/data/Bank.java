package com.java.training.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	public List<User> arrayUser;

	public Bank() {

		arrayUser = new ArrayList<User>();
		arrayUser.add(user1);
		arrayUser.add(user2);
		arrayUser.add(user3);
		arrayUser.add(user4);
		arrayUser.add(user5);
		arrayUser.add(user6);
		arrayUser.add(user7);
		arrayUser.add(user8);
		arrayUser.add(user9);
		arrayUser.add(user10);

	}

	BankAccount account1 = new BankAccount("01/04/2020", 100000.0);
	BankAccount account2 = new BankAccount("02/04/2020", 200000.0);
	BankAccount account3 = new BankAccount("03/04/2020", 300000.0);
	BankAccount account4 = new BankAccount("04/04/2020", 400000.0);
	BankAccount account5 = new BankAccount("05/04/2020", 500000.0);
	BankAccount account6 = new BankAccount("06/04/2020", 600000.0);
	BankAccount account7 = new BankAccount("07/04/2020", 700000.0);
	BankAccount account8 = new BankAccount("08/04/2020", 800000.0);
	BankAccount account9 = new BankAccount("09/04/2020", 900000.0);
	BankAccount account10 = new BankAccount("10/04/2020", 100000.0);

	User user1 = new User("Robbie Krise", 1111111, 1111, account1);
	User user2 = new User("Brenda Cordoba", 2222222, 2222, account2);
	User user3 = new User("Cameron Grrenfield", 3333333, 3333, account3);
	User user4 = new User("Dan Nelson", 4444444, 4444, account4);
	User user5 = new User("Daniel Sanchez", 5555555, 5555, account5);
	User user6 = new User("Evan Tartazycki", 6666666, 6666, account6);
	User user7 = new User("Julio Rivera", 7777777, 7777, account7);
	User user8 = new User("Luis Galicia", 8888888, 8888, account8);
	User user9 = new User("Michael Barreda", 9999999, 9999, account9);
	User user10 = new User("Nate Crandell", 1000000, 1000, account10);

	public void printUsers() {
		for (int i = 0; i < arrayUser.size(); i++) {

			System.out.println("Account Number: " + arrayUser.get(i).getAccount().getAccountNumber() + "  Name: "
					+ arrayUser.get(i).getClientName() + "  Username: " + arrayUser.get(i).getClientId()
					+ "  Opening Date: " + arrayUser.get(i).getAccount().getOpeningDate() + "  Balance: "
					+ arrayUser.get(i).getAccount().getBalance());
		}
	}

	public BankAccount validateAccountNumber(int accountNumber) {

		for (int i = 0; i < arrayUser.size(); i++) {

			if (arrayUser.get(i).getAccount().getAccountNumber() == accountNumber) {
				return arrayUser.get(i).getAccount();
			}
		}
		return null;
	}

	public User validateUserId(int clientId, int password) {

		for (int i = 0; i < arrayUser.size(); i++) {

			if (arrayUser.get(i).getClientId() == clientId && arrayUser.get(i).getPassword() == password) {
				return arrayUser.get(i);
			}
		}
		return null;
	}

	public String transferMoney(int transferValue, int accountTranfer, User user) {

		BankAccount account = validateAccountNumber(accountTranfer);

		if (account != null) {

			if (transferValue <= user.getAccount().getBalance()) {

				String result = user.getAccount().DecreaseTransferMoney(transferValue);
				result += account.AddTransferMoney(transferValue);

				return "Transfer of " + transferValue + " success\n" + result;
			} else {
				return "\nFounds not enough for transfer Money";
			}
		}

		else {
			return "\nBank Account doesn't exist";
		}
	}

	public String addMoneyWV(int userId, int password, int addAmmount) {

		User user = validateUserId(userId, password);

		if (user != null) {

			return user.getAccount().addMoney(addAmmount);
		}

		else {
			return "\nUser doesn't exist";
		}

	}

	public String withdrawMoneyWV(int userId, int password, int withdrawAmmount) {

		User user = validateUserId(userId, password);

		if (user != null) {

			return user.getAccount().withdrawMoney(withdrawAmmount);
		}

		else {
			return "\nUser doesn't exist";
		}
	}

	public String transferMoneyWV(int userId, int password, int transferAmmount, int transferBankAccount) {

		User user = validateUserId(userId, password);

		if (user != null) {
			
			if (transferBankAccount!=user.getAccount().getAccountNumber()) {
				return transferMoney(transferAmmount, transferBankAccount, user);
			}
			else {
				return "\nOrigin and Destiny Account are the same";
			}	
		}

		else {
			return "\nUser doesn't exist";
		}

	}

	public int readNumber(String messsage) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please type " + messsage);
			int option = scan.nextInt();
			return option;

		} catch (Exception e) {
			System.out.println("Error. Please type a valid option");
			return readNumber(messsage);
		}
	}

	public String readString(String phrase) {
		try {
			Scanner scan = new Scanner(System.in);
			String line;
			System.out.println("Please type " + phrase);
			line = scan.nextLine();
			return line;
		} catch (Exception e) {
			System.out.println("Error reading number.");
			return readString(phrase);
		}
	}

}
