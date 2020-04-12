public class Account {
    public int accountNumber = 0;
    public String nameOwnerAccount;
    public int amountTotal=0;
    public int ammountAdd=0;
    public int ammountToWithdraw=0;


    public int addMoney(){
        amountTotal=ammountAdd+amountTotal;
        return amountTotal;
    }

    public int balance(){
        return amountTotal;
    }

    public String withdraw(){
        if (ammountToWithdraw>amountTotal){
            return ("insufficient funds");
        }
        else {
            amountTotal=amountTotal-ammountToWithdraw;
            return ("Transaction successfully");
        }
    }
}