package com.java.training.data;

public class BankAccount {

	private int accountNumber;
	public String openingDate;
	private double balance;
	private static int accountNumberGenerator = 5500000;

	public BankAccount(String openingDate, double balance) {
		setAccountNumber(generateAccountNumber());
		setOpeningDate(openingDate);
		setBalance(balance);
	}

	public String addMoney(int addValue) {

		setBalance(balance + addValue - calculateTaxes(addValue, "addMoney"));
		return "\nFunds increased in " + addValue + "\n" + "The Taxes for this transaction is "
				+ calculateTaxes(addValue, "addMoney") + "\n" + "Your new balance is " + getBalance();
	}

	public String withdrawMoney(int withdrawValue) {

		double valueWithTaxes = withdrawValue + calculateTaxes(withdrawValue, "withdrawMoney");

		if (valueWithTaxes <= balance) {
			setBalance(balance - valueWithTaxes);
			return "\nYour withdrawal of " + withdrawValue + " was successful\n" + "The Taxes for this transaction is "
					+ (valueWithTaxes - withdrawValue) + "\n" + "Your new balance is " + getBalance();
		} else {
			return "\nInsufficient funds to withdraw money";
		}
	}

	public String AddTransferMoney(int TranferValue) {
		setBalance(balance + TranferValue - calculateTaxes(TranferValue, "AddTransferMoney"));
		return "\nTransfer added to the destiny account";
	}

	public String DecreaseTransferMoney(int TranferValue) {
		if (TranferValue <= getBalance()) {
			setBalance(balance - TranferValue - calculateTaxes(TranferValue, "DecreaseTransferMoney"));

			return "\nThe Taxes for this transaction is " + calculateTaxes(TranferValue, "DecreaseTransferMoney") + "\n"
					+ "Your new balance is " + getBalance() + "\n" + "Funds decreased from your account";

		} else {
			return "\nFunds not enough to transfer money";
		}
	}

	public double calculateTaxes(int operationValue, String tipoOperacion) {

		double taxes = 0.0;

		while (true) {
			switch (tipoOperacion) {
			case "addMoney":
				taxes = 0;
				break;

			case "withdrawMoney":

				if (operationValue <= 1000) {
					taxes = 200;
				} else {
					taxes = (operationValue * 0.15) + 200;
				}
				break;
				
			case "AddTransferMoney":
				taxes = 0;
				break;

			case "DecreaseTransferMoney":
				taxes = 100;
				break;

			default:
				System.out.println("Operation doesn't defined");
				break;
			}
			return taxes;

		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	private void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	private void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getAccountNumberGenerator() {
		return accountNumberGenerator;
	}

	public static void setAccountNumberGenerator(int accountNumberGenerator) {
		BankAccount.accountNumberGenerator = accountNumberGenerator;
	}

	private int generateAccountNumber() {
		accountNumberGenerator = accountNumberGenerator + 1;
		return accountNumberGenerator;
	}
}