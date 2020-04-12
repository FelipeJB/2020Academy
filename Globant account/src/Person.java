public class Person {
    public String userName;
    public String name;
    public double numberAccount;
    public int balance;
    public String password;
    public String openingDate;

    @Override
    public String toString() {
        return "Client: \n" +
                "Username: " + userName + '\n' +
                "Name: " + name + '\n' +
                "Number Account: " + numberAccount + '\n'+
                "Opening Date:: " + openingDate + '\n'+
                "Balance: " + balance + '\n';
    }
}
