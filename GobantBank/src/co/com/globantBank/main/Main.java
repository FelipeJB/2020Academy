package co.com.globantBank.main;


import co.com.globantBank.dto.AccountDTO;
import co.com.globantBank.dto.BankDTO;
import co.com.globantBank.dto.ClientDTO;
import co.com.globantBank.model.ModelAccount;
import co.com.globantBank.model.ModelClient;
import co.com.globantBank.model.ModelTransaction;
import co.com.globantBank.util.Settings;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main (String[] args){

        String option=null;
        ModelClient modelClient = new ModelClient();
        ModelAccount modelAccount = new ModelAccount();
        ModelTransaction modelTransaction = new ModelTransaction();
        BankDTO bankDTO =  new BankDTO();
        bankDTO.setNameBank("Gobant Bank");
        bankDTO.setCodeBank("001");

        do {
            try {
                System.out.println ("Welcome to your Globant Bank");
                Settings.getMenu(Settings.MAIN);
                option= (String) Settings.getData("Please, insert the number of the desired option", "STRING");

                Settings.validateOption(Settings.MAIN, option);

                if (option.equals("1")) {
                    modelClient.printListClient(bankDTO.getListClientDTO());
                }else if (option.equals("2")){
                    ClientDTO clientDTO = modelClient.createClient(bankDTO.getListClientDTO());
                    AccountDTO accountDTO = modelAccount.createAccount();
                    clientDTO.setAccountDTO(accountDTO);
                    bankDTO.getListClientDTO().add(clientDTO);
                } else if (option.equals("3")){
                    Settings.getMenu(Settings.TRANSACTION);
                    option= (String) Settings.getData("Please, insert the number of the desired transaction option", "STRING");
                    Settings.validateOption(Settings.TRANSACTION, option);
                    modelTransaction.manageTransaction(option, bankDTO.getListClientDTO());
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }

        } while (!option.equals("0"));

    }
}
