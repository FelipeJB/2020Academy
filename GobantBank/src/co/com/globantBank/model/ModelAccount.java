package co.com.globantBank.model;

import co.com.globantBank.dto.AccountDTO;
import co.com.globantBank.dto.SavingAccountDTO;
import co.com.globantBank.util.Settings;

import java.util.Date;

public class ModelAccount {
    private int codeAccount;
    public ModelAccount() {
        codeAccount = 1;
    }

    public AccountDTO createAccount() {
        String strCodeAccount = String.valueOf(codeAccount++);
        Double balance = (Double) Settings.getData("Please, insert the initial amount of your account", "DOUBLE");
        Date openingDate = new Date();

        AccountDTO accountDTO = new SavingAccountDTO();
        accountDTO.setAccountNumber(strCodeAccount);
        accountDTO.setBalance(balance);
        accountDTO.setOpeningDate(openingDate);
        return accountDTO;
    }
}
