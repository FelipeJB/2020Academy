import java.util.*;

public class Transaction {
	
	private double transactionLimit = 1000;
	private double withdrawTax = 200; 
	private double transferTax = 100;
	private double plusPercent = 0.15;
	
	public List<Account> addMoney (List<Client> _clients, List<Account> _accounts) {
		int clientIndex = validateIdClient(_clients);		
		int accountIndex = validateAccountNumber(_accounts);
		
		if(clientIndex >= 0) {
			if (accountIndex >= 0) {
				System.out.println("Enter the amount you want to add: ");
				Scanner scan1 = new Scanner(System.in);
				double balance = scan1.nextDouble();
				_accounts.get(accountIndex).balance += balance;
				System.out.println("Successfully added, your new balance is: "+balance);				
			}
		}		
		
		return _accounts;
		
	}
	
	public List<Account> withdraw (List<Account> _accounts, List<Client> _clients){
		int clientIndex = validateIdClient(_clients);		
		int accountIndex = validateAccountNumber(_accounts);
		
		if(clientIndex >= 0) {
			if (accountIndex >= 0) {
				System.out.println("Enter the amount to withdraw: ");
				Scanner scan2 = new Scanner(System.in);
				int withdrawValue = scan2.nextInt();
				double balance = _accounts.get(accountIndex).balance;
				
				if(withdrawValue>=transactionLimit) {
					
					balance = balance-(withdrawValue*plusPercent)-withdrawTax;
				}
				
				else {
					balance = balance-withdrawTax;
				}
				
				if (balance>=withdrawValue) {
					_accounts.get(accountIndex).balance = balance - withdrawValue;
				}
				else {
					System.out.println("Not enough money!");
				}
			
			}		
			else {
				System.out.println("This account number does not exist");
			}
		}
		else {
			System.out.println("This client ID does not exist");
		}
		return _accounts;
	}
	
	public List<Account> transfer (List<Account> _accounts, List<Client> _clients){
		int clientIndex = validateIdClient(_clients);		
		int accountIndex = validateAccountNumber(_accounts);
		
		if(clientIndex >= 0) {
			if (accountIndex >= 0) {
				System.out.println("Enter the amount to transfer: ");
				Scanner scan2 = new Scanner(System.in);
				
				
				//aqui tengo que colocar la logica de transfer
				
				int withdrawValue = scan2.nextInt();
				double balance = _accounts.get(accountIndex).balance;
				
				if(withdrawValue>=transactionLimit) {
					
					balance = balance-(withdrawValue*plusPercent)-withdrawTax;
				}
				
				else {
					balance = balance-withdrawTax;
				}
				
				if (balance>=withdrawValue) {
					_accounts.get(accountIndex).balance = balance - withdrawValue;
				}
				else {
					System.out.println("Not enough money!");
				}
			
			}		
			else {
				System.out.println("This account number does not exist");
			}
		}
		else {
			System.out.println("This client ID does not exist");
		}
		return _accounts;
	}
	
	private int validateAccountNumber(List<Account> _accounts) {
		System.out.println("Enter account number: ");
		Scanner scan = new Scanner(System.in);
		int accountNumber = scan.nextInt();
		int index = -1;
		for(int i = 0; i < _accounts.size(); i++) {
			if (accountNumber == _accounts.get(i).accountNumber) {
				index = i;
			}
		}
		if(index >= 0) {
			System.out.println("This account number does not exist");
		}
		
		return index;
	}
	
	private int validateIdClient(List<Client> _clients) {
		System.out.println("Enter client ID: ");
		Scanner scan = new Scanner(System.in);
		int idClient = scan.nextInt();
		int index = -1;
		for(int i = 0; i < _clients.size(); i++) {
			if (idClient == _clients.get(i).id) {
				index = i;
			}
		}
		if(index >= 0) {
			System.out.println("This client ID does not exist");
		}
		
		return index;
	}
}
