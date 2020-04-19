package com.java.training.seniorities;

import com.java.training.data.Glober;
import com.java.training.data.Assignation;

public class SeniorAnalyst extends Glober {

	public SeniorAnalyst(String firstName, String lastName, int IdNumber, int employeeCode, String studio, int salary,
			Assignation assignationStatus) {
		super(firstName, lastName, IdNumber, employeeCode, studio, salary, assignationStatus);
		setSeniority("Senior Analyst");
		assignResponsabilities(getSeniority());

	}

	@Override
	public String supportStudio() {
		System.out.println("Help the studio:");
		return "* Leading tech talks\n";
	}

}
