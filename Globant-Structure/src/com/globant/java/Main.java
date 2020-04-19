package com.globant.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Operations new objects of child classes
        JuniorPosition jun = new JuniorPosition();
        SemiseniorPosition semi = new SemiseniorPosition();
        SeniorPosition senior = new SeniorPosition();
        TechleadPosition tl = new TechleadPosition();

        //Staff new objects of child classes
        Payroll pay = new Payroll();
        Champions champ = new Champions();
        Recruiting recr = new Recruiting();
        ServiceDesk serv = new ServiceDesk();


        Menu();
        Scanner sc = new Scanner (System.in);
        int option = sc.nextInt();

        while(option > 0 && option < 4) {

            if (option == 1){
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("GLOBERS INFORMATION: ");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println(" > OPERATIONS POSITIONS: ");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  JUNIOR POSITION: ");
                Glober glb = jun;
                glb.info("Junior", "Position", "QC");
                glb.info(11111, "Junior", "Position", 2000000, "QC");
                jun.infoOperations("ABC", "ABC", "QE");
                System.out.println("  Responsabilities of : " + jun.name + " " + jun.lastName);
                Respon(jun);
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  SEMISENIOR POSITION: ");
                glb = semi;
                glb.info("Semisenior", "Position", "BA");
                glb.info(22222, "Semisenior", "Position", 3500000, "BA");
                semi.infoOperations("ABC", "ABC", "PRODUCT");
                System.out.println("  Responsabilities of : " + semi.name + " " + semi.lastName);
                Respon(semi);
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  SENIOR POSITION: ");
                glb = senior;
                glb.info("Senior", "Position", "PM");
                glb.info(33333, "Semisenior", "Position", 5500000, "PM");
                semi.infoOperations("ABC", "ABC", "AGILE DELIVERY");
                System.out.println("  Responsabilities of : " + senior.name + " " + senior.lastName);
                Respon(senior);
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  TECH LEAD POSITION: ");
                glb = tl;
                glb.info("Tech Lead", "Position", "DEV");
                glb.info(44444, "Tech lead", "Position", 6500000, "DEV");
                semi.infoOperations("ABC", "ABC", "MOBILE");
                System.out.println("  Responsabilities of : " + tl.name + " " + tl.lastName);
                Respon(tl);
                System.out.println("------------------------------------------------------------------------------------------");


            }else if (option == 2){
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("GLOBERS INFORMATION: ");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println(" > STAFF POSITIONS: ");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  PAYROLL POSITION: ");
                Glober glb1 = pay;
                glb1.info("Payroll", "Position", "Payroll Analyst");
                glb1.info(55555, "Payroll", "Position", 2000000, "Payroll Analyst");
                pay.infoStaff("Salitre");
                System.out.println("  Responsabilities of : " + pay.name + " " + pay.lastName);
                Respon(pay);
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  CHAMPION POSITION: ");
                glb1 = champ;
                glb1.info("Champion", "Position", "Champion Analyst");
                glb1.info(55555, "Champion", "Position", 2000000, "Champion Analyst");
                champ.infoStaff("Connecta");
                System.out.println("  Responsabilities of : " + champ.name + " " + champ.lastName);
                Respon(champ);
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  RECRUITING POSITION: ");
                glb1 = recr;
                glb1.info("Recruiter", "Position", "Recruiter Analyst");
                glb1.info(55555, "Recruiter", "Position", 2000000, "Recruiter Analyst");
                recr.infoStaff("97");
                System.out.println("  Responsabilities of : " + recr.name + " " + recr.lastName);
                Respon(recr);
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("  SERVICE DESK POSITION: ");
                glb1 = serv;
                glb1.info("Service Desk", "Position", "Service Desk Analyst");
                glb1.info(55555, "Service Desk", "Position", 2000000, "Service Desk Analyst");
                serv.infoStaff("Salitre");
                System.out.println("  Responsabilities of : " + serv.name + " " + serv.lastName);
                Respon(serv);



            } else if (option == 3){
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("See you soon. Thank you");
                System.out.println("------------------------------------------------------------------------------------------");
                break;

            }
            Menu();
            option = sc.nextInt();

        }

    }

    public static void Respon(Employee emp){
        emp.Responsabilities();
    }

    public static void Menu (){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("¡Welcome to Globant Structure!");
        System.out.println("Enter the option to proceed:" + "\n1. Print Operations Positions" + "\n2. Print Staff Positions" + "\n3. EXIT");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
