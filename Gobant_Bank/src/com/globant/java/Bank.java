package com.globant.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {

    public String nameBank = "Globant Bank";
    public boolean status = true;
    public int codeC, getCodeClient, getBalance, newBalance, getAccountNumber, getBalance2, percentage;
    public boolean userFound = false;

    Account a1 = new Account (1100,"Feb2019",100000);
    Account a2 = new Account (2200,"Sep2019",600000);
    Account a3 = new Account (3300,"Jan2020",700000);
    Account a4 = new Account (4400,"Nov2019",200000);
    Account a5 = new Account (5500,"Feb2020",900000);
    Client c1 = new Client (1, "Pablo Perez", "pablo1", "abc", a1);
    Client c2 = new Client (2, "Maria Lopez", "maria1", "def", a2);
    Client c3 = new Client (3, "Laura Ramirez", "laura1", "ghi", a3);
    Client c4 = new Client (4, "Octavio Castro", "octavio1", "jkl", a4);
    Client c5 = new Client (5, "Alberto Romo", "alberto1", "mno", a5);


    List<Client> listC = new ArrayList<>();
    List<Account> listA = new ArrayList<>();

    public void addAandC(){
        listA.add(a1);
        listA.add(a2);
        listA.add(a3);
        listA.add(a4);
        listA.add(a5);
        listC.add(c1);
        listC.add(c2);
        listC.add(c3);
        listC.add(c4);
        listC.add(c5);
    }

    public void printAll(){
        int siz = listC.size();
        int siz1 = listA.size();
        if(siz == 0 || siz1 == 0){
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("*There is no Clients or Accounts registered* ");
            System.out.println("------------------------------------------------------------------------------------------");
        }else{
            for(int i = 0; i<listC.size(); i++){
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println(listC.get(i) + "\n");
                System.out.println("------------------------------------------------------------------------------------------");
            }
        }
    }



    public void validUser(String optionUser, String optionPass){
        for(int i = 0; i<listC.size(); i++){
            String user1 = listC.get(i).getUser();
            String pass1 = listC.get(i).getPass();
                if(Objects.equals(optionUser,user1) && Objects.equals(optionPass,pass1)){
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("Login Successful");
                    System.out.println("------------------------------------------------------------------------------------------");
                    codeC = listC.get(i).getCode();
                    status = true;
                    userFound = true;
                }
        }
        if(userFound == false){
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("User/Password are incorrect.");
            System.out.println("------------------------------------------------------------------------------------------");
            status = false;
        }
    }



    public void addMoney(int code, int money){
        for(int i = 0; i<listC.size(); i++){
            getCodeClient = listC.get(i).getCode();
            if (getCodeClient == code){
                getBalance = listC.get(i).accountClient.getBalance();
                newBalance = money + getBalance;
                listC.get(i).accountClient.setBalance(newBalance);
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("The new balance is: " + listC.get(i).accountClient.balance);
                System.out.println("------------------------------------------------------------------------------------------");
            }
        }

    }


    public void withdraw(int codeClient, int moneyWithdraw){
        if(moneyWithdraw > 1000){
            for(int i = 0; i<listC.size(); i++){
                getCodeClient = listC.get(i).getCode();
                if (getCodeClient == codeClient){
                    getBalance = listC.get(i).accountClient.getBalance();
                    if(getBalance >= moneyWithdraw){
                        percentage = (15 * moneyWithdraw)/100;
                        newBalance = getBalance - moneyWithdraw - 200 - percentage;
                        listC.get(i).accountClient.setBalance(newBalance);
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("The new balance is: " + listC.get(i).accountClient.balance);
                        System.out.println("------------------------------------------------------------------------------------------");
                    }else if (getBalance == 0){
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("There is no funds to withdraw.");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("The balance is less that the amount to withdraw.");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                }
            }
        }else {
            for(int i = 0; i<listC.size(); i++){
                getCodeClient = listC.get(i).getCode();
                if (getCodeClient == codeClient){
                    getBalance = listC.get(i).accountClient.getBalance();
                    if(getBalance >= moneyWithdraw){
                        newBalance = getBalance - moneyWithdraw - 200;
                        listC.get(i).accountClient.setBalance(newBalance);
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("The new balance is: " + listC.get(i).accountClient.balance);
                        System.out.println("------------------------------------------------------------------------------------------");
                    }else if (getBalance == 0){
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("There is no funds to withdraw.");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("The balance is less that the amount to withdraw.");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                }
            }
        }
    }

    public void transferMoney(int codeClientOrigin, int accountTransfer, int moneyTransfer){
        for(int i = 0; i<listC.size(); i++){
            getCodeClient = listC.get(i).getCode();
            if(getCodeClient == codeClientOrigin){
                getBalance = listC.get(i).accountClient.getBalance();
                if(getBalance >= moneyTransfer){
                    for(int j = 0; j<listA.size(); j++){
                        getAccountNumber = listA.get(j).getAccountNumber();
                        if(getAccountNumber == accountTransfer){
                            newBalance = moneyTransfer + 100;
                            listC.get(i).accountClient.setBalance(getBalance - newBalance);
                            getBalance2 = listA.get(j).balance;
                            listA.get(j).setBalance(getBalance2 + moneyTransfer);
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Money Transferred Successfully " + moneyTransfer);
                            System.out.println("Your new balance is: " + listC.get(i).accountClient.balance);
                            System.out.println("------------------------------------------------------------------------------------------");
                        }
                    }
                }else{
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("You don't have enough funds to transfer");
                    System.out.println("------------------------------------------------------------------------------------------");
                }
            }
        }
    }

}



