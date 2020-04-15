import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double totalAccount;
		double deposit;
		double ammounToWithdraw;
		double ammounToTransfer;
		double tax;
		int option;
		
		Account account = new Account(112233, "01-01-2015", 2000);
		Account account1 = new Account(112244, "01-10-2016", 3000);
		Account account2 = new Account(112255, "01-10-2017", 4000);
		
		Client client = new Client(account.accountNumber, "Martha Restrepo", 12345);
		Client client1 = new Client(account1.accountNumber, "Andres Osorio", 12346);
		Client client2 = new Client(account2.accountNumber, "Alejando Alzate", 12347);
		
		System.out.println("Clients Information: ");
		System.out.println("- First Name & Last Name: " + client.user + ", Account Number " + client.accountNumber + ", Balance: " + account.balance);
		System.out.println("- First Name & Last Name: " + client1.user + ", Account Number " + client1.accountNumber + ", Balance: " + account1.balance);
		System.out.println("- First Name & Last Name: " + client2.user + ", Account Number " + client2.accountNumber + ", Balance: " + account2.balance);
		
		System.out.println("-----------------------------------");
		System.out.println("Select an option:");
		System.out.println("1. Print the balance");
		System.out.println("2. Make a withdraw");
		System.out.println("3. Add Money");
		System.out.println("4. Make a transfer");
		System.out.println("5. Exit");
		System.out.println("-----------------------------------");
		option = scanner.nextInt();
				
		switch (option) {
        case 1:
        	System.out.println("-----------------------------------");
        	totalAccount = account.balance;
    		System.out.println("The balanace in the account " + client.accountNumber +" with openning date " + account.openingDate + " is: " + totalAccount );
    		System.out.println("-----------------------------------");
            break;
        case 2:
        	System.out.println("-----------------------------------");
    		System.out.println("Enter the value to withdraw from the account: " +account.accountNumber);
    		ammounToWithdraw = scanner.nextDouble();
    		if(ammounToWithdraw < 1000) {
    			System.out.println("The tax is 200");
    			tax = 200;
    			account.balance = account.balance - tax;
    			account.withdraw(ammounToWithdraw);
        		System.out.println("The balanace in the account " + account.accountNumber +" with openning date " + account.openingDate + " is: " + account.balance);
        		System.out.println("-----------------------------------");
    		}else {
    			tax = (((ammounToWithdraw * 0.15) / 100) + 200);
    			System.out.println("The tax is: " + tax);
    			account.balance = account.balance - tax;
    			account.withdraw(ammounToWithdraw);
        		System.out.println("The balanace in the account " + account.accountNumber +" with openning date " + account.openingDate + " is: " + account.balance);
        		System.out.println("-----------------------------------");
    		}
            break;
        case 3:
        	System.out.println("-----------------------------------");
    		System.out.println("Enter the deposit:");
    		deposit = scanner.nextDouble();
    		account.add(deposit);
    		System.out.println("The balanace in the account " + account.accountNumber +" with openning date " + account.openingDate + " is: " + account.balance);
    		System.out.println("This transaction does not have any cost");
    		System.out.println("-----------------------------------");
            break;
        case 4:
        	System.out.println("----------------------------------");
    		System.out.println("Enter the amount to transfer from account " + account1.accountNumber + " with a balance of " + account1.balance + " to Account " + account.accountNumber + " with a balance of " + account.balance);
    		ammounToTransfer = scanner.nextDouble();
    		System.out.println("Transfering money to another account has a cost of 100");
			tax = 100;
			account1.balance = ((account1.balance - tax) - ammounToTransfer);
			System.out.println("The balanace in the account " + account1.accountNumber +" with openning date " + account1.openingDate + " after making the transfer is: " + account1.balance);
    		account.balance = account.balance + ammounToTransfer;
    		System.out.println("The balanace in the account " + account.accountNumber + " with openning date " + account.openingDate + " after making the transfer is: " + account.balance);
    		System.out.println("-----------------------------------");
        	break;
        case 5:
        	System.out.println("-----------------------------------");
    		System.out.println("You left. Thank you for using the service!");
    		System.out.println("-----------------------------------");
        	break;
		}
		
	}

}
