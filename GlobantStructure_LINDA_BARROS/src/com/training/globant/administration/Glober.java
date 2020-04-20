package com.training.globant.administration;

import java.util.Date;

public class Glober extends Person {
    String dateInitialization;
    double salary;
    Project project;

    public Glober(int idNumber, String name, String lastname, String homeAddress, int cellPhone, String bloodType, String dateInitialization, double salary, Project project) {
        super(idNumber, name, lastname, homeAddress, cellPhone, bloodType);
        this.dateInitialization = dateInitialization;
        this.salary = salary;
        this.project = project;
    }
    public Glober(){}


    public String getDateInitialization() {
        return dateInitialization;
    }

    public void setDateInitialization(String dateInitialization) {
        this.dateInitialization = dateInitialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getFullName() {
        return name + " " + lastname;
    }
}
