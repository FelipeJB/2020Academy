package com.java.training.data;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Bank globantBank = new Bank();

		Scanner scan = new Scanner(System.in);

		int option;
		int withdrawAmmount;
		int addAmmount;
		int transferAmmount;
		int primaryBankAccount;
		int transferBankAccount;
		int userId;
		int password;

		while (true) {
			System.out.println("\n-------------------------------------------------");
			System.out.println("  *************** GLOBANT BANK® ***************  ");
			System.out.println("1. Print Clients\n" + "2. Add Founds to your Bank Account\n" + "3. Withdraw Founds from your Bank Account\n"
					+ "4. Transfer Founds to another Bank Account\n" + "5. Exit");
			System.out.println("-------------------------------------------------\n");

			option = globantBank.readNumber("an option: ");

			switch (option) {

			case 1: {  /*Print Clients*/

				System.out.println(
						"-----------------------------------------------My Clients information-----------------------------------------------");
				globantBank.printUsers();
				System.out.println(
						"---------------------------------------------------------------------------------------------------------------------");

				break;
			}

			case 2: {  /*Add Money*/

				userId = globantBank.readNumber("your User ID");
				password = globantBank.readNumber("your password");
				addAmmount = globantBank.readNumber("the ammount to add to your account");

				System.out.println(globantBank.addMoneyWV(userId, password, addAmmount));

				break;
			}

			case 3: {  /*Withdraw Money*/

				userId = globantBank.readNumber("your User ID");
				password = globantBank.readNumber("your password");
				withdrawAmmount = globantBank.readNumber("the ammount to withdraw to your account");

				System.out.println(globantBank.withdrawMoneyWV(userId, password, withdrawAmmount));

				break;
			}

			case 4: {  /*Transfer Money to another Bank Account*/

				userId = globantBank.readNumber("your User ID");
				password = globantBank.readNumber("your password");
				transferAmmount = globantBank.readNumber("the ammount to transfer from your account");
				transferBankAccount = globantBank.readNumber("the number account to transfer");

				System.out.println(globantBank.transferMoneyWV(userId, password, transferAmmount, transferBankAccount));

				break;
			}

			case 5: {  /*Logout*/
				System.out.println("Session ended");
				System.exit(0);
				break;
			}

			default:  /*Error*/
				System.out.println("\n" + "Option is not in the menu" + "\n");
			}
		}
	}

}
