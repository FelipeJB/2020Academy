package com.globant.javabasic.bank;

import java.util.Date;

public class SavingsAccount {
    private int accountNumber;
    private Date openingDate;
    private double balance;
    private int clientID;


    public SavingsAccount(int accountNumber, Date openingDate, double balance, int clientID) {
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.balance = balance;
        this.clientID = clientID;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getClientID() {
        return clientID;
    }
}
