package controller;

import entities.Account;

public class Transactions {
    public double addMoney (Account account,double amountAdd){
        account.setBalance(account.getBalance()+amountAdd);
        return account.getBalance();
    }

    public String withdraw(Account account, double ammountToWithdraw){
        if (ammountToWithdraw>account.getBalance()){
            return ("insufficient funds");
        }
        else {
            account.setBalance(account.getBalance()-ammountToWithdraw);
            return ("Transaction successfully");
        }
    }
}
