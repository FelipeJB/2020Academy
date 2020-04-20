package com.globant.academy.java;

import java.util.Date;

abstract class Glober {
	String name;
	Date startDate;
	String seniority;
	double basicSalary;
	boolean assignedProject;


	public Glober(String name, Date startDate, String seniority, double basicSalary,
			boolean assignedProject) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.seniority = seniority;
		this.basicSalary = basicSalary;
		this.assignedProject = assignedProject;
	}

	public double calculateFinalSalary() {
		double finalSalary = 0;
		double eps;
		double pension;

		pension = this.basicSalary * 0.16;
		eps = this.basicSalary * 0.125;
		finalSalary = this.basicSalary - pension - eps;
		
		return finalSalary;
	}
	
	abstract public void bonus();
	

}
