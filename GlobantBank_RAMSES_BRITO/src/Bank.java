import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Account Account = new Account();
		
		List<User> users = new ArrayList<>();
		users.add(new User("Jose","joseito1", "12345", new Account (new Date(),1,50000)));
		users.add(new User("Maria","Maria1", "12345", new Account (new Date(),2,100000)));
		users.add(new User("Alejandro","Aleajndrit0", "12345", new Account (new Date(),3,100)));
		users.add(new User("Marta","martamar", "12345", new Account (new Date(),4,300000)));
		users.add(new User("Luis","lucho98", "12345", new Account (new Date(),5,5000000)));

		Scanner sn = Scanner(System.in);
		boolean exit = false;
		int option;
		
		while(!exit) {
			
			 System.out.println("Choose an option");
			 System.out.println("1. Show users");
			 System.out.println("2. Add money");
			 System.out.println("3. Withdrwa money");
			 System.out.println("4. Transfer");
			 System.out.println("3. Exit");
			 option = sn.nextInt();	         
			 
			 switch (option) {
			 case 1:
				 for (int i = 0; i < users.size(); i++) {
					 System.out.println("Name: " + users.get(i).name + "User name: " + users.get(i).userName 
							 + "Account ID: " + users.get(i).accountId);
				 }
					
				 break;
				 
			 case 2: 
				 System.out.println("Insert amount to add");
				 int money = sn.nextInt();
				 Account.addMoney(money);
				System.out.println("Current money " + Account.AccountBalance);
				break;
				
			 case 3: 
				 System.out.println("Withdraw: ");
				 int amount = sn.nextInt();
				 Account.withdraw(amount);
				System.out.println("Current money " + Account.AccountBalance);
				break; 
			 }
		}
        
	}

	


	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
