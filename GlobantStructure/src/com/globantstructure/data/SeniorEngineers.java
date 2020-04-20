package com.globantstructure.data;

import com.funcionalities.data.PM;
import com.funcionalities.data.TAE;

public class SeniorEngineers extends Glober implements TAE, PM {


    public SeniorEngineers(String name, double salary, boolean belongToProject) {
        super(name, salary, belongToProject);
    }

    @Override
    public void identifyTestCasesToBeAutomated() {
        System.out.println("Identify test cases to be automated ");
    }

    @Override
    public void generateAndExecutionTestAutomatedSuites() {
        System.out.println("Generate and execution Test Automated Suites");
    }


    @Override
    public void organizingMotivatingTheProjectTeam() {
        System.out.println("* Organizing and motivating a project team");
    }

    @Override
    public void ensuringCustomerSatisfaction() {
        System.out.println("* Ensuring customer satisfaction");
    }
}
