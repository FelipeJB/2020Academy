package org.java.globantbank.users;

import java.util.ArrayList;

import org.java.globantbank.Account;
import org.java.globantbank.Users;
import org.java.globantbank.accounts.UserValidationHandler;
import org.java.globantbank.message.MessageHandler;
import org.java.globantbank.repo.RepositoryHandler;

public class normalUsersHandler {
	
	public double taxForTransfer=100;
	public double thresholdWithdraw=1000;
	public double taxWithdrawlLowThan1000=200;
	public double taxWithdrawlHighThan1000=0.15;
	
	public void validateNormalUser(String normalUser, String normalUserPass, ArrayList<Account> accountList) {
		int i = new UserValidationHandler().validateUserArray(normalUser, normalUserPass, accountList);
		if(i < accountList.size()) {
			int userOpt = new MessageHandler().showMenuNormalUsermessage(accountList.get(i).user.name);

			switch (userOpt) {
			case 1:
				
				new MessageHandler().showBalanceNormalUserMessage(normalUserPass, accountList, i);
				
				break;
				
			case 2:

				String accountToTrans = new MessageHandler().showAccToTransNormalUserMessage();
				int c = new UserValidationHandler().validateBankAccountArray(accountToTrans, accountList);
				if(c < accountList.size() && !accountList.get(i).accountNumber.equals(accountToTrans)) {
					double moneyToTransfer = new MessageHandler().showMoneyToTransNormalUserMessage(accountToTrans);
					if( moneyToTransfer + taxForTransfer < accountList.get(i).balance) {
						
						//Update sender balance
						double valSen=accountList.get(i).balance - taxForTransfer - moneyToTransfer;
						accountList.set(i,new Account(new Users(accountList.get(i).user.user, accountList.get(i).user.password, accountList.get(i).user.name), accountList.get(i).accountNumber, valSen, accountList.get(i).initialDate));
						
						//Update receiver balance
						
						double valRec=accountList.get(c).balance + moneyToTransfer;
						accountList.set(c,new Account(new Users(accountList.get(c).user.user, accountList.get(c).user.password, accountList.get(c).user.name), accountList.get(c).accountNumber, valRec, accountList.get(c).initialDate));
						//Update array and file
						
						
						new RepositoryHandler().updateArray(accountList);
						new MessageHandler().showNewBalanceNormalUserMessage(accountList, i);
						break;
					}else {
						System.out.println("Not enought balance to transfer that amount of money");
					}
					
				}else {
						System.out.println("We did not find the account number entered or you are trying to transfer money to your own account.");
				}
				
				break;
				
			case 3:
				//Add money to the account
				double valAdd = accountList.get(i).balance + new MessageHandler().requestMoneyToAdd();
				accountList.set(i,new Account(new Users(accountList.get(i).user.user, accountList.get(i).user.password, accountList.get(i).user.name), accountList.get(i).accountNumber, valAdd, accountList.get(i).initialDate));
				new RepositoryHandler().updateArray(accountList);
				new MessageHandler().showNewBalanceNormalUserMessage2(accountList, i);
				
				break;
				
			case 4:
				//Initialize variables to validate the taxes
				double valWithdraw = new MessageHandler().requestMoneyToWithdraw();
				double minVal = valWithdraw + taxWithdrawlLowThan1000;
				double maxVal = (valWithdraw + taxWithdrawlLowThan1000) + (valWithdraw * taxWithdrawlHighThan1000);
				
				//Validate if the amount is lower than 1000
				if (valWithdraw < thresholdWithdraw) {
					
					if(minVal > accountList.get(i).balance) {
						System.out.println("You do not have enough money to withdraw");

					}else {
						double valWithdrawed = accountList.get(i).balance - minVal;
						accountList.set(i,new Account(new Users(accountList.get(i).user.user, accountList.get(i).user.password, accountList.get(i).user.name), accountList.get(i).accountNumber, valWithdrawed, accountList.get(i).initialDate));
						new RepositoryHandler().updateArray(accountList);
						new MessageHandler().showNewBalanceNormalUserMessage2(accountList, i);
					}
					
				}
				
				//Validate if the amount is higher than 1000
				if (valWithdraw > thresholdWithdraw) {
					
					if(maxVal > accountList.get(i).balance) {
						System.out.println("You do not have enough money to withdraw");

					}else {
						double valWithdrawed = accountList.get(i).balance - maxVal;
						accountList.set(i,new Account(new Users(accountList.get(i).user.user, accountList.get(i).user.password, accountList.get(i).user.name), accountList.get(i).accountNumber, valWithdrawed, accountList.get(i).initialDate));
						new RepositoryHandler().updateArray(accountList);
						new MessageHandler().showNewBalanceNormalUserMessage2(accountList, i);
					}
					
				}
				
				break;
				
			default:
				System.out.println("this is not a valid option, thanks for use Globant bank");
				break;
			}

		}else {

			System.out.println("Invalid user or password, please try again!!");
		}

		
	}

}
