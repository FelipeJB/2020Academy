package GlobantBank;

public class Account {
	private String dni;
	private String accountNumber;
	private String openingDate;
	private String balance;

	private String user;
	private String password;

	
	
	public Account(String dni, String accountNumber, String openingDate, String balance, String user, String password) {
		this.dni = dni;
		this.accountNumber = accountNumber;
		this.openingDate = openingDate;
		this.balance = balance;
		this.user = user;
		this.password = password;
	}
	
	public Account(String dni, String accountNumber, String openingDate, String balance) {
		this.dni = dni;
		this.accountNumber = accountNumber;
		this.openingDate = openingDate;
		this.balance = balance;
	}

	
	public Account(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	


	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	public String printAccountClient () {
		return "Dni:  "+dni+"  AccountNumber:  "+accountNumber+"  OpeningDate: "+openingDate+"  balance: "+balance ;
	}
	
	public String toString () {
		return "Dni:  "+dni+"  AccountNumber:  "+accountNumber+"  OpeningDate: "+openingDate+"  balance: "+balance ;
	}
	
}
