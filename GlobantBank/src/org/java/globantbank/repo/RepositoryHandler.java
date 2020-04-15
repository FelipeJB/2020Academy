package org.java.globantbank.repo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.java.globantbank.Account;
import org.java.globantbank.Users;

public class RepositoryHandler {
	
	public ArrayList<Account> arrAccounts;
	public String csvPath;
	
	public RepositoryHandler() {
	
	csvPath = "C:\\Users\\usuario\\eclipse-workspace\\GlobantBank\\FilesAccount-Admin\\Users.csv";
	
	}
	
	//This method is in charge to load the data and covert it into an array list
	public ArrayList<Account> loadAccountData() {
		
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
		            this.arrAccounts=accountList;

		        }lineReader.close();
        }catch (IOException ex) {
        	System.err.println(ex);
        }return arrAccounts;
		        
	}
	
	//This method is created to update the array and the repository with the new information.
	public void updateArray(ArrayList<Account> acc) {
		
		ArrayList<Account> accountList= new ArrayList<Account>();
		accountList=acc;		

		BufferedWriter lineWriter;
		try {
			lineWriter = new BufferedWriter(new FileWriter(csvPath));
			
			lineWriter.write("User,Password,userName,accountNumber,balance,dateOpening");
			lineWriter.newLine();
			int i=0;
			while(i<accountList.size()) {
			lineWriter.write(accountList.get(i).user.user+",");
			lineWriter.write(accountList.get(i).user.password+",");
			lineWriter.write(accountList.get(i).user.name+",");
			lineWriter.write(accountList.get(i).accountNumber+",");
			lineWriter.write(accountList.get(i).balance+",");
			lineWriter.write(accountList.get(i).initialDate);
			lineWriter.newLine();
			i++;
			}
			
			lineWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
