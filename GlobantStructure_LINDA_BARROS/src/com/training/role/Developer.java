package com.training.role;

import com.training.globant.administration.Glober;
import com.training.globant.administration.Project;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Glober implements Role {
    private String rolePurpose = "";
    private String roleResponsibility = "";
    private int roleCode = 0;
    private String technicalProfile;

    public Developer(int idNumber, String name, String lastname, String homeAddress, int cellPhone, String bloodType, String dateInitialization, double salary, Project project, String rolePurpose, String roleResponsibility, int roleCode, String technicalProfile) {
        super(idNumber, name, lastname, homeAddress, cellPhone, bloodType, dateInitialization, salary, project);
        this.rolePurpose = rolePurpose;
        this.roleResponsibility = roleResponsibility;
        this.roleCode = roleCode;
        this.technicalProfile = technicalProfile;
    }


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

    public String getTechnicalProfile() {
        return technicalProfile;
    }

    public void setTechnicalProfile(String technicalProfile) {
        this.technicalProfile = technicalProfile;
    }


}
