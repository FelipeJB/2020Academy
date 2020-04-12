package co.com.globantBank.dto;

import java.util.Date;

public class SavingAccountDTO extends AccountDTO {

    public SavingAccountDTO() {
        super();
    }

    public SavingAccountDTO(String accountNumber, Date openingDate, Double balance) {
        super(accountNumber, openingDate, balance);
     }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        super.setAccountNumber(accountNumber);
    }

    @Override
    public Date getOpeningDate() {
        return super.getOpeningDate();
    }

    @Override
    public void setOpeningDate(Date openingDate) {
        super.setOpeningDate(openingDate);
    }

    @Override
    public Double getBalance() {
        return super.getBalance();
    }

    @Override
    public void setBalance(Double balance) {
        super.setBalance(balance);
    }
}
