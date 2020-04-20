package com.globantstructure.data;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

		ArrayList <Glober> globers = new ArrayList();
		JuniorEngineers je = new JuniorEngineers("Gabriel Soto", 2000000, false);
		SeniorEngineers se = new SeniorEngineers("April Balboa", 5000000,true);
		TeachLeads tl = new TeachLeads("Andres Rodriguez", 8000000,true);
		globers.add(je);
		globers.add(se);
		globers.add(tl);

		System.out.println("************* JUNIOR ENGINEERS ***************");
		System.out.println("**********************************************");
		System.out.println(globers.get(0));
		System.out.println("----------------------------------------------");
		System.out.println("Assignations");
		System.out.println("----------------------------------------------");
		System.out.println("QC Role:");
		je.testingDesign();
		je.testingExecution();
		System.out.println("----------------------------------------------");
		System.out.println("TAE Role:");
		je.identifyTestCasesToBeAutomated();
		je.generateAndExecutionTestAutomatedSuites();
		System.out.println("\n");

		System.out.println("************** SENIOR ENGINEERS **************");
		System.out.println("**********************************************");
		System.out.println(globers.get(1));
		System.out.println("----------------------------------------------");
		System.out.println("Assignations:");
		System.out.println("----------------------------------------------");
		System.out.println("TAE Role:");
		se.identifyTestCasesToBeAutomated();
		se.generateAndExecutionTestAutomatedSuites();
		System.out.println("----------------------------------------------");
		System.out.println("PM Role:");
		se.organizingMotivatingTheProjectTeam();
		se.ensuringCustomerSatisfaction();
		System.out.println("\n");

		System.out.println("*************** TECH LEADS *******************");
		System.out.println("**********************************************");
		System.out.println(globers.get(2));
		System.out.println("----------------------------------------------");
		System.out.println("Assignations:");
		System.out.println("----------------------------------------------");
		System.out.println("PM Role:");
		tl.organizingMotivatingTheProjectTeam();
		tl.ensuringCustomerSatisfaction();
		System.out.println("\n");


    }
}
