package com.globant.academy.java;

import java.util.Date;

class UIDeveloper extends Glober {

	public UIDeveloper(String name, Date startDate, String seniority, double basicSalary, boolean assignedProject) {
		super(name, startDate, seniority, basicSalary, assignedProject);

	}


	public void bonus() {
		double bonus=0;
		System.out.println("-----UI Developer----");
		if (seniority.compareTo("Trainee") == 0) {
			bonus = 30000;
		}else if (seniority.compareTo("Junior") == 0) {
			bonus = 40000;
		}
		else if (seniority.compareTo("Junior Adv.") == 0) {
			bonus = 60000;
		}   else if (seniority.compareTo("Semi Senior") == 0) {
			bonus = 80000;
		}    else if (seniority.compareTo("Semi Senior Adv.") == 0) {
			bonus = 100000;
		} else if (seniority.compareTo("Senior") == 0) {
			bonus = 130000;
		}
		System.out.println("Your bonus is:" +bonus);
	}

	public void createUserInterface() {
		System.out.println("-----UI Developer----");
		System.out.println("1.Create User Interface in comparison to MockUps");
	}

}
