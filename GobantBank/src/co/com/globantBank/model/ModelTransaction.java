package co.com.globantBank.model;

import co.com.globantBank.dto.ClientDTO;
import co.com.globantBank.util.Settings;

import java.util.ArrayList;
import java.util.List;

public class ModelTransaction {

    public ModelTransaction() {
    }

    public void manageTransaction(String option, List<ClientDTO> listClientDTO) throws Exception {

        if (option.equals("1")){
           this.withdraw(listClientDTO);
        }else if(option.equals("2")){
           this.addMoney(listClientDTO);
        }else if(option.equals("3")) {
           this.transfer(listClientDTO);
        }else if(option.equals("0")) {
            System.out.println("Going back to main menu");
            option.equals("-1");
        }else{
            throw new Exception("The inserted transaction option does not exist.");
        }
    }

    private void transfer(List<ClientDTO> listClientDTO) throws Exception {
        ClientDTO clientOriginDTO = this.validateUser(listClientDTO, "Please, insert the user from the origin account.");
        ClientDTO clientEndDTO = this.validateUser(listClientDTO, "Please, insert the user from the account you want to transfer.");

        if ((clientOriginDTO!= null) && (clientEndDTO!= null)) {

            Double transferAmount = (Double) Settings.getData("Please, insert the amount you want to transfer.", "DOUBLE");
            Double tax = 100.0;
            Double balanceOrigin = clientOriginDTO.getAccountDTO().getBalance();
            Double balanceEnd = clientEndDTO.getAccountDTO().getBalance();

            if ((transferAmount + tax) > balanceOrigin) {
                throw new Exception("You don't have enough balance to perform this action, your balance is " + balanceOrigin);
            } else {
                balanceOrigin = balanceOrigin - transferAmount - tax;
                clientOriginDTO.getAccountDTO().setBalance(balanceOrigin);
                balanceEnd = balanceEnd + transferAmount;
                clientEndDTO.getAccountDTO().setBalance(balanceEnd);
                System.out.println("The balance for the origin account is:" + balanceOrigin);
                System.out.println("The balance for the beneficiary account is:" + balanceEnd);
            }
        }else{
        throw new Exception("The inserted user does not exist.");
        }
    }

    private ClientDTO validateUser(List<ClientDTO> listClientDTO, String message) throws Exception {
        String user = (String) Settings.getData(message, "STRING");
        ClientDTO clientDTO = null;

        for (ClientDTO data:listClientDTO) {
            if (data.getUser().equals(user)) {
                clientDTO = data;
            }
        }
        return clientDTO;
    }

    public void withdraw (List<ClientDTO> listClientDTO) throws Exception {
        ClientDTO clientDTO = this.validateUser(listClientDTO, "Please, insert the user for the account you want to withdraw");
        if (clientDTO != null){

            Double amount = (Double) Settings.getData("Please, insert the amount you want to withdraw.", "DOUBLE");
            Double tax = 0.0;

            if(amount<1000){
                tax = 200.0;
            }else{
                tax = 200.0 + (amount * 0.15);
            }

            Double balance = clientDTO.getAccountDTO().getBalance();
            if((amount+tax) > balance){
                throw new Exception("You don't have enough balance to perform this action, your balance is "+balance);
            }else {
                clientDTO.getAccountDTO().setBalance(balance-amount-tax);
                System.out.println("The new balance for the account is:" + clientDTO.getAccountDTO().getBalance());
            }
        }else{
            throw new Exception("The inserted user does not exist.");
        }
    }


    private void addMoney(List<ClientDTO> listClientDTO) throws Exception {
        ClientDTO clientDTO = this.validateUser(listClientDTO, "Please insert the user for the account you want to add");
        if (clientDTO != null){
            Double addAmount = (Double) Settings.getData("Please, insert the amount you want to add to your account.", "DOUBLE");
            Double addBalance = clientDTO.getAccountDTO().getBalance();
            clientDTO.getAccountDTO().setBalance(addBalance + addAmount);

            System.out.println("The new balance for the account is:" + clientDTO.getAccountDTO().getBalance());
        }else{
            throw new Exception("The inserted user does not exist.");
        }
    }
}
