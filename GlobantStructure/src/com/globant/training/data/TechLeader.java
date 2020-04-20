package com.globant.training.data;

public class TechLeader extends Operative implements Position {

	public TechLeader(String project, String businessUnit, int cid, String firstName, String lastName, int salary, int experienceYears, String hiringDate) throws Exception {
		super(project, businessUnit, cid, firstName, lastName, salary, experienceYears, hiringDate);
		
	}
	
	public void specificAssignments () {
		System.out.println("Tech Leader assignements in " + project + " project\n"
				+ "\tLead the assigned team\n"
				+ "\tCustomer meetings attendance\n"
				+ "\tIncreases team efficiency\n"
				+ "\tConflic resolution inside the team\n"
				+ "\tFacilitate and schedule meetings");
	}
}
