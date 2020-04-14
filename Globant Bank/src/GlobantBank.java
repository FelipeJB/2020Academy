import java.util.ArrayList;
import java.util.Scanner;

public class GlobantBank {
    public static void main(String[] args) {

        Account account = new Account();
        User user = new User();

        boolean userData = false;
        boolean withdrawFlag = false;
        int userId=0;
        int option = 1;
        int failedTry=0;
        int countAttempts=3;
        boolean costTx=false;
        boolean validateFunds=false;
        int accountNumberToTx=0;

        System.out.println("****************************************************");
        System.out.println("  Welcome to the Globant Bank      ");
        System.out.println("****************************************************");

        while (option > 0) {
            String answer = "Y";
            String option_remove = "Y";
            int menu=1;
            System.out.println("........................................................");
                        System.out.println("Please select one option"
                    + "\n1.Client List"
                    + "\n2.Login User"
                    + "\n3.Exit");
            System.out.println("........................................................");

            Scanner read = new Scanner(System.in);
            option = read.nextInt();
            switch (option) {
                case 1://Client List
                    System.out.println("**************** CLIENT LIST **************************");
                    System.out.println("....................................................");

                    //user.setListUsers();
                    //account.setListSavingAccounts();
                    account.getClientList();
                    break;

                case 2://User Login
                    while (answer == "Y") {

                        System.out.println("****************   LOGIN  ******************************");

                          do{
                            System.out.println("Enter user name:");
                            Scanner readUser = new Scanner(System.in);
                            String userName = readUser.nextLine();

                            System.out.println("Enter the password:");
                            Scanner readPassword = new Scanner(System.in);
                            String password = readPassword.nextLine();

                             account.setListSavingAccounts();
                             user.setListUsers();

                             userData = user.getUserData(userName, password);
                             userId = user.getUserId(userName);

                            //Validation user or password incorrect
                            if (!userData) {
                                System.out.println("User or password incorrect!");
                                System.out.println("........................................................");
                                failedTry=failedTry+1;
                                System.out.println("Remember You only have 3 attempts. Now You have "+ (countAttempts - failedTry) +" attempts.");
                                if(failedTry>2) {
                                    System.out.println("User blocked!. Try later!");
                                    answer="N";
                                    userData = true;
                                    menu=0;
                                    failedTry=0;
                                }
                                else
                                {
                                    System.out.println("Please try again:");
                                    userData = false;
                                }

                            } else {
                                userData = true;
                            }

                        }while (!userData);

                        int accountNumber = account.getAccountNumber(userId);
                        int initialBalance= account.getInitialBalance(accountNumber);
                        user.getNameUser(userId);
                        System.out.println("....................................................");
                        System.out.println("Welcome " + user.getNameUser(userId));
                        System.out.println("----------------------------------------------------");
                        System.out.println("Your Account No." + accountNumber + " has $" + initialBalance + " in the balance");

                        while (menu>0) {
                            System.out.println("....................................................");
                            System.out.println("Select one option:");
                            System.out.println("1.Withdraw" +
                                    "\n2.Add money" +
                                    "\n3.Transfer Money" +
                                    "\n4.Cancel");

                            Scanner readOption = new Scanner(System.in);
                            int optionUser = readOption.nextInt();

                            while (optionUser > 0) {
                                switch (optionUser) {
                                    case 1://Withdraw
                                        initialBalance= account.getInitialBalance(accountNumber);
                                        System.out.println("Account No.: " + accountNumber + " Balance $:" + initialBalance);
                                        System.out.println("Enter the value to withdraw:$");
                                        Scanner readValue = new Scanner(System.in);
                                        int valueTo = readValue.nextInt();

                                        System.out.println("This transaction will have cost." + " Do you want to check? Y/N");
                                        System.out.println(".................................................................");

                                        Scanner readCost = new Scanner(System.in);
                                        String flagCostTx = readCost.nextLine();

                                     if (flagCostTx.equals("Y")) {
                                            costTx=account.getTransactionTaxed(valueTo, accountNumber);
                                            System.out.println("Do you want to continue? Y/N");
                                            System.out.println("....................................................");
                                            Scanner readContinue = new Scanner(System.in);
                                            String continueFlag = readCost.nextLine();

                                            if(continueFlag.equals("Y"))
                                            {
                                                validateFunds = account.validateFunds(valueTo, accountNumber);

                                                if (validateFunds) {
                                                    System.out.println("Sorry...Insufficient Funds!");
                                                    optionUser = 0;
                                                    menu = 1;
                                                    userData = true;

                                                } else {
                                                    int finalBalance = account.getValueWithdraw(valueTo, accountNumber);
                                                    System.out.println("Transaction Successfully...");
                                                    System.out.println("Account No.:" + accountNumber + " Balance $:" + finalBalance);
                                                    optionUser = 0;
                                                    menu = 1;
                                                    userData = true;
                                                }
                                            }

                                            else
                                            {
                                                System.out.println("Transaction Canceled...");
                                                optionUser = 0;
                                                menu = 1;
                                                userData = true;
                                            }
                                     }

                                     else
                                        {
                                            validateFunds = account.validateFunds(valueTo, accountNumber);

                                            if (validateFunds) {
                                                System.out.println("Sorry...Insufficient Funds!");
                                                optionUser = 0;
                                                menu = 1;
                                                userData = true;

                                            } else {
                                                int finalBalance = account.getValueWithdraw(valueTo, accountNumber);
                                                System.out.println("Transaction Successfully");
                                                System.out.println("Account No.:" + accountNumber + " Balance:$" + finalBalance);
                                                optionUser = 0;
                                                menu = 1;
                                                userData = true;
                                            }
                                        }

                                    break;

                                    case 2://Add money
                                        System.out.println("Account No." + accountNumber + " Balance:$" + account.getInitialBalance(accountNumber));
                                        System.out.println("Enter the value to add:$");
                                        Scanner readValue2 = new Scanner(System.in);
                                        int valueToAdd = readValue2.nextInt();

                                        int initialBalanceAdd= account.getInitialBalance(valueToAdd);
                                        int finalBalance= account.addMoney(valueToAdd,accountNumber);
                                        System.out.println("Transaction SuccessFully!");
                                        System.out.println("Account No.:" + accountNumber + " Balance:$" + finalBalance);
                                        optionUser = 0;
                                        menu = 1;
                                        userData = true;

                                        break;

                                    case 3://Transfer Money
                                        System.out.println("Your Account No.:" + accountNumber + " Balance:$" +account.getInitialBalance(accountNumber));
                                        System.out.println("************** AVAILABLE ACCOUNTS  ********************************");
                                        account.getAccounts(accountNumber);
                                        System.out.println("...................................................................");
                                        System.out.println("Please select one account of the next list:");
                                        System.out.println("...................................................................");

                                        Scanner accountFlag = new Scanner(System.in);
                                        accountNumberToTx = accountFlag.nextInt();

                                        boolean accountValidation= account.getAccountToTransfer(accountNumberToTx);

                                        if(accountValidation){
                                            System.out.println("...................................................................");
                                            System.out.println("Enter the value to transfer:");
                                            Scanner valueTxFlag = new Scanner(System.in);
                                            int valueToTransfer = valueTxFlag.nextInt();

                                            validateFunds= account.validateFunds(valueToTransfer,accountNumber);

                                            System.out.println("This transaction will have cost." + " Do you want to check? Y/N");
                                            System.out.println("................................................................");

                                            Scanner transferCost = new Scanner(System.in);
                                            String transferCostTx = transferCost.nextLine();

                                            if (transferCostTx.equals("Y")) {
                                                System.out.println("The cost of the transaction is $100");
                                                System.out.println("Do you want to continue? Y/N");
                                                System.out.println("....................................................");
                                                Scanner readContinue = new Scanner(System.in);
                                                String continueFlag = readContinue.nextLine();

                                                if(continueFlag.equals("Y"))
                                                {
                                                    validateFunds = account.validateFunds(valueToTransfer, accountNumber);

                                                    if (validateFunds) {
                                                        System.out.println("Sorry...Insufficient Funds!");
                                                        optionUser = 0;
                                                        menu = 1;
                                                        userData = true;

                                                    } else {
                                                        int finalBalanceAccountToTransfer =account.transferToAccount(valueToTransfer, accountNumberToTx);
                                                        int finalBalanceAccountFromTransfer=account.transferFromAccount(valueToTransfer, accountNumber);
                                                        System.out.println(".......................................................................");
                                                        System.out.println("The transfer for $" + valueToTransfer + " to the Account No." +accountNumberToTx + " was successfully!");
                                                        System.out.println("Your Account No." + accountNumber + " has now $" + finalBalanceAccountFromTransfer + " in the balance");
                                                        optionUser = 0;
                                                        menu = 1;
                                                        userData = true;
                                                    }
                                                }

                                                else
                                                {
                                                    System.out.println("Transaction Canceled...");
                                                    optionUser = 0;
                                                    menu = 1;
                                                    userData = true;
                                                }
                                            }

                                            else{
                                                validateFunds = account.validateFunds(valueToTransfer, accountNumber);
                                                if (validateFunds) {
                                                    System.out.println("Sorry...Insufficient Funds!");
                                                    optionUser = 0;
                                                    menu = 1;
                                                    userData = true;

                                                } else {
                                                    int finalBalanceAccountToTransfer =account.transferToAccount(valueToTransfer, accountNumberToTx);
                                                    int finalBalanceAccountFromTransfer=account.transferFromAccount(valueToTransfer, accountNumber);
                                                    System.out.println(".......................................................................");
                                                    System.out.println("The transfer for $" + valueToTransfer + " to the Account No." +accountNumberToTx + " was successfully!");
                                                    System.out.println("Your Account No." + accountNumber + " has now $" + finalBalanceAccountFromTransfer + " in the balance");
                                                    optionUser = 0;
                                                    menu = 1;
                                                    userData = true;
                                                }
                                            }

                                        }

                                        else{
                                            System.out.println("**Invalid Account**");
                                            optionUser = 0;
                                            menu = 1;
                                            userData = true;
                                        }

                                        break;

                                    case 4://Cancel
                                        System.out.println("Transaction Canceled!" + "\n");
                                        optionUser = 0;
                                        answer="N";
                                        menu=0;
                                        break;
                                }
                            }
                        }
                    }

                    break;

                case 3://Exit
                    System.out.println("SEE YOU SOON!..." + "\n");
                    option = 0;
                    break;

                default:
                    System.out.println("Incorrect Option!");
                    option = 1;
            }

        }//Main While
    }//Static Main
}//Main class


