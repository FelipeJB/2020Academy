package controller;

import entities.Account;
import entities.User;

public class Transactions {
    public double addMoney (Account account,double amountAdd){
        account.setBalance(account.getBalance()+amountAdd);
        return account.getBalance();
    }

    public static boolean withdraw(Account account, double amountToWithdraw){
        if (amountToWithdraw>account.getBalance()){
            return false;
        }
        else {
            if (amountToWithdraw<1000) {
                double taxes=(amountToWithdraw+200);
                account.setBalance(account.getBalance() - taxes);
            }
            else {
                double taxes=(amountToWithdraw+(((amountToWithdraw*15))/100)+200);
                account.setBalance(account.getBalance() - taxes);
                   }
            return true;
        }

    }

    public static boolean transfer (Account account1,Account account2, double amountToTransfer){
        if (amountToTransfer>account1.getBalance()){
            return false;
        }
        else {
            account2.setBalance(account2.getBalance()+amountToTransfer);
            account1.setBalance(account1.getBalance()-amountToTransfer);
            return true;
        }

    }
}
