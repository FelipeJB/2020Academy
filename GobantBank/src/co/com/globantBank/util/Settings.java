package co.com.globantBank.util;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Settings {
public static final int MAIN =0,
                        TRANSACTION=1;

    public static void getMenu (int type) throws Exception {
        if(type==MAIN){
            System.out.println("1. Print the list of clients");
            System.out.println("2. Create client");
            System.out.println("3. Customer transactions");
            System.out.println("0. Exit");
        }else if (type==TRANSACTION){
            System.out.println("1. Make a withdraw");
            System.out.println("2. Add money");
            System.out.println("3. Make a transfer");
            System.out.println("0. Return to main menu");
        }else {
            throw new Exception("The inserted option is not valid");
        }
    }


    public static Object getData(String message, String type){
        Object object = new Object();
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        if (type.equals("STRING")){
            object = sc.next().toUpperCase();
        }else if (type.equals("DOUBLE")){
            object = sc.nextDouble();
        }
        return object;
    }

    public static void validateOption(int typeMenu, String option) throws Exception {
        List<String> listOption;
        if(typeMenu==MAIN){
            listOption = new ArrayList<String>() {
                {
                    add("0");
                    add("1");
                    add("2");
                    add("3");
                }
            };
        }else if (typeMenu==TRANSACTION){
                listOption = new ArrayList<String>() {
                    {
                        add("0");
                        add("1");
                        add("2");
                        add("3");
                    }
                };
        }else{
            throw new Exception("The inserted option is not valid");
        }
        if (!listOption.contains(option)){
            throw new Exception("Please, insert the number of one valid option");
        }
    }

}
