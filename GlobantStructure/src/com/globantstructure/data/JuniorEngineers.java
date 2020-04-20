package com.globantstructure.data;
import com.funcionalities.data.QC;
import com.funcionalities.data.TAE;

public class JuniorEngineers extends Glober implements QC, TAE {


    public JuniorEngineers(String name, double salary, boolean belongToProject) {
        super(name, salary, belongToProject);
    }

    @Override
    public void testingDesign() {
        System.out.println("* Design the test cases for each Sprint");
    }

    @Override
    public void testingExecution() {
        System.out.println("* Execution the test cases for each Sprint");
    }

    @Override
    public void identifyTestCasesToBeAutomated() {
        System.out.println("* Identify test cases to be automated ");
    }

    @Override
    public void generateAndExecutionTestAutomatedSuites() {
        System.out.println("* Generate and execution Test Automated Suites");
    }
}
