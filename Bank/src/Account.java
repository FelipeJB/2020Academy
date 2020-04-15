import java.util.*;

public class Account {
	
	public String accountType;
	public int accountNumber;
	public double balance;
	public Date openingDate;
	public int idClient;
	
	
	public Account create(String _accountType, int _accountNumber, double _balance, Date _openingDate, int _idClient) {
		Account newAccount = new Account();
		newAccount.accountType = _accountType;
		newAccount.accountNumber = _accountNumber;
		newAccount.balance = _balance;
		newAccount.openingDate = _openingDate;
		newAccount.idClient = _idClient;
		
		return newAccount;
		
	}
	

}
