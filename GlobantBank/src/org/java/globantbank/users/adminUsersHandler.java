package org.java.globantbank.users;
import java.util.ArrayList;

import org.java.globantbank.*;
import org.java.globantbank.message.MessageHandler;

public class adminUsersHandler {
	
	Admin adminInfo=new Admin();
	
	
	public void validateAdminUser(String adminUser, String adminPassword, ArrayList<Account> accountList) {
        
		boolean option=true;
		while (option==true) {
			if(adminInfo.userAdmin.equals(adminUser) && adminInfo.passwordAdmin.equals(adminPassword)) {
				int adminOpt = new MessageHandler().showMenuAdminMessage();
				switch (adminOpt) {
				case 1:
					
					int i=0;
							while(i<accountList.size()) {
								System.out.println(accountList.get(i).toString());
								i=i+1;
							}option=false;
					
					break;
					
				default:
					System.out.println("The option is invalid");
					option=false;
					break;
				}   
			
			}else {
				System.out.println("The adminuser or admin password is incorrect.");
				option=false;
			}
		
		}
	}
	

}
