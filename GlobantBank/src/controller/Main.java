package controller;

import entities.Account;
import entities.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User admin = new User();
        admin.setUserName("admin");
        admin.setPassword("1234");
        Users.addPerson(admin);

        Account account1 = new Account();
        User user1 = new User();
        user1.setUserName("johky");
        user1.setPassword("1234");
        user1.setName("John Parra");
        account1.setAccountNumber(123456789);
        account1.setOpeningDate("apr-15-2019");
        user1.setAccount(account1);
        Users.addPerson(user1);

        Account account2 = new Account();
        User user2 = new User();
        user2.setUserName("jparra");
        user2.setPassword("1234");
        user2.setName("Juan Parra");
        account2.setAccountNumber(456789);
        account2.setOpeningDate("apr-14-2010");
        user2.setAccount(account2);
        Users.addPerson(user2);


        User user = new User();
        Account account = new Account();
        Transactions transaction = new Transactions();
        Scanner menu = new Scanner(System.in);
        boolean exit = false;
        int opcion = 0;
        while (!exit) {
            System.out.println("Welcome select your option:");
            System.out.println("1. Log in");
            System.out.println("2. Admin");
            System.out.println("3. Exit");

            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    Scanner userInformation = new Scanner(System.in);
                    System.out.println("Insert Username:");
                    String userName = userInformation.nextLine();
                    System.out.println("Insert Password:");
                    String userPassword = userInformation.nextLine();
                    if (Users.validateUser(userName, userPassword)) {
                        user = Users.getUserByUsername(userName);
                        System.out.println("Welcome " + user);
                        Scanner menuUsers = new Scanner(System.in);
                        boolean exitUsers = false;
                        int optionUsers = 0;
                        while (!exitUsers) {
                            System.out.println("1. Balance");
                            System.out.println("2. Add Money");
                            System.out.println("3. Withdraw");
                            System.out.println("4. Transfer");
                            System.out.println("5. Back to main menu");

                            optionUsers = menuUsers.nextInt();


                            switch (optionUsers) {

                                case 1:
                                    System.out.println("Your current balance is: " + user.getAccount().getBalance());
                                    break;
                                case 2:
                                    System.out.println("Amount to add");
                                    double amountToAdd = Double.parseDouble(userInformation.nextLine());
                                    transaction.addMoney(user.getAccount(), amountToAdd);
                                    System.out.println("Your new balance is: " + user.getAccount().getBalance());
                                    break;
                                case 3:
                                    System.out.println("Amount to withdraw");
                                    double amountToRetrieve = Double.parseDouble(userInformation.nextLine());
                                    if(transaction.withdraw(user.getAccount(), amountToRetrieve)) {
                                        System.out.println("Your $" + amountToRetrieve + " withdraw was succesfully" +"\nThe transaction cost: "+ "\nYour new balance is : " + user.getAccount().getBalance());
                                    }
                                    else {
                                        System.out.println("your transaction was declined, please try again \n Insufficient funds");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Username account destiny:");
                                    String userNameDestiny = userInformation.nextLine();
                                    if (Users.searchAccountToTransfer(userNameDestiny)) {
                                        user1 = Users.getUserByUsername(userNameDestiny);
                                        System.out.println("Amount to transfer");
                                        double amountToTransfer = Double.parseDouble(userInformation.nextLine());
                                        if (transaction.transfer(user.getAccount(), user1.getAccount(), amountToTransfer)) {
                                            System.out.println("Your $" + amountToTransfer + " transfer to" + user1.getUserName() + "Account number:" + user1.getAccount().getAccountNumber() + "was succesfully" + "\nYour new balance is" + user.getAccount().getBalance());
                                        } else {
                                            System.out.println("your transaction was declined, please try again \n Insufficient funds");
                                        }

                                    } else {
                                        System.out.println("your transaction was declined, please try again \n user to transfer not found");
                                    }
                                    break;
                                case 5:
                                    exitUsers = true;
                                    break;

                                default:
                                    System.out.println("Just numbers between 1 and 5");
                            }

                        }

                    } else {
                        System.out.println("User not valid");
                    }
                    break;
                case 2:
                    Scanner adminInformation = new Scanner(System.in);
                    System.out.println("Insert Admin Username:");
                    String adminUser = adminInformation.nextLine();
                    System.out.println("Insert Password:");
                    String adminPassword = adminInformation.nextLine();
                    if (Users.validateUser(adminUser, adminPassword)) {

                        System.out.println("Welcome");
                        Scanner menuAdmin = new Scanner(System.in);
                        boolean exitAdmin = false;
                        int optionAdmin = 0;
                        while (!exitAdmin) {
                            System.out.println("1. Print All Data Base");
                            System.out.println("2. Add People");
                            System.out.println("3. Delete People");
                            System.out.println("4. Exit");

                            optionAdmin = menuAdmin.nextInt();


                            switch (optionAdmin) {

                                case 1:
                                    System.out.println("The whole person list is: ");
                                    Users.displayDataBase();
                                    break;
                                case 2:
                                    Scanner newUserInformation = new Scanner(System.in);
                                    System.out.println("Insert first and last name: ");
                                    String names = newUserInformation.nextLine();
                                    user.setName(names);
                                    System.out.println("Insert user name: ");
                                    String newUserName = newUserInformation.nextLine();
                                    user.setUserName(newUserName);
                                    System.out.println("Insert password: ");
                                    String newPassword = newUserInformation.nextLine();
                                    user.setPassword(newPassword);
                                    System.out.println("Insert number account: ");
                                    double newNumberAccount = Double.parseDouble(newUserInformation.nextLine());
                                    account.setAccountNumber(newNumberAccount);
                                    System.out.println("Insert opening date: ");
                                    String newOpeningDate = newUserInformation.nextLine();
                                    account.setOpeningDate(newOpeningDate);
                                    user.setAccount(account);
                                    Users.addPerson(user);
                                    break;
                                case 3:
                                    Scanner userInformationDelete = new Scanner(System.in);
                                    System.out.println("Insert user name: ");
                                    String userNameDelete = userInformationDelete.nextLine();
                                    Users.deletePerson(userNameDelete);
                                    break;
                                case 4:
                                    exitAdmin = true;
                                    break;
                                default:
                                    System.out.println("Just numbers between 1 and 4");

                            }

                        }
                    } else {
                        System.out.println("User name and password are incorrect");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Just numbers between 1 and 3");
            }
        }
    }
}