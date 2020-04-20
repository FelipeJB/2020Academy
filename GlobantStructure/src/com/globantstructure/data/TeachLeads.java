package com.globantstructure.data;
import com.funcionalities.data.PM;

public class TeachLeads extends Glober implements PM {

    public TeachLeads(String name, double salary, boolean belongToProject) {
        super(name, salary, belongToProject);
    }

    @Override
    public void organizingMotivatingTheProjectTeam() {
        System.out.println("Organizing and motivating a project team");
    }

    @Override
    public void ensuringCustomerSatisfaction() {
        System.out.println("Ensuring customer satisfaction");
    }
}
