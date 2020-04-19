package controler;

import java.util.ArrayList;
import java.util.List;

import com.java.training.data.Glober;
import com.java.training.data.Assignation;
import com.java.training.role.PM;
import com.java.training.role.QCAnalyst;
import com.java.training.role.SoftwareDeveloper;
import com.java.training.role.TAEAnalyst;
import com.java.training.role.TechLead;
import com.java.training.seniorities.Expert;
import com.java.training.seniorities.JuniorAnalyst;
import com.java.training.seniorities.SeniorAnalyst;
import com.java.training.seniorities.SeniorManagement;

public class Main {

	public static void main(String[] args) {

		JuniorAnalyst glober1 = new JuniorAnalyst("Cristian", "Arias", 51982760, 1, "UI Engineering", 1000000, null);
		JuniorAnalyst glober2 = new JuniorAnalyst("Karen", "Medina", 52982761, 2, "Quality Engineering", 1000000, null);
		JuniorAnalyst glober3 = new JuniorAnalyst("Kely", "Herrera", 53982762, 3, "Mobile", 1000000, null);
		JuniorAnalyst glober4 = new JuniorAnalyst("Julio", "Molina", 54982763, 4, "Quality Engineering", 1000000, null);
		JuniorAnalyst glober5 = new JuniorAnalyst("Jenny", "Ramirez", 55982764, 5, "UI Engineering", 1000000, null);
		SeniorAnalyst glober6 = new SeniorAnalyst("Oliver", "Arango", 56095320, 6, "UI Engineering", 3000000, null);
		SeniorAnalyst glober7 = new SeniorAnalyst("Claudia", "Romero", 57095321, 7, "Quality Engineering", 3000000,null);
		SeniorAnalyst glober8 = new SeniorAnalyst("Mariana", "Moreno", 58095322, 8, "UX Design", 3000000, null);
		SeniorAnalyst glober9 = new SeniorAnalyst("Gina", "Ocampo", 59095323, 9, "Gaming", 3000000, null);
		SeniorAnalyst glober10 = new SeniorAnalyst("Tatiana", "Olaya", 50095324, 10, "Consulting", 3500000, null);
		Expert glober11 = new Expert("Hugo", "Lemus", 32786090, 11, "UI Engineering", 5000000, null);
		Expert glober12 = new Expert("Alejandra", "Sierra", 33786091, 12, "UI Engineering", 5000000, null);
		Expert glober13 = new Expert("Andres", "Rodriguez", 34786092, 13, "UX Design", 5000000, null);
		Expert glober14 = new Expert("Esmeralda", "Morales", 35786093, 14, "Quality Engineering", 5000000, null);
		Expert glober15 = new Expert("Yuli", "Lopez", 36786094, 15, "Gamming", 5000000, null);
		SeniorManagement glober16 = new SeniorManagement("Lorena", "Martinez", 51986010, 16, "UI Engineering", 7000000,null);
		SeniorManagement glober17 = new SeniorManagement("Ricardo", "Cortes", 41986010, 17, "Big Data", 7000000, null);
		SeniorManagement glober18 = new SeniorManagement("Mauro", "Perez", 31986010, 18, "Digital Content", 7000000,null);
		SeniorManagement glober19 = new SeniorManagement("William", "Diaz", 21986010, 19, "Agile Delivery", 7000000,null);
		SeniorManagement glober20 = new SeniorManagement("Carolina", "Sandoval", 1986010, 20, "UX Design", 7000000,null);

		SoftwareDeveloper engineer1 = new SoftwareDeveloper("FOX");
		SoftwareDeveloper engineer6 = new SoftwareDeveloper("SWA");
		SoftwareDeveloper engineer11 = new SoftwareDeveloper("Disney");
		SoftwareDeveloper engineer16 = new SoftwareDeveloper("Labs");
//		QCAnalyst engineer2 = new QCAnalyst("SWA");
		QCAnalyst engineer7 = new QCAnalyst("Weld North");
		QCAnalyst engineer12 = new QCAnalyst("Disney");
		QCAnalyst engineer17 = new QCAnalyst("FOX");
		TAEAnalyst engineer3 = new TAEAnalyst("Labs");
		TAEAnalyst engineer8 = new TAEAnalyst("SWA");
		TAEAnalyst engineer13 = new TAEAnalyst("Weld North");
//		TAEAnalyst engineer18 = new TAEAnalyst("Disney");
		TechLead engineer4 = new TechLead("Disney");
		TechLead engineer9 = new TechLead("Direct TV");
		TechLead engineer14 = new TechLead("Labs");
		TechLead engineer19 = new TechLead("Disney");
//		PM engineer5 = new PM("Direct TV");
		PM engineer10 = new PM("SWA");
		PM engineer15 = new PM("Disney");
		PM engineer20 = new PM("FOX");

		glober1.setAssignationStatus(engineer1);
		/** I want to validate engineer2 is in Talent Pool **/
//		glober2.setAssignationStatus(engineer2);
		glober3.setAssignationStatus(engineer3);
		glober4.setAssignationStatus(engineer4);
		/** I want to validate engineer5 is in Talent Pool **/
//		glober5.setAssignationStatus(engineer5);
		glober6.setAssignationStatus(engineer6);
		glober7.setAssignationStatus(engineer7);
		glober8.setAssignationStatus(engineer8);
		glober9.setAssignationStatus(engineer9);
		glober10.setAssignationStatus(engineer10);
		glober11.setAssignationStatus(engineer11);
		glober12.setAssignationStatus(engineer12);
		glober13.setAssignationStatus(engineer13);
		glober14.setAssignationStatus(engineer14);
		glober15.setAssignationStatus(engineer15);
		glober16.setAssignationStatus(engineer16);
		glober17.setAssignationStatus(engineer17);
		/** I want to validate engineer18 is in Talent Pool **/
//		glober18.setAssignationStatus(engineer18);
		glober19.setAssignationStatus(engineer19);
		glober20.setAssignationStatus(engineer20);

		
		List<Glober> arrayGlobers;
		arrayGlobers = new ArrayList<Glober>();
		arrayGlobers.add(glober1);
		arrayGlobers.add(glober2);
		arrayGlobers.add(glober3);
		arrayGlobers.add(glober4);
		arrayGlobers.add(glober5);
		arrayGlobers.add(glober6);
		arrayGlobers.add(glober7);
		arrayGlobers.add(glober8);
		arrayGlobers.add(glober9);
		arrayGlobers.add(glober10);
		arrayGlobers.add(glober11);
		arrayGlobers.add(glober12);
		arrayGlobers.add(glober13);
		arrayGlobers.add(glober14);
		arrayGlobers.add(glober15);
		arrayGlobers.add(glober16);
		arrayGlobers.add(glober17);
		arrayGlobers.add(glober18);
		arrayGlobers.add(glober19);
		arrayGlobers.add(glober20);

		for (int i = 0; i < arrayGlobers.size(); i++) {

			System.out.println("\n");
			System.out.println("********************      GLOBANT STRUCTURE VALIDATION      **********************");
			System.out.println("Glober code: " + arrayGlobers.get(i).getEmployeeCode());
			System.out.println(
					"Glober name: " + arrayGlobers.get(i).getFirstName() + " " + arrayGlobers.get(i).getLastName());
			System.out.println("Studio: " + arrayGlobers.get(i).getStudio());
			System.out.println("Seniority: " + arrayGlobers.get(i).getSeniority());
			System.out.println("Status: " + arrayGlobers.get(i).validateAssignation());
			try {
				System.out.println("Proyect: " + arrayGlobers.get(i).getAssignationStatus().getProjectName());
				System.out.println("Role: " + arrayGlobers.get(i).getAssignationStatus().getRole() + "\n");
			} catch (Exception e) {
				System.out.println("GLOBER NOT ASSIGNED TO A PROJECT\n");
			}
			System.out.println("*********************************************************************************");
			arrayGlobers.get(i).printResponsabilities();
			System.out.println("*********************************************************************************");
			try {
				System.out.println(arrayGlobers.get(i).getAssignationStatus().printAssignations());
			} catch (Exception e) {
				System.out.println("\n NO ASSIGNATIONS \n");
			}
			System.out.println("*********************************************************************************");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Glober authorized to");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(arrayGlobers.get(i).enjoyBenefits());
			System.out.println(arrayGlobers.get(i).joinLabs());
			System.out.println(arrayGlobers.get(i).takeEnglishLessons());
			System.out.println(arrayGlobers.get(i).takeTrainingCourses());
			System.out.println(arrayGlobers.get(i).supportStudio());
			System.out.println("**********************************************************************************");

		}

	}
}
