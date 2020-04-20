package com.globant.academy.java;

import java.util.Date;

public class GlobersMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		QCAnalyst qc = new QCAnalyst("Daniela", new Date("2019/08/21"), "Junior Adv.", 5000, true);
		TAE tae = new TAE("Julian", new Date ("2018/09/12"), "Semi Senior", 7000, false);
		UIDeveloper ui = new UIDeveloper("Santiago", new Date("2019/05/28"), "Junior", 3000, true);
		System.out.println("Your start date is -->"+qc.startDate);
		System.out.println("Your final salary is-->"+qc.calculateFinalSalary());
		qc.bonus();
		qc.createTestPlan();
		tae.bonus();
		tae.createTestPlan();
		tae.createTestSuite();
		System.out.println("Your start date is -->"+tae.startDate);
		System.out.println("Your final salary is-->"+tae.calculateFinalSalary());
		System.out.println("Your start date is -->"+ui.startDate);
		ui.bonus();
		System.out.println("Your final salary is-->"+ui.calculateFinalSalary());
		ui.createUserInterface();

	}

}
