package com.globant.training.data;

public class JuniorEngineer extends Operative implements Position{

	public JuniorEngineer(String project, String businessUnit, int cid, String firstName, String lastName, int salary, int experienceYears, String hiringDate) throws Exception {
		super(project, businessUnit, cid, firstName, lastName, salary, experienceYears, hiringDate);
		
	}
	
	public void specificAssignments () {
		System.out.println("Junior Engineering Assignments in " + project + " project\n"
				+ "\tAssignment of low priority US from product backlog\n"
				+ "\tShould elroll in Acamica courses to imporve technical skills");
	}
	
}
