package com.training.main;

import com.training.assignment.*;
import com.training.globant.administration.Glober;
import com.training.globant.administration.Project;
import com.training.role.Developer;
import com.training.role.Manager;
import com.training.role.Quality;

import java.util.ArrayList;

public class main {
    public static Glober glober1;
    public static Glober glober2;
    public static Glober glober3;
    public static Glober glober4;
    public static Glober glober5;
    public static Glober glober6;
    public static Glober glober7;
    public static Glober glober8;
    public static Glober glober9;
    public static Glober glober10;
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


    public static void main(String[] args) {
        emptyProject = new Project(0, "", 0, "", "", "");
        daProject = new Project(1, "El Proyecto", 1000000, "USA", "Tech", "01/01/2009");
        createGlobers();
        createRolesAssignment();

        System.out.println("WELCOME TO GLOBANT");
        System.out.println("1: TO SEE ALL GLOBERS");
        System.out.println("2: TO SEE ALL QUALITY GLOBERS");
        System.out.println("3: TO SEE ALL DEVELOPER GLOBERS");
        System.out.println("2: TO SEE ALL MANAGER GLOBERS");


    }

    public static void createGlobers() {
        glober1 = new Glober(111, "Persona1", "Apellido1", "Calle 123", 123456, "A+", "04/05/2010", 1200, emptyProject);
        glober2 = new Glober(112, "Persona2", "Apellido2", "Calle 123", 356345, "0+", "04/05/2010", 1200, emptyProject);
        glober3 = new Glober(113, "Persona3", "Apellido3", "Calle 123", 345325, "0+", "04/05/2010", 1200, daProject);
        glober4 = new Glober(114, "Persona4", "Apellido4", "Calle 123", 345634, "A-", "04/05/2010", 1200, daProject);
        glober5 = new Glober(115, "Persona5", "Apellido5", "Calle 123", 546345, "AB+", "04/05/2010", 1200, daProject);
        glober6 = new Glober(116, "Persona6", "Apellido6", "Calle 123", 789089, "0-", "04/05/2010", 1200, daProject);
        glober7 = new Glober(117, "Persona7", "Apellido7", "Calle 123", 789078, "0-", "04/05/2010", 1200, daProject);
        glober8 = new Glober(118, "Persona8", "Apellido8", "Calle 123", 789099, "B+", "04/05/2010", 1200, daProject);
        glober9 = new Glober(119, "Persona9", "Apellido9", "Calle 123", 577878, "A+", "04/05/2010", 1200, emptyProject);
        glober10 = new Glober(1110, "Persona10", "Apellido10", "Calle 123", 567876, "A+", "04/05/2010", 1200, emptyProject);
    }

    public static void createNoProjectGlobers() {
        Manager manager1 = (Manager) glober1; //sin projecto
        DeveloperJava dev0 = (DeveloperJava) glober2; //sin projecto
        noProject = manager1.getProject().getProjectID();
        noProject = dev0.getProject().getProjectID();
    }

    public static void createRolesAssignment() {
        ArrayList<Integer> projectList = new ArrayList<>();
        projectList.add(daProject.getProjectID());
        //Manager
        managerRole.setManagedProjects(projectList);
        managerRole.setRoleCode(123);
        managerRole.setRolePurpose("Manage the project and all the Glober in it");
        managerRole.setRoleResponsibility("Review daily board and talk to the client");
        //Quality
        qualityRole.setTestingTypes("Functional; Exploratory; Compatibility; Monkey");
        qualityRole.setRoleCode(222);
        qualityRole.setRolePurpose("");
        qualityRole.setRoleResponsibility("");
        //Developers
        devRole.setTechnicalProfile("");
        devRole.setRoleCode(333);
        devRole.setRolePurpose("");
        devRole.setRoleResponsibility("");

        glober3 = managerRole;
        glober5 = qualityRole;
        glober6 = qualityRole;
        glober7 = devRole;
        glober8 = devRole;

        System.out.println("Manager Role: " + glober3.getFullName());
        System.out.println("Quality Role: 1." + glober5.getFullName() + " 2." + glober6.getFullName());
        System.out.println("Developer Role: ");
        System.out.println(glober7.getFullName());
        System.out.println(glober8.getFullName());
        System.out.println(glober9.getFullName());
    }

    public static void createAssignment() {
        pm = (ManagerProject) managerRole;
        techLead = (DeveloperJava) devRole;
        javaSr1 = (DeveloperJava) devRole;
        netVBJr = (DeveloperNet) devRole;
        qcSr2 = (QCAnalyst) qualityRole;
        qcSSr = (QCAnalyst) qualityRole;

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

        System.out.println("Project Manager: " + pm.getFullName());
        System.out.println("Technical Leader: " + techLead.getFullName());
        System.out.println("Java Developer: " + javaSr1.getFullName());
        System.out.println(".NET Developer: " + netVBJr.getFullName());
        System.out.println("QC Level 2: " + qcSr2.getFullName());
        System.out.println("QC Semi Senior: " + techLead.getFullName());

    }
}
