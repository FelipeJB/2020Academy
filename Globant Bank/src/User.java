import java.util.ArrayList;

public class User{
    private int saving_Account_ID;
    private String name;
    private String password;

    ArrayList <User> users = new ArrayList();


    public User(int saving_Account_ID, String name, String password) {
        this.saving_Account_ID = saving_Account_ID;
        this.name = name;
        this.password = password;
    }

    public User(){
    }


    public int getSaving_Account_ID() {
        return saving_Account_ID;
    }

    public void setSaving_Account_ID(int saving_Account_ID) {
        this.saving_Account_ID = saving_Account_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setListUsers() {
        if (contUser==0) {
            User user1 = new User(100, "Thomas Smith", "Pass901*");
            users.add(user1);
            User user2 = new User(101, "Ralph Williams", "Pass902*");
            users.add(user2);
            User user3 = new User(102, "Scott Johnson", "Pass903*");
            users.add(user3);
            User user4 = new User(103, "Sam Taylor", "Pass905*");
            users.add(user4);
            User user5 = new User(104, "Walter Evans", "Pass906*");
            users.add(user5);
            User user6 = new User(105, "William Jones", "Pass907*");
            users.add(user6);
            User user7 = new User(106, "Elizabeth Anderson", "Pass908*");
            users.add(user7);
            User user8 = new User(107, "Sophie Walsh", "Pass909*");
            users.add(user8);
            User user9 = new User(108, "Tracy Rodriguez", "Pass910*");
            users.add(user9);
            User user10 = new User(109, "Rachel Martin", "Pass911*");
            users.add(user10);
            User user11 = new User(110, "Sarah Brown", "Pass912*");
            users.add(user11);
            User user12 = new User(111, "Zac Anderson", "Pass913*");
            users.add(user12);
        }
        userSize = users.size();
        contUser=contUser+1;
    }

    @Override
    public String toString(){

            return "ID: " + this.saving_Account_ID + " User: " + this.name + " Password: " +  this.password;
    }


    boolean userDataFlag=false;
    ArrayList <String> usersNamesList= new ArrayList();
    ArrayList <String> passwordList= new ArrayList();
    int contUser=0;
    int userSize=0;


    public boolean getUserData (String username, String password)
    {

        for (int k=0; k<users.size(); k++)
        {
            String nameFromTable= users.get(k).name;
            usersNamesList.add(nameFromTable);
            String passwordFromTable= users.get(k).password;
            passwordList.add(passwordFromTable);
        }

        boolean userNameFlag = usersNamesList.contains(username);
        int objectIndex = users.indexOf(username);
        boolean passwordFlag = passwordList.contains(password);

        if (userNameFlag==true && passwordFlag==true){
            userDataFlag=true;
        }

        return userDataFlag;
    }


    Object userId=0;
    public int getUserId(String name){
        for (int i = 0; i < users.size(); i++){

            if(name.equals(users.get(i).getName())) {
                userId = users.get(i).getSaving_Account_ID();
            }
        }
       return (int) userId;
    }

    Object userIdData=0;
    public Object getUserIdData(int i){
        userIdData=users.get(i);
        return userIdData;
    }

}
