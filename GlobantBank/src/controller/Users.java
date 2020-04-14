package controller;
import entities.User;

import java.util.HashMap;
import java.util.Map;

public class Users {
    private static Map<String, User> people = new HashMap();

    public static boolean validateUser (String userName, String password){
        User validateUser = people.get(userName);
        if (validateUser != null){
            if (password.equals(validateUser.getPassword())){
                return true;
            }
        }
        return false;
    }

    public static User getUserByUsername(String userName){
        return people.get(userName);

    }

    public static void addPerson(User user) {
        User validateUser = people.get(user.getUserName());
        if (validateUser ==null) {
            people.put(user.getUserName(), user);
        }
    }

    public static void displayDataBase() {

        for (String key : people.keySet()) {
            System.out.println(people.get(key));
        }
    }

    public static boolean searchAccountToTransfer(String userNameDestiny) {
        User validateUser = people.get(userNameDestiny);
        if (validateUser != null){
            if (userNameDestiny.equals(validateUser.getUserName())){
                return true;
            }
        }
        return false;
    }

    public static boolean deletePerson(String user) {
        User validateUser = people.get(user);
        if (validateUser != null){
            people.remove(user);
            return true;
        }
        return false;
    }

}

