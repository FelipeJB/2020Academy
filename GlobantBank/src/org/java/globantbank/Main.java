package org.java.globantbank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import org.java.globantbank.repo.*;
import org.java.globantbank.message.MessageHandler;

public class Main {

	public static void main(String[] args) {
	
		try {
			
		 //Load data from repository
		    ArrayList<Account> accountList=new RepositoryHandler().loadAccountData();
		    
         //Show the initial message to the user and request the input.
		    int myOptSelected = new MessageHandler().showInitialMessage();
		    
		 //Validate the type of user, admin(1) or normal(2)
         if(myOptSelected==1) {

        	new MessageHandler().showInitialAdminMessage(accountList);
        	
        }
        
         //Validate normal user and all the rules related to it. 
        if(myOptSelected==2){
	        
	        new MessageHandler().showInitialNormalUserMessage(accountList);
        	
        }
        if(myOptSelected>2) {
        	System.out.println("Invalid option!!");
        }
  
	        }catch (InputMismatchException inPutEx) {
	            System.err.println("You tried to insert a non-numeric value, please select one of the numeric options. Thank you!! ");
	        }
		
	}

}