package com.globant.javabasic.bank;

import java.util.Date;

public class Client {
    private int clientID;
    private String userName;
    private String password;
    private SavingsAccount savingsAccount;

    public Client(int clientID, String userName, String password) {
        this.clientID = clientID;
        this.userName = userName;
        this.password = password;
    }

    public boolean addSavingsAccount(int accountNumber, double balance) {
        if (savingsAccount != null) {
            Date date = new Date();
            savingsAccount = new SavingsAccount(accountNumber, date, balance, clientID);

            return true;
        }
        return false;
    }

    public int getClientID() {
        return clientID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

}
