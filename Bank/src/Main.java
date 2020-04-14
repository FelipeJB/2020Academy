import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
        int option = 0;

        while (option <= 4) {
            System.out.println(" ************************* ");
            System.out.println(" *  WELCOME TO THE BANK  * ");
            System.out.println(" ************************* ");
            System.out.println("1. Create Client");
            System.out.println("2. Transactions");
            System.out.println("3. List Client information");
            System.out.println("4. Exit");

            option = scan.nextInt();

            switch (option) {
                case 1:
                    Client person = new Client();

                    System.out.println("Enter Identification");
                    person.id = new Scanner(System.in).nextLine();
                    System.out.println("Enter Client Name");
                    person.name = new Scanner(System.in).nextLine();
                    System.out.println("Enter Client user");
                    person.user = new Scanner(System.in).nextLine();
                    System.out.println("Enter Client Password");
                    person.password = new Scanner(System.in).nextLine();
                    System.out.println("Enter Account Number");
                    person.account.accountNumber = new Scanner(System.in).nextInt();
                    person.account.openDate = LocalDateTime.now();
                    bank.addClient(person);
                    break;
                case 2:
                    System.out.println("User: ");
                    String user = new Scanner(System.in).nextLine();
                    System.out.println("Password: ");
                    String password = new Scanner(System.in).nextLine();
                    Client clientSession = bank.login(user, password);
                    if (clientSession == null) {
                        System.out.println("User or password wrong");
                        break; // finaliza switch
                    }
                    int option2 = 0;

                    while (option2 <= 4) {
                        System.out.println(" ** WELCOME TO TRANSACTIONS ** ");
                        System.out.println("1. Withdraw");
                        System.out.println("2. Add Money");
                        System.out.println("3. Transfer Money");
                        System.out.println("4. Exit");
                        option2 = scan.nextInt();

                        switch (option2) {

                            case 1:
                                System.out.println("Enter the value to withdraw ");
                                double amount = new Scanner(System.in).nextDouble();
                                bank.withdraw(clientSession, amount);
                                break;

                            case 2:
                                System.out.println("Enter the value to deposit ");
                                double deposit = new Scanner(System.in).nextDouble();
                                bank.addMoney(clientSession, deposit);
                                break;

                            case 3:
                                System.out.println("Enter the destination account number ");
                                int accountDestination = new Scanner(System.in).nextInt();
                                System.out.println("Enter the value to transfer ");
                                double amountTransfer = new Scanner(System.in).nextDouble();
                                bank.transferMoney(clientSession, accountDestination, amountTransfer);
                                break;

                            case 4:
                                System.out.println("Thank you for using our services");
                                option2 = 5;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println(" ** CLIENT INFORMATION ** ");
                    bank.listClientInformation();
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Thank you for using our services");
                    option = 5;
                    break;
            }
        }
    }
}
