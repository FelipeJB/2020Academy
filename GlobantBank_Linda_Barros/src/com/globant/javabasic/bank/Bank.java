package com.globant.javabasic.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bank {
    //
    //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private int taxWithdrawLess1000;
    private int taxWithdrawMore1000;
    private int taxPlusPercentage;
    private List<Client> clientList = new ArrayList<>();


    public Bank(int taxWithdrawLess1000, int taxWithdrawMore1000, int taxPlusPercentage) {
        this.taxWithdrawLess1000 = taxWithdrawLess1000;
        this.taxWithdrawMore1000 = taxWithdrawMore1000;
        this.taxPlusPercentage = taxPlusPercentage;
        createClients();
    }

    public double addMoney() {
        return 0.0;
    }

    public boolean withdrawMoney() {
        return true;
    }

    public boolean transferMoney() {
        return true;
    }

    public List<Client> getClients() {
        return clientList;
    }

    public String createSavingsAccount(int clientID, int accountNumber, double balance) {
        int i = 0;
        String answer = "";
        while (i < clientList.size()) {
            Client client = clientList.get(i);

            if (client.getClientID() == clientID) {
                client.addSavingsAccount(accountNumber, balance);
                clientList.set(i,client);

                i = clientList.size();
                answer = "Account successfully added to the user ID: " + clientID + " and name: " + client.getUserName();
            } else {
                i++;
            }
        }
        if (answer == "") {
            return "Client with ID: " + clientID + " doesn't exist";
        }
        return answer;
    }

    private void createClients() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            Client client = new Client(i, "Client" + i, "123456");
            clientList.add(client);
        }
    }

}
