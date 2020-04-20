package com.training.assignment;

import com.training.globant.administration.Glober;
import com.training.globant.administration.Project;
import com.training.role.Quality;

import java.util.List;

public class QCManager extends Quality implements Assignment {
    private Glober directBoos;
    private int seniority;
    private String responsibility;
    private List<Integer> managedProjects;

    public QCManager(int idNumber, String name, String lastname, String homeAddress, int cellPhone, String bloodType, String dateInitialization, double salary, Project project, String rolePurpose, String roleResponsibility, int roleCode, String testingTypes, Glober directBoos, int seniority, String responsibility, List<Integer> managedProjects) {
        super(idNumber, name, lastname, homeAddress, cellPhone, bloodType, dateInitialization, salary, project, rolePurpose, roleResponsibility, roleCode, testingTypes);
        this.directBoos = directBoos;
        this.seniority = seniority;
        this.responsibility = responsibility;
        this.managedProjects = managedProjects;
    }


    @Override
    public Glober getDirectBoos() {
        return directBoos;
    }

    @Override
    public int getSeniority() {
        return seniority;
    }

    @Override
    public String getSeniorityResponsibility() {
        return responsibility;
    }

    @Override
    public void setDirectBoss(Glober directBoss) {
        this.directBoos = directBoss;
    }

    @Override
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public void setSeniorityResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public List<Integer> getManagedProjects() {
        return managedProjects;
    }

    public void setManagedProjects(List<Integer> managedProjects) {
        this.managedProjects = managedProjects;
    }
}
