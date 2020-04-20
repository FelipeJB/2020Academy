package com.globant.training.data;

public class SeniorEngineer extends Operative implements Position{

	public SeniorEngineer(String project, String businessUnit, int cid, String firstName, String lastName, int salary, int experienceYears, String hiringDate) throws Exception {
		super(project, businessUnit, cid, firstName, lastName, salary, experienceYears, hiringDate);
		
	}
	
	public void specificAssignments () {
		System.out.println("Senior Engineering Assignments in " + project + " project\n"
				+ "\tAssignment of High priority US from product backlog\n"
				+ "\tReview for the US delivered by Junior Enginners\n"
				+ "\tCustomer meetings attendance");
	}
}
