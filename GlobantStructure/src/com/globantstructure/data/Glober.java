package com.globantstructure.data;

public class Glober {

    protected String name;
    protected double salary;
    protected boolean belongToProject;

    public Glober(String name, double salary, boolean belongToProject) {
        this.name = name;
        this.salary = salary;
        this.belongToProject = belongToProject;
    }

    @Override
    public String toString() {
        String project = "Yes";
        if (this.belongToProject == false) {
            project = "No";
            return "Glober:" + this.name + "\nSalary:" + this.salary + "\nBelong to Project: " + project;
        } else {
            return "Glober:" + this.name + "\nSalary:" + this.salary + "\nBelong to Project:" + project;
        }
    }

}
