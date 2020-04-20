package com.training.main;

import com.training.assignment.*;
import com.training.globant.administration.Glober;
import com.training.globant.administration.Project;
import com.training.role.Developer;
import com.training.role.Manager;
import com.training.role.Quality;

import java.util.ArrayList;

import java.util.Scanner;

public class main {
    public static Glober glober1;
    public static Glober glober2;
    public static Project emptyProject;
    public static Project daProject;
    public static int noProject;
    public static Manager managerRole;
    public static Quality qualityRole;
    public static Developer devRole;
    public static ManagerProject pm;
    public static DeveloperJava techLead;
    public static DeveloperJava javaSr1;
    public static DeveloperNet netVBJr;
    public static QCAnalyst qcSr2;
    public static QCAnalyst qcSSr;
    public static Scanner scanner = new Scanner(System.in);
    public static int whileAction;
    public static int action;
    public static Developer devRole2;
    public static Developer devRole3;
    public static Quality qualityRole1;

    public static void main(String[] args) {
        emptyProject = new Project(0, "", 0, "", "", "");
        daProject = new Project(1, "El Proyecto", 1000000, "USA", "Tech", "01/01/2009");
        createGlobers();
        createRoles();
        createAssignment();

        whileAction = 1;

        while (whileAction == 1) {
            System.out.println("WELCOME TO GLOBANT");
            System.out.println("1: TO SEE GLOBERS WITH ROLE");
            System.out.println("2: TO SEE ALL GLOBERS WITH ASSIGNMENT");
            System.out.println("3: TO SEE PROJECTS");
            action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Manager Role: " + pm.getFullName());
                    System.out.println("Quality Role: 1." + qualityRole1.getFullName());
                    break;
                case 2:
                    System.out.println("Project Manager: " + pm.getFullName());
                    System.out.println("Technical Leader: " + techLead.getFullName());
                    System.out.println("Java Developer: " + javaSr1.getFullName());
                    System.out.println(".NET Developer: " + netVBJr.getFullName());
                    System.out.println("QC Level 2: " + qcSr2.getFullName());
                    System.out.println("QC Semi Senior: " + techLead.getFullName());
                    break;
                case 3:
                    System.out.println("Name: " + daProject.getName() + "; ID: " + daProject.getProjectID() + " Init Date: " + daProject.getDateInit() + "; Budget:" + daProject.getBudget());
                    break;
            }
            System.out.println("1: TO SEE THE CHOICES AGAIN");
            whileAction = scanner.nextInt();
        }

    }

    public static void createGlobers() {
        glober1 = new Manager(111, "Persona1", "Apellido1", "Calle 123", 123456, "A+", "04/05/2010", 1200, emptyProject);
        glober2 = new DeveloperJava(112, "Persona2", "Apellido2", "Calle 123", 356345, "0+", "04/05/2010", 1200, emptyProject);
        managerRole = new Manager(113, "Persona3", "Apellido3", "Calle 123", 345325, "0+", "04/05/2010", 1200, emptyProject);
        pm = new ManagerProject(114, "Persona4", "Apellido4", "Calle 123", 345634, "A-", "04/05/2010", 1200, daProject);
        qualityRole1 = new Quality(115, "Persona5", "Apellido5", "Calle 123", 546345, "AB+", "04/05/2010", 1200, emptyProject);
        techLead = new DeveloperJava(116, "Persona6", "Apellido6", "Calle 123", 789089, "0-", "04/05/2010", 1200, daProject);
        javaSr1 = new DeveloperJava(117, "Persona7", "Apellido7", "Calle 123", 789078, "0-", "04/05/2010", 1200, daProject);
        netVBJr = new DeveloperNet(118, "Persona8", "Apellido8", "Calle 123", 789099, "B+", "04/05/2010", 1200, daProject);
        qcSr2 = new QCAnalyst(119, "Persona9", "Apellido9", "Calle 123", 577878, "A+", "04/05/2010", 1200, daProject);
        qcSSr = new QCAnalyst(1110, "Persona10", "Apellido10", "Calle 123", 567876, "A+", "04/05/2010", 1200, daProject);
    }



    public static void createRoles() {
        ArrayList<Integer> projectList = new ArrayList<>();
        projectList.add(daProject.getProjectID());

        //Manager
        pm.setManagedProjects(projectList);
        pm.setRoleCode(123);
        pm.setRolePurpose("Manage the project and all the Glober in it");
        pm.setRoleResponsibility("Review daily board and talk to the client");
        //Quality
        qcSr2.setTestingTypes("Functional; Exploratory; Compatibility; Monkey");
        qcSr2.setRoleCode(222);
        qcSr2.setRolePurpose("");
        qcSr2.setRoleResponsibility("");
        //Developers
        techLead.setTechnicalProfile("");
        techLead.setRoleCode(333);
        techLead.setRolePurpose("");
        techLead.setRoleResponsibility("");
    }

    public static void createAssignment() {

        pm.setDirectBoss(glober1);
        pm.setSeniority(2);
        pm.setSeniorityResponsibility("Besides the daily board, pm has to check out every team member");

        techLead.setDirectBoss(pm);
        techLead.setJavaIDEs("Eclipse; IntelliJ");
        techLead.setSeniority(5);
        techLead.setSeniorityResponsibility("Be for the Developers and the Quality members");

        javaSr1.setDirectBoss(techLead);
        javaSr1.setJavaIDEs(techLead.getJavaIDEs());
        javaSr1.setSeniorityResponsibility("Be good");
        javaSr1.setSeniority(3);
        netVBJr.setDirectBoss(techLead);
        netVBJr.setTeamFoundationPlatforms("VS2018");
        qcSr2.setDirectBoss(techLead);
        qcSr2.setSeniority(4);
        qcSr2.setSeniorityResponsibility("Be in charge of the quality process");
        qcSSr.setDirectBoss(techLead);
        qcSSr.setSeniority(2);
        qcSSr.setSeniorityResponsibility("Test manually");

    }
}
