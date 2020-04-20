package com.training.role;

import com.training.globant.administration.Glober;
import com.training.globant.administration.Project;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Glober implements Role {
    private String rolePurpose = "";
    private String roleResponsibility = "";
    private int roleCode = 0;
    private ArrayList<Integer> managedProjects;

    public Manager(int idNumber, String name, String lastname, String homeAddress, int cellPhone, String bloodType, String dateInitialization, double salary, Project project) {
        super(idNumber, name, lastname, homeAddress, cellPhone, bloodType, dateInitialization, salary, project);
    }

    public Manager(){}

    @Override
    public String getRolePurpose() {
        return rolePurpose;
    }

    @Override
    public String getRoleResponsibility() {
        return roleResponsibility;
    }

    @Override
    public int getRoleCode() {
        return roleCode;
    }

    @Override
    public void setRolePurpose(String rolePurpose) {
        this.rolePurpose = rolePurpose;
    }

    @Override
    public void setRoleResponsibility(String roleResponsibility) {
        this.roleResponsibility = roleResponsibility;
    }

    @Override
    public void setRoleCode(int roleCode) {
        this.roleCode = roleCode;
    }

    public ArrayList<Integer>  getManagedProjects() {
        return managedProjects;
    }

    public void setManagedProjects(ArrayList<Integer> managedProjects) {
        this.managedProjects = managedProjects;
    }
}
