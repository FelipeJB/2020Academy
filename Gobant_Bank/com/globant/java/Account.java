package com.globant.java;

public class Account {

    public int accountNumber;
    public String openingDate;
    public int balance;

    //Constructor to initialize atributes
    public Account(int accountNumber, String openingDate, int balance){
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.balance = balance;
    }

    public String toString(){
        return "Account Number = " + accountNumber + ", Opening Date = " + openingDate + ", Balance = " + balance;
    }

    public int getBalance() { return balance;}
    public int getAccountNumber() { return accountNumber;}

    public void setBalance(int balance){
        this.balance = balance;
    }
}
