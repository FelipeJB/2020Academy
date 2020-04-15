import java.util.*;

public class Transaction {
	
	private double transactionLimit = 1000;
	private double withdrawTax = 200; 
	private double transferTax = 100;
	private double plusPercent = 0.15;
	
	//Metodo agregar dinero
	public List<Account> addMoney (List<Client> _clients, List<Account> _accounts) {
		int clientIndex = validateIdClient(_clients);		
		int accountIndex = validateAccountNumber(_accounts);
		
		if(clientIndex >= 0) {
			if (accountIndex >= 0) {
				System.out.println("Enter the amount you want to add: ");
				Scanner scan1 = new Scanner(System.in);
				double balance = scan1.nextDouble();
				_accounts.get(accountIndex).balance += balance;
				System.out.println("Successfully added, your new balance is: "+_accounts.get(accountIndex).balance);				
			}
		}		
		
		return _accounts;
		
	}
	
	//Metodo retirar dinero
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
					System.out.println("successful Withdraw. Your new balance is: "+_accounts.get(accountIndex).balance);
				}
				else {
					System.out.println("Not enough money!");
				}
			
			}		
		}
		return _accounts;
	}
	
	//Metodo transferir dinero
	public List<Account> transfer (List<Account> _accounts, List<Client> _clients){
		int clientIndex = validateIdClient(_clients);		
		int accountIndex = validateAccountNumber(_accounts);
		
		if(clientIndex >= 0) {
			if (accountIndex >= 0) {
				System.out.println("Enter the amount to transfer: ");
				Scanner scan2 = new Scanner(System.in);				
				int transferValue = scan2.nextInt();
				double balance = _accounts.get(accountIndex).balance;
				balance = balance-transferTax;
				
				
				if (balance>=transferValue) {
					
					System.out.println("Enter the destination account info");
					int clientDestIndex = validateIdClient(_clients);		
					int accountDestIndex = validateAccountNumber(_accounts);
					
					if(clientDestIndex >= 0 && clientDestIndex != clientIndex) {
						if (accountDestIndex >= 0) {
							_accounts.get(accountIndex).balance = balance - transferValue ;
							_accounts.get(accountDestIndex).balance += transferValue;
							System.out.println("Successfully transfered, your new balance is: "+_accounts.get(accountIndex).balance);
						}
					}
					else {
						System.out.println("Transaction not allowed, destination account same as origin account");
					}
				}
				else {
					System.out.println("Not enough money!");
				}
			
			}		
		}
		return _accounts;
	}
	
	//Metodo para validar si la cuenta existe
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
		if(index < 0) {
			System.out.println("This account number does not exist");
		}
		
		return index;
	}
	
	//Metodo para validar si el cliente existe
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
		if(index < 0) {
			System.out.println("This client ID does not exist");
		}
		
		return index;
	}
}
