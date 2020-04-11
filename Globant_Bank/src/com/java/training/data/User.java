package com.java.training.data;

public class User {

	private String clientName;
	private int clientId;
	private int password;
	private	BankAccount account; 

	public User(String clientName, int clientId, int password,BankAccount account) {
		setClientName(clientName);
		setClientId(clientId);
		setPassword(password);
		setAccount(account);
	}

	public String getClientName() {
		return clientName;
	}

	private void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getClientId() {
		return clientId;
	}

	private void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public BankAccount getAccount() {
		return account;
	}

	private void setAccount(BankAccount account) {
		this.account = account;
	}

}
