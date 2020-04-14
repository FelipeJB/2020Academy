package controller;

import entities.Account;
import entities.User;

public class Transactions {
    private static double taxes=0;

    public static double getTaxes() {
        return taxes;
    }

    public static void setTaxes(double taxes) {
        Transactions.taxes = taxes;
    }

    public double addMoney (Account account, double amountAdd){
        account.setBalance(account.getBalance()+amountAdd);
        return account.getBalance();
    }

    public static boolean withdraw(Account account, double amountToWithdraw){
        if (amountToWithdraw>account.getBalance()){
            return false;
        }
        else {
            if (amountToWithdraw<1000) {
                taxes=200;
            }
            else {
                taxes=(((amountToWithdraw*15)/100)+200);
            }
            account.setBalance(account.getBalance() - taxes);
            return true;
        }

    }

    public static boolean transfer (Account account1,Account account2, double amountToTransfer){
        if (amountToTransfer>account1.getBalance()){
            return false;
        }
        else {
            taxes=100;
            account2.setBalance(account2.getBalance()+(amountToTransfer+taxes));
            account1.setBalance(account1.getBalance()-(amountToTransfer+taxes));
            return true;
        }

    }
}
