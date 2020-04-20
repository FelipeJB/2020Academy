package com.globant.academy.java;

import java.util.Date;

class QCAnalyst extends Glober implements QualityEngineering{

	public QCAnalyst(String name, Date startDate, String seniority, double basicSalary, boolean assignedProject) {
		super(name, startDate, seniority, basicSalary, assignedProject);

	}


	public void bonus() {
		double bonus=0;
		System.out.println("-----QC Analyst----");
		if (seniority.compareTo("Trainee") == 0) {
			bonus = 20000;
		}else if (seniority.compareTo("Junior") == 0) {
			bonus = 30000;
		}
		else if (seniority.compareTo("Junior Adv.") == 0) {
			bonus = 50000;
		}   else if (seniority.compareTo("Semi Senior") == 0) {
			bonus = 70000;
		}    else if (seniority.compareTo("Semi Senior Adv.") == 0) {
			bonus = 90000;
		} else if (seniority.compareTo("Senior") == 0) {
			bonus = 120000;
		}
		System.out.println("Your bonus is:" +bonus);
	}


	public void createTestSuite() {
		System.out.println("-----QC Analyst----");
		System.out.println("1.Create Test Cases");
		System.out.println("2.Assign Priority");
		System.out.println("3.Create Test Suite");
		System.out.println("4.Add to the test suite");
	}


	public void createTestPlan() {
		System.out.println("-----QC Analyst----");
		System.out.println("1. Set the Scope of the project");
		System.out.println("2. Set the coverage of the test");
		System.out.println("3. Set the tools to handle");
		System.out.println("4. Set the suspension criteria");
		System.out.println("5. Set the completion criteria");
	}


	public void runSmokeTest() {
		System.out.println("-----QC Analyst----");
		System.out.println("1. Run manually the smoke test suite ");
	}



	public void runRegressionTest() {
		System.out.println("-----QC Analyst----");
		System.out.println("1. Run manually the regression test suite ");
	}



	public void signOff() {
		System.out.println("-----QC Analyst----");
		System.out.println("1. Elaborate the sign off document");
		System.out.println("2. Include the coverage and result chart");
		System.out.println("3. Include the bugs still opened if needed");

	}
}