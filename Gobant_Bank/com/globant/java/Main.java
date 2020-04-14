package com.globant.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // display menu1
        Scanner sc = new Scanner (System.in);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("¡Welcome to Globant Bank!");
        System.out.println("Enter the option to proceed:" + "\n1. BANK" + "\n2. CLIENT" + "\n3. EXIT");
        System.out.println("------------------------------------------------------------------------------------------");
        bank.addAandC();
        int option1 = sc.nextInt();

        // Bank
        if (option1 == 1){
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("¡Welcome Bank!");
            System.out.println("Enter the option to proceed:" + "\n1. List all clients and its information " + "\n2. EXIT");
            System.out.println("------------------------------------------------------------------------------------------");
            int optionB = sc.nextInt();
            if(optionB == 1){
                bank.printAll();
            }else {
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("See you soon. Thank you");
                System.out.println("------------------------------------------------------------------------------------------");
            }
        //Client
        }else if(option1 == 2){
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("¡Welcome Client of Globant Bank!");
            System.out.println("Please enter your username:");
            String optionUser = sc.next();
            System.out.println("Please enter your password:");
            String optionPass = sc.next();
            bank.validUser(optionUser,optionPass);
            if (bank.status == true){
                System.out.println("Enter the option to proceed:" + "\n1. ADD MONEY" + "\n2. WITHDRAW" + "\n3. TRANSFER MONEY" + "\n4. EXIT");
                System.out.println("------------------------------------------------------------------------------------------");
                int optionC = sc.nextInt();

                while(optionC > 0 && optionC < 4) {
                    switch (optionC) {
                        case 1:
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Enter the amount of money to add:");
                            System.out.println("------------------------------------------------------------------------------------------");
                            int money = sc.nextInt();
                            int code = bank.codeC;
                            bank.addMoney(code, money);

                            break;
                        case 2:
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Withdrawals tax is $200 for amounts less than $1000.");
                            System.out.println("Withdrawals of more than $1000 tax is $200 plus 15% of the amount to withdraw.");
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Enter the amount of money to withdraw:");
                            System.out.println("------------------------------------------------------------------------------------------");
                            int moneyWithdraw = sc.nextInt();
                            int codeClient = bank.codeC;
                            bank.withdraw(codeClient, moneyWithdraw);

                            break;
                        case 3:
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Transfering money to another account tax is $100.");
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Enter the amount of money to transfer:");
                            System.out.println("------------------------------------------------------------------------------------------");
                            int moneyTransfer = sc.nextInt();
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Enter the four digit account number destiny:");
                            System.out.println("------------------------------------------------------------------------------------------");
                            int accountTransfer = sc.nextInt();
                            int codeClientOrigin = bank.codeC;
                            bank.transferMoney(codeClientOrigin, accountTransfer, moneyTransfer);

                            break;
                    }
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("¡Welcome Client of Globant Bank!");
                    System.out.println("Enter the option to proceed:" + "\n1. ADD MONEY" + "\n2. WITHDRAW" + "\n3. TRANSFER MONEY" + "\n4. EXIT");
                    System.out.println("------------------------------------------------------------------------------------------");
                    optionC = sc.nextInt();
                }
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("See you soon. Thank you");
                System.out.println("------------------------------------------------------------------------------------------");
            }
        }else {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("See you soon. Thank you");
            System.out.println("------------------------------------------------------------------------------------------");
        }
    }
}
