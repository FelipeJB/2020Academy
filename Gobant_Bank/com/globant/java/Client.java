package com.globant.java;

public class Client {

    public int codeClient;
    public String nameClient;
    public String user;
    public String password;
    public Account accountClient;

    //Constructor to initialize atributes
    public Client(int codeClient, String nameClient, String user, String password, Account a){
        this.codeClient = codeClient;
        this.nameClient = nameClient;
        this.user = user;
        this.password = password;
        this.accountClient = a;
    }

    public String getUser() { return user;}
    public String getPass() { return password;}
    public int getCode() { return codeClient;}


    public String toString(){
        return "Code Client = " + codeClient + ", Client Name = " + nameClient + ", User = " + user + "\n, Account Data: " + accountClient;
    }


}
