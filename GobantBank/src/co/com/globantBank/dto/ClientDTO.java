package co.com.globantBank.dto;

public class ClientDTO {

    private AccountDTO accountDTO;
    private String codeClient;
    private String user;
    private String password;

    public ClientDTO() {
    }

    public ClientDTO(AccountDTO accountDTO, String codeClient, String user, String password) {
        this.accountDTO = accountDTO;
        this.codeClient = codeClient;
        this.user = user;
        this.password = password;
    }

    public AccountDTO getAccountDTO() {
        return accountDTO;
    }

    public void setAccountDTO(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client: " +
                "Account=" + accountDTO +
                ", Code client='" + codeClient + '\'' +
                ", User='" + user + '\'';
    }
}