
import java.sql.Timestamp;
import java.util.*;

public class Account {
	public int number;
	public String name;
	public String user;
	public String password;
    public double balance;
    public long date;
    public long beginTime = Timestamp.valueOf("2010-01-01 00:00:00").getTime();
    public long endTime = Timestamp.valueOf("2020-12-31 00:58:00").getTime();
    
    
    
	public Account(int number, String user, String name, String password, double balance, long date) {
		this.number = number;
		this.user = user;
		this.name = name;
		this.balance = balance;
		this.date = getDateRandom();
	}
	
	public void setBalance(double balance) {
        this.balance = balance;
    }
	
	public long getDateRandom() {		
	    long diff = endTime - beginTime + 1;
	    return beginTime + (long) (Math.random() * diff);
	}
}
