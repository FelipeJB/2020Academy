import java.util.*;


public class MainBank {

	public static void main(String[] args) {
		boolean finish = false;
		//initialize object product
		Client client = new Client();
		
		//initialize product list
		List<Client> clientList = new ArrayList<Client>();
		clientList.add(client.create("Martha Serpa",1010179,"mserpa","aguila123"));
		clientList.add(client.create("Efrain Pardo",1032153,"epardo","aguila123"));
		clientList.add(client.create("Joana Calderon",52215,"jcalderon","aguila123"));
		clientList.add(client.create("Roberto Gomez",72345,"rgomez","aguila123"));
		clientList.add(client.create("Laura Lopez",1020134,"llopez","aguila123"));
		
		Account account = new Account();
		List<Account> accountList = new ArrayList<Account>();
		accountList.add(account.create("Savings",27364547,130000.34,new Date (2010-12-12),1010179));
		accountList.add(account.create("Savings",67764890,2340000.56,new Date (2002-12-03),1010179));
		accountList.add(account.create("Savings",77888808,3000.23,new Date (2010-04-03),1010179));
		accountList.add(account.create("Savings",27355547,289345.67,new Date (2020-10-03),1010179));
		accountList.add(account.create("Savings",89890001,3456788.79,new Date (2000-12-12),1032153));
		accountList.add(account.create("Savings",78654322,500000.90,new Date (1999-04-18),52215));
		accountList.add(account.create("Savings",67544334,80000000.45,new Date (1998-12-23),72345));
		accountList.add(account.create("Savings",90897622,1677885.12,new Date (2002-07-21),1020134));
		
		Transaction transaction = new Transaction();
		
		while (!finish) {
		
			System.out.println("- If you want to see clients list type 1 \n- Withdraw type 2 \n- Add money type 3 \n- Transfer money type 4 \n-Close program type 5");
			Scanner scan = new Scanner(System.in);
			int action = scan.nextInt();
			
			switch (action) {
			
			case 1:
				//print list
				client.showList(clientList);
			     break;
			     
			case 2:
				//withdraw money
				transaction.withdraw(accountList, clientList);
				break;
				
			case 3:
				
				//productList = product.delete(productList);
				
				break;
			
			case 4:
				finish = true;
				System.out.println("Thank you");
				break;
			default:
				break;
			}
		}
	}

}
