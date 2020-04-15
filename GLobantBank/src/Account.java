
public class Account {

	String user;
	String pass;
    int accountNum;      
    String OpenDate;
    int balance;
    
    public Account(String user,	String pass,  int accountNum, String OpenDate,  int balance ) {
    	this.user=user;
    	this.pass=pass;
    	this.accountNum=accountNum;      
    	this.OpenDate=OpenDate;
    	this.balance=balance;
    	
    }
    
    public String getUser() {
		return user;
	}
    public int getAccountNum() {
		return accountNum;
	}
    public int getBalance() {
		return balance;
	} 
    public String getOpenDate() {
		return OpenDate;
	}
    public String getPass() {
		return pass;
	}
    
    public void setBalance(int balance) {
		this.balance = this.balance-balance;
	}
    public void setAddBalance(int balance) {
		this.balance = this.balance+balance;
	}
    
    
    
}
