package com.globant.training.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Globers {

	protected int cid;
	protected String firstName;
	protected String lastName;
	protected int salary;
	protected int experienceYears;
	protected  Date hiringDate;
	
	public Globers(int cid, String firstName, String lastName, int salary, int experienceYears,String hiringDate) throws Exception {
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.experienceYears = experienceYears;
	    Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(hiringDate);  
		this.hiringDate = date1;
	}
	
	public void printGlober () {
		System.out.println("Glober Name: " + this.firstName + " " + this.lastName + ", Hiring Date: " +this.hiringDate + ", Salary: " + this.salary);
	}
}
