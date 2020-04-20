package com.training.globant.administration;

import java.util.Date;

public class Project {
    int projectID=0;
    String name;
    double budget;
    String country;
    String area;
    String dateInit;

    public Project(int projectID, String name, double budget, String country, String area, String dateInit) {
        this.projectID = projectID;
        this.name = name;
        this.budget = budget;
        this.country = country;
        this.area = area;
        this.dateInit = dateInit;
    }


    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDateInit(String dateInit) {
        this.dateInit = dateInit;
    }

    public String getName() {
        return name;
    }

    public double getBudget() { return budget; }

    public String getCountry() {
        return country;
    }

    public String getArea() {
        return area;
    }

    public String getDateInit() {
        return dateInit;
    }

}
