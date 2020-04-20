package com.globant.training.test;

import com.globant.training.data.*;

public class Main {

	public static void main(String[] args) throws Exception {

		SeniorEngineer se = new SeniorEngineer("DirecTVGo", "Sopranos", 1020725514, "Oscar", "Diaz", 1000000, 3, "20/02/2007");
		se.printGlober();
		se.generalOperativeAssignments();
		se.specificAssignments();
		
		DeparmentLead dl = new DeparmentLead("Champions", 1234567890, "Claudia", "Romero", 4000000, 5, "20/02/2007");
		dl.printGlober();
		dl.generalAdministrativeAssignments();
		dl.specificAssignments();
	}

}
