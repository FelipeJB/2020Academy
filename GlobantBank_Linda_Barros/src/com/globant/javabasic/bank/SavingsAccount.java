package com.globant.javabasic.bank;

import java.util.Date;

public class SavingsAccount {
    private int accountNumber;
    private Date openingDate;
    private double balance;


    public SavingsAccount(int accountNumber, Date openingDate, double balance, int clientID) {
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.balance = balance;
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

    public void setBalance(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount >= this.balance){
            return false;
        }else{
            this.balance -= amount;
        }
        return true;
    }
}
