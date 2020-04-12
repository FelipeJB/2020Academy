package org.java.globantbank;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String csvPath="C:\\Users\\usuario\\eclipse-workspace\\GlobantBank\\FilesAccount-Admin\\Users.csv";
		
        Scanner myInitialOpt = new Scanner(System.in);
        Scanner myOptUser=new Scanner(System.in);
        Scanner myOptAdmin=new Scanner(System.in);
        Scanner myadminUser = new Scanner(System.in);
        Scanner myadmiPassword = new Scanner(System.in);
        Scanner myUserAccount = new Scanner(System.in);
        Scanner myUserPassword = new Scanner(System.in);
		Admin adminInfo=new Admin();
		try {
		BufferedReader lineReader = new BufferedReader(new FileReader(csvPath));
        String lineText = null;
        
        ArrayList<Account> accountList=new ArrayList<Account>();

        lineReader.readLine(); // skip header line

	        while ((lineText = lineReader.readLine()) != null) {
	            String[] data = lineText.split(",");
	            String user = data[0];
	            String userPassword = data[1];
	            String userName = data[2];
	            String accountNumber = data[3];
	            String balance = data[4];
	            String dateOpening = data[5];
	            double balanceDou=Double.parseDouble(balance);
	            
	            accountList.add(new Account(new Users(user,userPassword,userName),accountNumber,balanceDou,dateOpening));
	            
	        }

        System.out.println("*****------------------*****");
        System.out.println("Are you an admin user or a normal user?, we will need your credentials");
        System.out.println("1. Press 1 if you are an admin user.");
        System.out.println("2. Press 2 if you are a normal user.");
        System.out.println("*****------------------*****");
        int myOptSelected=myInitialOpt.nextInt();        

        if(myOptSelected==1) {
	        boolean option=true;
			while (option==true) {
				
				System.out.println("*****------------------*****");
				System.out.println("Enter your admin user name: Clue - AdminCam - test1234");
				String adminUser=myadminUser.next();
				System.out.println("*****------------------*****");
				System.out.println("Enter your admin password:");
				String adminPassword=myadmiPassword.next();
				
				if(adminInfo.userAdmin.equals(adminUser) && adminInfo.passwordAdmin.equals(adminPassword)) {
				
					System.out.println("*****------------------*****");
					System.out.println("Welcome Admin, do you want to know the accounts information?:");
					System.out.println("1. Press 1 if yes.");
					System.out.println("2. Press 2 to close.");
					System.out.println("*****------------------*****");
					int adminOpt=myOptAdmin.nextInt();
					
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
					System.out.println("The user or password is incorrect.");
					option=false;
				}
			}
        }
        
        if(myOptSelected==2){

	        boolean option=true;
			while (option==true) {
							
				int userOpt=myOptUser.nextInt();
				switch (userOpt) {
				case 1:
					
					System.out.println("Entraste el user");
					
					option=false;
					break;
				}   
			}
        	
        }
        if(myOptSelected>2) {
        	System.out.println("Invalid option!!");
        }
        
        myInitialOpt.close();
        myOptAdmin.close();
        myadminUser.close();
        myadmiPassword.close();
        myOptUser.close();

			lineReader.close();
	        } catch (IOException ex) {
	            System.err.println(ex);
	        }
	}

}
