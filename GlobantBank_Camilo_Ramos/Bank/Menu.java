package org.globant.Bank;

import java.util.Iterator;
import java.util.Scanner;
public class Menu {
	static Account acc = new Account();
	public static void main(String[] args) {
		Transactions trans = new Transactions();
		Account acc = new Account();
		User user = new User();
		Scanner kscan= new Scanner(System.in);
		String k="",orgacc="", x="";
		Double money;
		int duser=0;
		System.out.println("************************");
		System.out.println("List of users");
		user.users();
		duser=user.verUser();

		while(k!="4")
		{
			user.usrData(duser);
			System.out.println("1-Transfer Money\n"
					+ "2-Retrieve Money\n"
					+ "3-Add Money\n"
					+ "4-Exit");
			k=kscan.nextLine();
			switch (k)
			{
				case "1":
					System.out.println("************************");
					System.out.println("Account List");
					orgacc=user.data.get(duser+2);
					Iterator<String> it = Account.dAccount.keySet().iterator();
					while(it.hasNext())
					{
						String dat = (String) it.next();
						if(!dat.contentEquals(orgacc))System.out.println("Account: " + dat + " Value: " + Account.dAccount.get(dat));
					}
					do {
					System.out.println("************************");
					System.out.println("Add Account: ");
					k=kscan.nextLine();
					}while((acc.validAcc(k))!=true);
					System.out.println("Add Value ");
					x=kscan.nextLine();
					money=Double.parseDouble(x);
					trans.sendMoney(orgacc,k,money);
					break;
				case "2":
					orgacc=user.data.get(duser+2);
					System.out.println("************************");
					System.out.println("Add Value ");
					x=kscan.nextLine();
					money=Double.parseDouble(x);
					trans.retrMoney(orgacc,money,1);
					break;
				case "3":
					orgacc=user.data.get(duser+2);
					System.out.println("************************");
					System.out.println("Add value ");
					x=kscan.nextLine();
					money=Double.parseDouble(x);
					trans.retrMoney(orgacc,money,2);
					break;
				case "4":
				System.exit(0);
				break;
				default:
				System.out.println("Unexpected value: ");
			}
		}
		kscan.close();

		
	}

}
