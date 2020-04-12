package co.com.globantBank.dto;

import java.util.Date;

public class AccountDTO {

    protected String accountNumber;
    protected Date openingDate;
    protected Double balance;

    public AccountDTO() {
    }

    public AccountDTO(String accountNumber, Date openingDate, Double balance) {
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account: " +
                "Account Number='" + accountNumber + '\'' +
                ", Opening Date=" + openingDate +
                ", Balance=" + balance;
    }
}
