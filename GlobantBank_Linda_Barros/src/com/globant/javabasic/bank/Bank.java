package com.globant.javabasic.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //
    //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private int taxWithdrawLess1000;
    private int taxWithdrawMore1000;
    private int taxPlusPercentage;
    private int taxTransfer;
    private List<Client> clientList = new ArrayList<>();

    public Bank(int taxWithdrawLess1000, int taxWithdrawMore1000, int taxPlusPercentage, int taxTransfer) {
        this.taxWithdrawLess1000 = taxWithdrawLess1000;
        this.taxWithdrawMore1000 = taxWithdrawMore1000;
        this.taxPlusPercentage = taxPlusPercentage;
        this.taxTransfer = taxTransfer;
        createClients();
    }

    public double addMoney(Client client, double amount) {
        SavingsAccount account = client.getSavingsAccount();
        account.setBalance(amount);
        updateClient(client);
        return account.getBalance();
    }

    public String withdrawMoney(Client client, double amount) {
        String result = "";

        SavingsAccount account = client.getSavingsAccount();
        amount = applyTax(amount);
        boolean money = account.withdraw(amount);
        if (money) {
            updateClient(client);
            result = String.valueOf(account.getBalance());
        }
        return result;
    }

    public String transferMoneyToAccount(Client clientFrom, double amount, Client clientTo) {
        String result = "";

        if(clientFrom.getClientID() == clientTo.getClientID()){
            result ="You can't transfer to your own account";
        }else {
            SavingsAccount accountFrom = clientFrom.getSavingsAccount();
            boolean resFromAccount = accountFrom.withdraw(amount + taxTransfer);

            if (resFromAccount == false) {
                result = "Origin account doesn't have enough money in its balance to transfer " + amount + " + " + taxTransfer + "$";
            } else {
                updateClient(clientFrom);
                clientTo.getSavingsAccount().setBalance(amount);
                updateClient(clientTo);
            }
        }
        return result;
    }

    public List<Client> getClients() {
        return clientList;
    }

    public Client existClient(int clientID) {
        Client result = new Client(-1, "", "", -1, 0);

        int i = 0;
        while (i < clientList.size()) {
            Client client = clientList.get(i);

            if (client.getClientID() == clientID) {
                result = client;
                i = clientList.size();
            } else {
                i++;
            }
        }
        return result;
    }

    public Client existAccount(int accountNumber) {
        Client result = new Client(-1, "", "", -1, 0);
        int i = 0;
        while (i < clientList.size()) {
            Client client = clientList.get(i);
            SavingsAccount account = client.getSavingsAccount();

            if (account.getAccountNumber() == accountNumber) {
                result = client;
                i = clientList.size();
            } else {
                i++;
            }
        }
        return result;
    }

    private void createClients() {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            Client client = new Client(i, "Nombre" + i + " Apellido" + i, "123456", i + 10, 0.0);
            clientList.add(client);
        }
    }

    private double applyTax(double amount) {
        if (amount <= 1000) {
            return amount + taxWithdrawLess1000;
        } else {
            double percentage = (amount * taxPlusPercentage) / 100;
            return amount + taxWithdrawMore1000 + percentage;
        }
    }

    private String updateClient(Client clientToBeUpdate) {
        int i = 0;
        String answer = "Client doesn't exist";
        while (i < clientList.size()) {
            Client client = clientList.get(i);

            if (client.getClientID() == clientToBeUpdate.getClientID()) {
                clientList.set(i, client);
                i = clientList.size();
                answer = "";
            } else {
                i++;
            }
        }

        return answer;
    }

}
