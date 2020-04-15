import java.sql.Timestamp;
import java.util.*;
public class Main {
    
	public static void main(String[] args) {
		List<Account> users = new ArrayList<Account>();
		List<Transactions> tran = new ArrayList<Transactions>();
		
		Scanner read = new Scanner(System.in);
		int opc = 0;
		int opc2 = 0;
		int count = 0;
		int count2 = 0;
		int idt;
		int id_user;
		String type;
		double value_tax;
		double total;
		
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
				System.out.println("Please enter the username: ");
				String user = read.next();				
				System.out.println("Please enter the password: ");
				String password = read.next();
				System.out.println("Please enter the opening date: ");
				System.out.println("	Please enter the day: ");
				int day = read.nextInt();
				System.out.println("	Please enter the month: ");
				int month = read.nextInt();
				System.out.println("	Please enter the year: ");
				int year = read.nextInt();
				double balance = 0;
				int number = count + 1;	
				String date = day + "/" + month + "/" + year;
				
				users.add(new Account(number, name, user, password, balance, date));
				System.out.println("The user account is successfully created");
				System.out.println("Welcome " + name );
				System.out.println("To make operations or transactions with your account, please log in");
				count = count + 1;					
				break;
			case 2:
				if(users.size() != 0) {
					for(int i = 0;i < users.size() ;i++) {
						System.out.println("Accounts: \n" +
								"----------------------------- \n" 
								+ "Number account: : " + users.get(i).number
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
					boolean exist = false;
					int in =  -1;
					for(int j = 0;j < users.size() ;j++){
						if(users.get(j).user.equals(username)) {
							exist = true;
							in = j;
						}else {
							exist = false;
						}
					}
					
					if(exist) {
						if(users.get(in).password.equals(pass)) {
							while(opc2 != 5) {
								System.out.println("----------------------------------------" );
								System.out.println("           Welcome " + users.get(in).name );
								System.out.println("----------------------------------------" );
								System.out.println("Please choose one option: "
										+ "\n1.Do you want to add money to your saving account?"
										+ "\n2.Do you want to transfer money to another account?"
										+ "\n3.Do you want to withdraw momey of his account?"
										+ "\n4.Do you want to see the history of your transactions?"
										+ "\n5.Exit?");
								opc2 = read.nextInt();
								
								switch(opc2) {
									case 1:
										System.out.println("Your actual balance is: " + users.get(in).balance);
										System.out.println("How much money do you want to add to your account? ");
										double money = read.nextDouble();
										
										users.get(in).setBalance(users.get(in).balance + money);
										idt = count2;
										id_user = in + 1;
										type = "Transfer";
										value_tax = 0;										
										total = money;
										tran.add(new Transactions(idt, id_user, type, value_tax, total));
										System.out.println("Transaction successful");
										count2 = count2 + 1;
										break;
										
									case 2:
										System.out.println("Your actual balance is: " + users.get(in).balance);
										System.out.println("How much money do you want to transfer? ");
										double money_transfer = read.nextDouble();
										value_tax = 100;
										total = money_transfer + value_tax;
										if(total < users.get(in).balance) {
											System.out.println("Please enter the number of account  of the person that you want to transfer");
											int n = read.nextInt();
											int pt = -1;
											boolean exist1 = false;
											for(int j = 0;j < users.size() ;j++){
												if(users.get(j).number == n) {
													exist1 = true;
													pt = j;
												}else {
													exist1 = false;
												}
											}
											if(exist) {
												users.get(in).setBalance(total - users.get(in).balance );
												users.get(pt).setBalance(users.get(pt).balance + money_transfer);
												idt = count2;
												id_user = in + 1;
												type = "Transfer";	
												
												tran.add(new Transactions(idt, id_user, type, value_tax, total));
												tran.add(new Transactions(idt, pt, type, 0, money_transfer));
												System.out.println("Transfer successful");
												count2 = count2 + 1;
											}else {
												System.out.println("The number account don't exist");
											}
											
										}else {
											System.out.println("Insufficient funds");
										}									
										break;
										
									case 3:
										System.out.println("Your actual balance is: " + users.get(in).balance);
										System.out.println("How much money do you want to withdraw? ");
										double value = read.nextDouble();
										
										if (value < 1000) {
											value_tax = 200;
											total = value + value_tax;
											
											if(total < users.get(in).balance ) {
												users.get(in).setBalance(total - users.get(in).balance );												
												idt = count2;
												id_user = in + 1;
												type = "Withdraw";	
												
												tran.add(new Transactions(idt, id_user, type, value_tax, total));												
												System.out.println("Withdraw successful");
												count2 = count2 + 1;
											}else if(total > users.get(in).balance) {
												System.out.println("Insufficient funds");
											}											
										}else if(value > 1000) {
											double per = value *0.15;
											value_tax = 200 + per;
											total = value + value_tax;
											
											if(total < users.get(in).balance ) {
												users.get(in).setBalance(total - users.get(in).balance );												
												idt = count2;
												id_user = in + 1;
												type = "Withdraw";	
												
												tran.add(new Transactions(idt, id_user, type, value_tax, total));												
												System.out.println("Withdraw successful");
												count2 = count2 + 1;
											}else if(total > users.get(in).balance) {
												System.out.println("Insufficient funds");
											}
										}
										
										break;
									case 4:
										if(tran.size() != 0) {
											for(int x = 0;x < tran.size() ;x++) {
												if((tran.get(x).id_user - 1) == in) {
													System.out.println("Products: \n" +
															"----------------------------- \n" 
															+ "ID: : " + tran.get(x).idt
															+ "\nID user: " + tran.get(x).id_user
															+ "\nType: " +  tran.get(x).type 
															+ "\nValue tax: " +  tran.get(x).value_tax
															+ "\nBalance: " + tran.get(x).total);
												}												
											}
										}else {
											System.out.println("Do not exist register of transactions on this account");
										}			
										break;
								}
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