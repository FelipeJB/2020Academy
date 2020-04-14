import java.security.PublicKey;
import java.util.ArrayList;

public class Bank {
    ArrayList<Client> clients = new ArrayList<>();

    public Client findClient(int accountNumber) {
        for (Client client : clients) {
            if (client.account.accountNumber == accountNumber) {
                return client;
            }
        }
        return null;
    }

    public Client login(String user, String password) {
        for (Client client : clients) {
            if (client.user.equals(user) && client.password.equals(password)) {
                return client;
            }
        }
        return null;
    }

    public void addClient(Client client) {
        clients.add(client);
        System.out.println("Client added: " + client.name + " Id " + client.id);
    }

    public void withdraw(Client client, double amount) {

        if (amount >= 1000) {
            amount *= 1.15;
        }
        amount += 200;
        if (client.account.balance < amount) {
            System.out.println("Insufficient balance");
            return; // finish method
        }
        client.account.balance -= amount;
        System.out.println("Your current balance is: " + client.account.balance);
    }

    public void listClientInformation() {
        if (clients.isEmpty()){
            System.out.println("There is no information to display !!!");
           // return;
        }else{
            for (Client client : clients) {
                System.out.println(
                        "Name: " + client.name + " | "+
                                " ID: " + client.id + " | "+
                                " Account Number: " + client.account.accountNumber + " | " +
                                " Balance: " +  client.account.balance + " | " +
                                " Oped Date: " + client.account.openDate);
            }
        }
    }

    public void addMoney(Client client, double deposit) {
        client.account.balance += deposit;
        System.out.println("Your current balance is: " + client.account.balance);
    }

    public void transferMoney(Client client, int accountNumber, double amountTransfer) {
        Client clientDestination = findClient(accountNumber);
        if (clientDestination == null) {
            System.out.println("The destination account number does not exist ");
            return;
        }
        if (client.account.balance < amountTransfer + 100) {
            System.out.println("Insufficient balance");
            return;
        }
        client.account.balance -= amountTransfer + 100;
        clientDestination.account.balance += amountTransfer;
        System.out.println("Successful transfer to: " + " Name " + clientDestination.name + " Account "
                + clientDestination.account);
        System.out.println("Your current balance is: " + client.account.balance);
    }
}
