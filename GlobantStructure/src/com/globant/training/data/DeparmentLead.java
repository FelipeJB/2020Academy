package com.globant.training.data;

public class DeparmentLead extends Administrative implements Position {

	public DeparmentLead(String deparment, int cid, String firstName, String lastName, int salary, int experienceYears, String hiringDate) throws Exception {
		super(deparment, cid, firstName, lastName, salary, experienceYears, hiringDate);
		
	}
	
	public void specificAssignments () {
		System.out.println("Lead of " + deparment + " deparment assignments\n"
				+ "\tReview the department reports and send them to Globant's Managers\n"
				+ "\tGlobant's interdeparmental meetings attendance\n"
				+ "\tConflic resolution inside the Departament\n"
				+ "\tFacilitate and schedule meetings\n"
				+ "\tLead assigned analysts");
	}
}
