
// Globant Bank needs to make a system for their users to make transactions with their savings accounts using the following instructions:.
//The bank has many users, so there should be an option to print all clients and their related information.
//Each client has a savings account, an user and a password
// Each bank account has an account number, an opening date and a balance.
// The user should be able to make a withdraw, add money, and transfer money to another bank account
//.Some transactions are taxed the following way:
//Withdrawals tax is $200 for amounts less than $1000. 
// Withdrawals of more than $1000 tax is $200 plus 15% of the amount to withdraw.
// Adding money to the account does not have any cost.
// Transfering money to another account tax is $100.

package GlobantBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	static List<Client> myClients = new ArrayList<Client>();
	static List<Account> myAccount = new ArrayList<Account>();
	private static Scanner ent;

	public static void main(String[] args) {
		
		readData();
		showMenu();
	}

	private static void showMenu() {
		ent = new Scanner(System.in);
		boolean exit = false;
		int optionMenu;
		while (!exit) {
			System.out.println("\n1. Print the information of all clients");
			System.out.println("2. Create a new client");
			System.out.println("3. Create a new acoount");
			System.out.println("4. Add money to an account");
			System.out.println("5. Make a withdrawal");
			System.out.println("6. Transfer money to another bank");
			System.out.println("7. Exit");
			System.out.print("Type an option number here ---> ");
			optionMenu = ent.nextInt();
			switch (optionMenu) {
			case 1:
				printAllClientAccount();
				break;

			case 2:
				if (createNewClient()) {
					System.out.println("Client created successfully");
				} else {
					System.out.println("---Invalid client --- ");
				}
				break;

			case 3:
				if (createNewAccount()) {
					System.out.println("Account created successfully");
				} else {
					System.out.println("Error, the client already has an account");
				}
				break;

			case 4:
				addMoney();
				break;

			case 5:
				withdrawalMoney();
				break;

			case 6:
				TransferlMoney();
				break;

			case 7:
				exit = true;
				break;
			default:
				System.out.println("Plese type only numbers between 1 to 6");
			}
		}
	}

	private static void TransferlMoney() {
		ent = new Scanner(System.in);
		double valueToTransfer;
		double balanceCuurent;
		double balanceFinal;
		String balanceFinalString;

		System.out.print("User: ");
		String user = ent.nextLine();
		System.out.print("Password: ");
		String password = ent.nextLine();

		for (int i = 0; i < myAccount.size(); i++) {
			if (user.equals(myAccount.get(i).getUser()) && password.equals(myAccount.get(i).getPassword())) {
				System.out.print("Wellcome: " + myClients.get(i).getName());
				System.out.println(", your current balance is: " + myAccount.get(i).getBalance());
				String	dni = myAccount.get(i).getDni();

				System.out.print("Type the amount of money you want to transer: ");
				valueToTransfer = ent.nextDouble();

				if (valueToTransfer > 0) {
					balanceCuurent = Double.parseDouble(myAccount.get(i).getBalance());

					balanceFinal = ((balanceCuurent - valueToTransfer) - 100);
					if (balanceFinal < 0)
						System.out.println("Insufficient balance");

					else {
						balanceFinalString = String.valueOf(balanceFinal);
						myAccount.get(i).setBalance(balanceFinalString);
						System.out.println(
								"---successful Transfer ---\n Your new balance is: " + myAccount.get(i).getBalance());

					}
				} else
					System.out.println("The amount to Transfer must be greater than zero");

			}

		}
	}

	private static void withdrawalMoney() {
		ent = new Scanner(System.in);
		double valueToWithdrawal;
		double balanceCuurent;
		double balanceFinal;
		String balanceFinalString;

		System.out.print("User: ");
		String user = ent.nextLine();
		System.out.print("Password: ");
		String password = ent.nextLine();

		for (int i = 0; i < myAccount.size(); i++) {
			if (user.equals(myAccount.get(i).getUser()) && password.equals(myAccount.get(i).getPassword())) {
				System.out.print("Wellcome: " + myClients.get(i).getName());
				System.out.println(", your current balance is: " + myAccount.get(i).getBalance());
				String	dni = myAccount.get(i).getDni();

				System.out.print("Type the amount of money you want to withdrawal: ");
				valueToWithdrawal = ent.nextDouble();

				if (valueToWithdrawal > 0) {
					balanceCuurent = Double.parseDouble(myAccount.get(i).getBalance());

					if (valueToWithdrawal < 1000) {

						balanceFinal = ((balanceCuurent - valueToWithdrawal) - 200);
						if (balanceFinal < 0)
							System.out.println("Insufficient balance");
						else {
							balanceFinalString = String.valueOf(balanceFinal);

							myAccount.get(i).setBalance(balanceFinalString);
							System.out.println("---Withdrawa successful ---\n Your new balance is: "
									+ myAccount.get(i).getBalance());
						}
					}

					else {
						balanceFinal = ((balanceCuurent - valueToWithdrawal) - 200 - (valueToWithdrawal * 0.15));
						if (balanceFinal < 0)
							System.out.println("Insufficient balance");
						else {
							balanceFinalString = String.valueOf(balanceFinal);
							myAccount.get(i).setBalance(balanceFinalString);
							System.out.println("---Withdrawa successful ---\n Your new balance is: "
									+ myAccount.get(i).getBalance());
						}

					}

				} else
					System.out.println("The amount to Withdrawa must be greater than zero");
			}
		}

	}

	private static void addMoney() {
		ent = new Scanner(System.in);
		double valueToAdd;
		double balanceCuurent;
		double balanceFinal;
		String balanceFinalString;

		System.out.print("User: ");
		String user = ent.nextLine();
		System.out.print("Password: ");
		String password = ent.nextLine();

		for (int i = 0; i < myAccount.size(); i++) {
			if (user.equals(myAccount.get(i).getUser()) && password.equals(myAccount.get(i).getPassword())) {
				System.out.print("Wellcome: " + myClients.get(i).getName());
				System.out.println(", your current balance is: " + myAccount.get(i).getBalance());
				String	dni = myAccount.get(i).getDni();

				System.out.print("Type the amount of money you want to deposit: ");
				valueToAdd = ent.nextDouble();

				if (valueToAdd > 0) {
					balanceCuurent = Double.parseDouble(myAccount.get(i).getBalance());
					balanceFinal = (balanceCuurent + valueToAdd);

					balanceFinalString = String.valueOf(balanceFinal);

					myAccount.get(i).setBalance(balanceFinalString);

					System.out.println("Transaction successful");
					System.out.println("Your new balance is: " + myAccount.get(i).getBalance());

				} else
					System.out.println("The amount to deposit must be greater than zero");

			}
		}
	}

	private static boolean createNewClient() {
		ent = new Scanner(System.in);
		System.out.println("Type new client information");
		System.out.print("Dni: ");
		String dni = ent.nextLine();

		for (int i = 0; i < myClients.size(); i++) {
			if (dni.equals(myClients.get(i).getDni())) {
				return false;
			}
		}

		System.out.print("Name: ");
		String name = ent.nextLine();
		System.out.print("Gender <Male/Famale> :");
		String gender = ent.nextLine();
		Client c = new Client(dni, name, gender);
		myClients.add(c);
		System.out.println("---Client created successfully---");

		return true;

	}

	private static boolean createNewAccount() {
		ent = new Scanner(System.in);
		System.out.println("Type new account information ");
		System.out.print("Dni: ");
		String dni = ent.nextLine();

		for (int i = 0; i < myClients.size(); i++) {
			if (dni.equals(myClients.get(i).getDni())) {
				for (int j = 0; j < myAccount.size(); j++) {

					if (dni.equals(myAccount.get(j).getDni())) {
						return false;
					}
				}

				System.out.print("AccountNumber: ");
				String accountNumber = ent.nextLine();
				System.out.print("OpeningDate (MM/DD/YYYY) :");
				String openingDate = ent.nextLine();
				System.out.print("Initial balance: ");
				String balance = ent.nextLine();
				System.out.print("user: ");

				String user = ent.nextLine();
				if (userValidate(user)) {

					System.out.print("password: ");
					String password = ent.nextLine();

					Account a = new Account(dni, accountNumber, openingDate, balance, user, password);
					myAccount.add(a);
					return true;
				}
			}

		}
		return false;

	}

	private static boolean userValidate(String user) {
		String userV = user;
		for (int k = 0; k < myAccount.size(); k++) {
			if (userV.equals(myAccount.get(k).getUser())) {
				System.out.println("The User already exist");
				return false;
			}

		}
		return true;
	}

	private static void readData() {
		//ller clientes de una lista de texto pano
		try {
			
			Path clientFilePath = Paths.get(
					"C:\\Users\\cesar.ruedas\\eclipse-workspace\\Globant-2020-Training\\src\\GlobantBank\\DataLoad\\clientList");

			Scanner input = new Scanner(clientFilePath);
			while (input.hasNextLine()) {
				String i = input.nextLine();
				String[] cutString = i.split(",");
				Client clt = new Client(cutString[0], cutString[1], cutString[2]);
				myClients.add(clt);
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Leer cuentas de una lista de texto pano
		try {
			// Path accountFilePath =
			// Paths.get("/Globant-2020-Training/src/GlobantBank/DataLoad/accountList");
			Path accountFilePath = Paths.get(
					"C:\\Users\\cesar.ruedas\\eclipse-workspace\\Globant-2020-Training\\src\\GlobantBank\\DataLoad\\accountList");

			Scanner input2 = new Scanner(accountFilePath);
			while (input2.hasNextLine()) {
				String j = input2.nextLine();
				String[] cutString = j.split(",");

				double dni = Double.parseDouble(cutString[0]);

				Account accnt = new Account(cutString[0], cutString[1], cutString[2], cutString[3], cutString[4],
						cutString[5]);
				myAccount.add(accnt);

			}
			input2.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void printAllClientAccount() {
		for (Client j : myClients) {
			System.out.println("Clients information " + j.toString());
			for (Account k : myAccount) {
				if (j.getDni().equals(k.getDni()))
					System.out.println("Accounts information " + k.toString());

			}
			System.out.println();
		}
	}

}
