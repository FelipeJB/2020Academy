package com.globant.training.data;

public class Administrative extends Globers{

	protected String deparment;
		
	public Administrative (String deparment, int cid, String firstName, String lastName, int salary, int experienceYears, String hiringDate) throws Exception {
		super(cid, firstName, lastName, salary, experienceYears, hiringDate);
		this.deparment = deparment;
	}

public void generalAdministrativeAssignments () {
	System.out.println("General Administrative Assignments\n"
			+ "\tWork at the assigned Globant site\n"
			+ "\tWork for 8 hours per day\n"
			+ "\tAttendance al every Globant event");
	
}
}
