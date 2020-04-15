import java.util.Date;

public class Account {
	

	public Date openDate;
	public int AccountId;
	public double AccountBalance;
	
	public Account() {
		
	}
	
	public Account (Date openDate, int AccountId, double AccountBalance) {
		this.openDate = openDate;
		this.AccountId = AccountId;
		this.AccountBalance = AccountBalance;
	}
	
	public void addMoney(double amount) {
		this.AccountBalance = this.AccountBalance + amount;
	}
	
	public void withdraw (double withdrawAmount) {
		
		if(this.AccountBalance>=withdrawAmount) {
			this.AccountBalance = this.AccountBalance - withdrawAmount;
			
			if(withdrawAmount<1000) {
				this.AccountBalance = this.AccountBalance - 200;
			}
			else if(withdrawAmount>=1000) {
				this.AccountBalance = this.AccountBalance - (withdrawAmount * 0.15) - 200;
			}
		}
		else {
			System.out.println("insufficient balance");
		}
		
	}
	
	public void transfer (double transferAmount, Account destinationAccounTransfer) {
		if(this.AccountBalance>=transferAmount) {
			destinationAccounTransfer.AccountBalance=destinationAccounTransfer.AccountBalance + transferAmount;
			this.AccountBalance = this.AccountBalance - 100;
		}
		else {
			System.out.println("insufficient balance");
		}
	}

	
	

}
