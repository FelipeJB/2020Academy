package entities;

public class User {
    private String userName;
    private String name;
    private Account account;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        if (userName != "admin") {
            return "Client: \n" +
                    "Username: " + userName + '\n' +
                    "Name: " + name + '\n' +
                    "Number Account: " + account.getAccountNumber() + '\n' +
                    "Opening Date: " + account.getOpeningDate()+ '\n';
        } else {
            return "Client: \n" +
                    "Username: " + userName + '\n';
        }
    }
}
