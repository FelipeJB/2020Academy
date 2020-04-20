package com.globant.training.data;

public class DeparmentAnalyst extends Administrative implements Position{

	public DeparmentAnalyst(String deparment, int cid, String firstName, String lastName, int salary, int experienceYears, String hiringDate) throws Exception {
		super(deparment, cid, firstName, lastName, salary, experienceYears, hiringDate);
		
	}
	
	public void specificAssignments () {
		System.out.println("Analyst of " + deparment + " deparment assignments\n"
				+ "\tMake the department reports\n"
				+ "\tDo de activities defined by Globanr for " + deparment + "deparment\n"
				+ "\tDo all the others task assigned by the Deparment Lead");
	}
}
