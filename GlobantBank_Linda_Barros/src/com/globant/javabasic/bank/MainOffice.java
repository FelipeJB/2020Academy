package com.globant.javabasic.bank;

import java.util.List;
import java.util.Scanner;

public class MainOffice {
    public static Scanner scanner = new Scanner(System.in);
    public static int action;
    public static int whileAction;
    public static Bank bank = new Bank(200, 200, 15, 100);

    public static void main(String[] args) {
        System.out.println("**** Welcome to Main Office Bank ****");
        System.out.println("**** This are our clients, Which one is you?");
        ListClients(bank.getClients());
        System.out.println("Enter the Client ID:");
        action = scanner.nextInt();
        Client client = bank.existClient(action);
        whileAction = 1;

        if (client.getClientID() < 0) {
            System.out.println("The Client ID doesn't exist");
        } else {
            System.out.println("Welcome " + client.getUserName() + "!!");

            while (whileAction == 1) {
                System.out.println("What kind of transactions do you want to do?");
                System.out.println("Press 1: For Add money to your account");
                System.out.println("Press 2: To withdraw money from your account");
                System.out.println("Press 3: If you want to transfer money to another account");
                System.out.println("Press 4: If you want to see client's list");
                action = scanner.nextInt();
                if (action > 4) {
                    System.out.println("Wrong code");
                } else {
                    doTransaction(action, client);
                }
                System.out.println("Do you want to continue in the bank?");
                System.out.println("Press 1: to continue");
                whileAction = scanner.nextInt();
            }
        }
        System.out.println("Have a good day!, come back soon :-) ");
        System.exit(0);
    }

    //                    System.exit(0);
    public static void ListClients(List<Client> clientList) {
        for (Client client : clientList) {
            double balance = client.getSavingsAccount().getBalance();
            String strClient = "ID: " + client.getClientID() + "; Account Number: " + client.getSavingsAccount().getAccountNumber() + "; Balance: " + balance + "; Name: " + client.getUserName() + "; Password: " + client.getPassword();
            System.out.println("** " + strClient);
        }
    }

    public static void doTransaction(int transaction, Client client) {
        double amount = 0.0;
        double balance;
        String answer = "";

        switch (transaction) {
            case 1:
                System.out.println("Enter the amount you want to add to your account");
                amount = scanner.nextDouble();
                balance = bank.addMoney(client, amount);
                System.out.println("Your Balance is: " + balance);
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw from your account");
                amount = scanner.nextDouble();
                answer = bank.withdrawMoney(client, amount);
                balance = client.getSavingsAccount().getBalance();

                if (answer == "") {
                    System.out.println("We're sorry, your balance is lower than the amount you want to withdraw.");
                    System.out.println("Your balance is: " + balance);
                } else {
                    System.out.println("Successful transaction!, your balance is: " + answer);
                }
                break;
            case 3:
                int account;
                System.out.println("Enter the account number you want to transfer");
                account = scanner.nextInt();
                System.out.println("Enter the amount you want to transfer");
                amount = scanner.nextInt();

                Client clientTo = bank.existAccount(account);

                if (clientTo.getClientID() < 0) {
                    System.out.println("Wrong Account Number");
                } else {
                    answer = bank.transferMoneyToAccount(client, amount, clientTo);

                    if (answer.isEmpty()) {
                        balance = client.getSavingsAccount().getBalance();
                        System.out.println("Transfer successful!, your balance is: " + balance);
                    } else {
                        System.out.println(answer);
                    }
                }
                break;
            case 4:
                ListClients(bank.getClients());
                break;
        }
    }
}
