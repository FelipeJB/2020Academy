import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Account> users = new ArrayList<Account>();
		
		Scanner read = new Scanner(System.in);
		int opc = 0;
		int count = 0;
		
		while(opc != 4) {
			System.out.println("----------------------------------------" );
			System.out.println("           Welcome to the Globant Bank" );
			System.out.println("----------------------------------------" );
			System.out.println("Please choose one option: "
					+ "\n1.Do create a new account?"
					+ "\n2.Do you want list all users?"
					+ "\n3.Do you want login on your account?"
					+ "\n4.Exit?");
			opc = read.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("----------------------------------------" );
				System.out.println("             Please fill the following information about the new user: ");
				System.out.println("Please enter the name complete of the user: ");
				String name = read.next();
				System.out.println("Please enter the nickname of user: ");
				String user = read.next();
				System.out.println("Please enter the password: ");
				String password = read.next();
				System.out.println("Please enter the new balance: ");
				double balance = read.nextDouble();
				int number = count + 0001;	
				long date = users.get(count).getDateRandom();
				
				users.add(new Account(number, user, name, password, balance, date));
				
				count = count + 1;					
				break;
			case 2:
				if(users.size() != 0) {
					for(int i = 0;i < users.size() ;i++) {
						System.out.println("Products: \n" +
								"----------------------------- \n" 
								+ "Number account: : " + users.get(i).name
								+ "\nNombre: : " + users.get(i).name
								+ "\nUsuario: " +  users.get(i).user 
								+ "\nPassword: " +  users.get(i).password
								+ "\nBalance: " + users.get(i).balance 
								+ "\nOpening date: " + users.get(i).date);
					}
				}else {
					System.out.println("Do not exist users registered");
				}			
				break;
				case 3:
					System.out.println("Please enter the username: ");
					String username = read.next();
					System.out.println("Please enter the password: ");
					String pass = read.next();
					if(users.contains(username)) {
						int in = users.indexOf(username);
						if(users.get(in).password == pass) {
							while(opc != 3) {
								System.out.println("----------------------------------------" );
								System.out.println("           Welcome " + users.get(in).name );
								System.out.println("----------------------------------------" );
								System.out.println("Please choose one option: "
										+ "\n1.Do you want add money to your saving account?"
										+ "\n2.Do you want transfer money to another account?"
										+ "\n3.Exit?");
								opc = read.nextInt();
								
								switch(opc) {
								case 1:
									break;
							}
						}else {
							System.out.println("The password is incorrect");
						}
					} else {
						System.out.println("The username don't exist");
					}
					break;
		}	
	}		
	}

}
