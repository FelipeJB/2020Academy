package com.java.training.seniorities;

import com.java.training.data.Glober;
import com.java.training.data.Assignation;

public class SeniorManagement extends Glober {

	public SeniorManagement(String firstName, String lastName, int IdNumber, int employeeCode, String studio, int salary,
			Assignation assignationStatus) {
			super(firstName, lastName, IdNumber, employeeCode, studio, salary, assignationStatus);
			setSeniority("Senior Management");
			assignResponsabilities(getSeniority());
	}

	@Override
	public String supportStudio() {
		System.out.println("Help the studio:");
		return "* Being a Studio Focal\n";
	}


}
