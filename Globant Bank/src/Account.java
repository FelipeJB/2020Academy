import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Account {
    private int userID;
    private int accountNumber;
    private String openingDate;
    private int balance;

    ArrayList<Account> accounts = new ArrayList();

    int productNoExist = 0;
    int productFlag = 0;

    public Account(int userID, int accountNumber, String openingDate, int balance) {
        this.userID = userID;
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.balance = balance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account:" + this.accountNumber + " OpeningDate: " + this.openingDate + " Balance:$ " + this.balance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void setListSavingAccounts() {
        if(contExecution==0) {
            Account account1 = new Account(100, 4556383, "02-03-2000", 2888);
            accounts.add(account1);
            Account account2 = new Account(101, 2474781, "02-04-1998", 1000);
            accounts.add(account2);
            Account account3 = new Account(102, 6789033, "22-06-2004", 2000);
            accounts.add(account3);
            Account account4 = new Account(103, 5387902, "30-08-2003", 3456);
            accounts.add(account4);
            Account account5 = new Account(104, 2894519, "27-01-1995", 5678);
            accounts.add(account5);
            Account account6 = new Account(105, 2458032, "15-05-2012", 3000);
            accounts.add(account6);
            Account account7 = new Account(106, 4830284, "09-12-2011", 1200);
            accounts.add(account7);
            Account account8 = new Account(107, 2947589, "11-07-2006", 2567);
            accounts.add(account8);
            Account account9 = new Account(108, 4647390, "31-09-2008", 8900);
            accounts.add(account9);
            Account account10 = new Account(109, 2348609, "12-11-2010", 3212);
            accounts.add(account10);
            Account account11 = new Account(110, 1759704, "01-10-2019", 2500);
            accounts.add(account11);
            Account account12 = new Account(111, 6827252, "07-12-2020", 4678);
            accounts.add(account12);
        }
        contExecution=contExecution +1;
        accountsSize=accounts.size();
    }

    //********************************************************************************************************************+
    int contExecution = 0;
    int accountsSize=0;

    public void getClientList()
    {
        User users = new User();
        users.setListUsers();
        setListSavingAccounts();

        for (int i = 0; i < accountsSize; i++) {
            System.out.println(users.getUserIdData(i));
            System.out.println(accounts.get(i));
            System.out.println("--------------------------------------------------------");
        }
    }

    public int getValueWithdraw(int valueTo, int accountNumber) {
        int balance = 0, valueToWithdraw = 0;
        boolean withdrawFlag = false;

        for (int i = 0; i < accounts.size(); i++) {

            if (accountNumber == accounts.get(i).getAccountNumber()) {
                if (valueTo >= 1000) {
                    balance = accounts.get(i).getBalance();
                    valueToWithdraw = ((valueTo * 15 / 100) + 200);
                    balance = accounts.get(i).getBalance() - valueToWithdraw;
                    accounts.get(i).setBalance(balance);
                    return balance;
                } else {
                    balance = (accounts.get(i).getBalance() - 200);
                    accounts.get(i).setBalance(balance);
                    return balance;
                }

            }
        }
        return balance;
    }

    boolean costTxMsj = false;

    public boolean getTransactionTaxed(int valueTo, int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber == accounts.get(i).getAccountNumber()) {
                if (valueTo < 1000) {
                    System.out.println("The cost of the transaction is $200");
                    return costTxMsj = true;

                } else {

                    int balanceFinal = (valueTo * 15 / 100 + 200);
                    System.out.println("The cost of the transaction is $" + (balanceFinal));
                    return costTxMsj = true;
                }
            }
        }
        return costTxMsj;
    }

    boolean validateFundsFlag = false;

    public boolean validateFunds(int valueTo, int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber == accounts.get(i).getAccountNumber()) {
                if (valueTo > accounts.get(i).getBalance()) {
                    return validateFundsFlag = true;
                }
                return validateFundsFlag = false;
            }
        }
        return validateFundsFlag;
    }

    public int getAccountNumber(int userId) {
        int userID = userId;
        int accountNumber = 0;

        for (int i = 0; i < accounts.size(); i++) {

            if (userID == (accounts.get(i).getUserID())) {
                accountNumber = accounts.get(i).getAccountNumber();
                return accountNumber;
            }
        }
        return accountNumber;
    }


    int initialBalance = 0;

    public int getInitialBalance(int accountNumber) {

        for (int i = 0; i < accounts.size(); i++) {

            if (accountNumber == (accounts.get(i).getAccountNumber())) {
                initialBalance = accounts.get(i).getBalance();
                return initialBalance;
            }
        }
        return initialBalance;
    }

    //**********************************************************************************************************************
    int finalBalance1 = 0;

    public int addMoney(int valueToAdd, int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {

            if (accountNumber == (accounts.get(i).getAccountNumber())) {

                finalBalance1 = accounts.get(i).getBalance() + valueToAdd;
                accounts.get(i).setBalance(finalBalance1);
                return finalBalance1;
            }
        }
        return finalBalance1;
    }
//**********************************************************************************************************************

    public void getAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
                System.out.println("Account No." + accounts.get(i).getAccountNumber() + " Balance:$" + accounts.get(i).getBalance());
        }
    }

    boolean accountTxFlag = false;
    public boolean getAccountToTransfer(int accountSelected) {

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountSelected) {
                return accountTxFlag = true;
            }
        }
        return accountTxFlag;
    }


    int finalBalanceAccountToTransfer = 0;

    public int transferToAccount(int valueToTransfer, int accountSelected) {
        for (int i = 0; i < accounts.size(); i++) {

            if (accountSelected == (accounts.get(i).getAccountNumber())) {
                finalBalanceAccountToTransfer = accounts.get(i).getBalance() + valueToTransfer;
                accounts.get(i).setBalance(finalBalanceAccountToTransfer);
                return finalBalanceAccountToTransfer;
            }
        }
        return finalBalanceAccountToTransfer;
    }


    int finalBalanceAccountFromTransfer=0;

    public int transferFromAccount(int valueToTransfer, int accountNumber){
        for (int i = 0; i < accounts.size(); i++) {

            if (accountNumber == (accounts.get(i).getAccountNumber())) {
                finalBalanceAccountFromTransfer = accounts.get(i).getBalance() - valueToTransfer - 100;
                accounts.get(i).setBalance(finalBalanceAccountFromTransfer);
                return finalBalanceAccountFromTransfer;
            }
        }
        return finalBalanceAccountFromTransfer;
    }


}






