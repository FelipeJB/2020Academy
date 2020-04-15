package org.globant.java.basic.bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Scanner scan = new Scanner(System.in);

    public static int selectOption() { // Action selection
        int option;
        option = Main.scan.nextInt();
        return option;
    }
    public static void menu() {  // Options
        System.out.println("Welcome to the GlowBank");
        System.out.println("what do you want to do?");
        System.out.println("1 My GlowBank account");
        System.out.println("2 GlowBank Shower");
        System.out.println("3 Rules and Taxes");
        System.out.println("4 Exit");
    }
    public static void menu2(){
        System.out.println("GlowBank Inc");
        System.out.println("Enter the User");
    }
    public static void menu3(){
        System.out.println("GlowBank Inc");
        System.out.println("Enter the Password");
    }
    public static void menu4(){
        System.out.println("GlowBank Inc");
        System.out.println("what do you want to do?");
        System.out.println("1 Add Money");
        System.out.println("2 Withdraw Money");
        System.out.println("3 Transfer Money");
        System.out.println("4 Exit");
    }

    public static void main(String[] args) {
        int option=1;
        String password;
        int size=0;
        int i;
        int search;
        int searchn;
        String user;
        boolean valid;
        int cash;
        int accountn;
        int valor;
        Scanner in = new Scanner(System.in);

        List<Client> client = new ArrayList();
        List<Account> account= new ArrayList();
        //Datos iniciales
            client.add(new Client(0,12,"Fredy","fredy"));
            account.add(new Account(0,200000,"1212"));
            client.add(new Client(1,12,"Fredy","alex"));
            account.add(new Account(1,100000,"1213"));
            client.add(new Client(2,12,"Fredy","julio"));
            account.add(new Account(2,50000,"1214"));
            client.add(new Client(3,12,"Fredy","cesar"));
            account.add(new Account(3,25000,"1215"));
            client.add(new Client(4,12,"Fredy","laura"));
            account.add(new Account(4,10000,"1216"));

while (option!=4) {
    menu();
    option = in.nextInt();
    switch (option) {

        case 1:
            //Lectura de usuario

            menu2();
            in = new Scanner(System.in);
            user = in.nextLine();

            //Validacion de Existencia de usuario.
            size = client.size();
            i = 0;
            valid = false;
            search = 0;
            while (i < size) {
                if (client.get(i).user.equals(user)) {
                    search = i;
                    i = size;
                    valid = true;
                    System.out.println("Entro al true");
                } else {
                    i = i + 1;
                }
            }

            if (valid == true) {
                //Lectura de password
                menu3();
                in = new Scanner(System.in);
                password = in.nextLine();
                i = 0;
                valid = false;

                if (account.get(search).password.equals(password)) {
                    //Usuario y password Correcto.
                    menu4();
                    in = new Scanner(System.in);
                    option = in.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Cuanto Dinero desea Depositar");
                            in = new Scanner(System.in);
                            cash = in.nextInt();
                            cash = account.get(search).cash + cash;
                            account.get(search).cash = cash;
                            System.out.println("pille el valor" + account.get(search).cash);
                            break;
                        case 2:
                            System.out.println("Cuanto Dinero desea Retirar");
                            in = new Scanner(System.in);
                            cash = in.nextInt();
                            valor = 0;
                            if (cash > 1000) {
                                valor = cash + cash * 100 / 15 + 200;
                            } else {
                                valor = cash + 200;
                            }
                            if (account.get(search).cash >= valor) {

                                if (cash <= 1000) {
                                    account.get(search).cash = account.get(search).cash - cash - 200;
                                    System.out.println("Saldo Menos este retiro:\t" + account.get(search).cash);
                                } else {
                                    account.get(search).cash = account.get(search).cash - cash - 200 - cash * 15 / 100;
                                    System.out.println("Saldo Menos este retiro:\t" + account.get(search).cash);
                                }


                            } else {
                                System.out.println("Fondos Insuficientes");
                            }

                            break;
                        case 3:
                            System.out.println("Numero de cuenta destino");
                            in = new Scanner(System.in);
                            accountn = in.nextInt();
                            valid = false;
                            size = account.size();
                            i = 0;
                            while (i < size) {
                                if (account.get(i).account == accountn) {
                                    i = size;
                                    valid = true;
                                } else {
                                    i = i + 1;
                                }
                            }
                            if (valid == true) {
                                System.out.println("Cuanto Dinero desea Transferir");
                                in = new Scanner(System.in);
                                cash = in.nextInt();
                                if (account.get(search).cash >= cash + 100) {
                                    account.get(search).cash = account.get(search).cash - cash - 100;
                                    account.get(accountn).cash = account.get(accountn).cash + cash;
                                    System.out.println("Saldo Menos este trasferencia:\t" + account.get(search).cash);
                                    System.out.println("Saldo cuenta destino:\t" + account.get(accountn).cash);
                                    System.out.println("Saldo Menos este validando cero:\t" + account.get(0).cash);
                                } else {
                                    System.out.println("Fondos Insuficientes");
                                }


                            } else {
                                System.out.println("La cuenta solicitada no Existe");
                            }

                            break;
                        default:
                            break;


                    }


                } else {
                    System.out.println("The password is Incorrect");
                }
            } else {
                System.out.println("The User does not exist in the bank");
            }


            break;

        case 2:
            size = client.size();
            i = 0;
            while (i < size) {
                System.out.println("--------------------------------------------------------------------|");
                System.out.println(" Codigo / Identificacion /  Nombre  /     Usuario      / Dinero" + "\t\t|");
                System.out.println("\t" + client.get(i).code + "\t\t\t" + client.get(i).identification + "\t\t\t" + client.get(i).name + "\t\t" + client.get(i).user + "\t\t" + account.get(i).cash + "\t\t|");
                i = i + 1;
            }
            System.out.println("--------------------------------------------------------------------|");
            break;
        case 3:
            System.out.println("Terms,Conditions and Rules");
            System.out.println("-Some transactions are taxed the following way:");
            System.out.println("-Withdrawals tax is $200 for amounts less than $1000. Withdrawals ");
            System.out.println(" of more than $1000 tax is $200 plus 15% of the amount to withdraw.");
            System.out.println("-Adding money to the account does not have any cost.");
            System.out.println("-Transfering money to another account tax is $100.");
            break;
        default:
            System.out.println("Gracias por Visitar Glowbank");
            break;

    }


     }
    }
}
