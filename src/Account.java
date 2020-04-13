import java.util.Date;

public class Account {
	
	public int accountNumber;
	public String openingDate;
	public double balance;
	
	public Account(int accountNumber, String openingDate, double balance) {
		this.accountNumber = accountNumber;
		this.openingDate = openingDate;
		this.balance = balance;
	}
	
	public void add(double amount) {
		balance = balance + amount;
    } 
	
	public void withdraw (double amount) {
		balance = balance - amount;
    }
	
	public double balance() {
        return balance;
    } 
	

}
 