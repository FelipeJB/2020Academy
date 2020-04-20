package com.globant.training.data;

public class Operative extends Globers{

	protected String project;
	protected String businessUnit;
	
	public Operative(String project, String businessUnit, int cid, String firstName, String lastName, int salary, int experienceYears, String hiringDate) throws Exception {
		super(cid, firstName, lastName, salary, experienceYears, hiringDate);
		this.project = project;
		this.businessUnit = businessUnit;
	}
	
	public void generalOperativeAssignments () {
		System.out.println("General Operative Assignments\n"
				+ "\tAttendance at the daily scrum meeting\n"
				+ "\tWork for 8 hours per day\n"
				+ "\tAttendance al every Globant event");
		
	}
	
}
