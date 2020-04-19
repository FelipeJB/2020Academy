package com.java.training.data;

import java.util.ArrayList;
import java.util.List;

public abstract class Glober {

	private String firstName;
	private String lastName;
	private int IdNumber;
	private int employeeCode;
	private String studio;
	private String seniority;
	private int salary;
	public List<String> arrayResponsabilities;
	Assignation assignationStatus;

	public Glober(String firstName, String lastName, int IdNumber, int employeeCode, String studio, int salary,
			Assignation assignationStatus) {
		setFirstName(firstName);
		setLastName(lastName);
		setIdNumber(IdNumber);
		setEmployeeCode(employeeCode);
		setStudio(studio);
		setSalary(salary);
		setAssignationStatus(assignationStatus);

		arrayResponsabilities = new ArrayList<String>();

	}

	/** Common Methods for Globers **/

	public String validateAssignation() {

		if (assignationStatus == null) {
			return "Glober in Talent Pool\n";
		} else
			return "Glober assigned to a Proyect\n";
	}

	protected void assignResponsabilities(String seniority) {
		
		switch (seniority) {
		case "Junior Analyst":

			arrayResponsabilities.add("1.  Assist the team with all aspects of software design, coding and testing");
			arrayResponsabilities.add("2.  Attending and contributing to meetings");
			arrayResponsabilities.add("3.  Responding to requests from the team");
			arrayResponsabilities.add("4.  Developing solutions\n");

			break;

		case "Senior Analyst":

			arrayResponsabilities.add("1.  Contribute and lead studio initiatives");
			arrayResponsabilities.add("2.  Performing mentories");
			arrayResponsabilities.add("3.  Team management");
			arrayResponsabilities.add("4.  Designing and developing solutions");
			arrayResponsabilities.add("5.  Responding to requests from the customer");
			arrayResponsabilities.add("6.  Attending and contributing to meetings\n");

			break;

		case "Expert":

			arrayResponsabilities.add("1.  Work on presales proposals");
			arrayResponsabilities.add("2.  Team management");
			arrayResponsabilities.add("3.  Performing interviews");
			arrayResponsabilities.add("4.  Define and implement approaches and solutions for complex projects");
			arrayResponsabilities.add("5.  Keep close record of contracts\n");

			break;

		case "Senior Management":

			arrayResponsabilities.add("1.  Metric management");
			arrayResponsabilities.add("2.  Team management");
			arrayResponsabilities.add("3.  Performing interviews");
			arrayResponsabilities.add("4.  Risk & Dependency management");
			arrayResponsabilities.add("5.  Coach client’s Product Owner in process-related aspects");
			arrayResponsabilities.add("6.  Keep close record of contracts\n");

			break;

		default:
			System.out.println("Wrong Data - Seniority doesn't exit\n");
			System.exit(0);
			break;

		}
	}

	public void printResponsabilities() {
		System.out.println("The responsabilities according with the seniority are:\n");
		for (int i = 0; i < arrayResponsabilities.size(); i++) {
			System.out.println(arrayResponsabilities.get(i));
		}
	}

	public abstract String supportStudio();

	public String enjoyBenefits() {
		String benefits = "Enjoy benefits:\n" + "* Fruit\n" + "* Massage\n" + "* After Office\n" + "* Ping Pong\n";
		return benefits;
	}

	public String joinLabs() {
		String labs = "Be part of Labs:\n" + "* Propose my own idea\n" + "* Look for a project to working on\n"
				+ "* Join in a labs team\n";
		return labs;
	}

	public String takeEnglishLessons() {
		String english = "Take English Classes:\n" + "* Take a placement test\n" + "* Be assigned to a Level\n"
				+ "* Choose a schedule\n";
		return english;
	}

	public String takeTrainingCourses() {
		String training = "Take Training Courses:\n" + "* Join to Acamica\n" + "* Select one course\n"
				+ "* Take the lesson and quizzes\n";
		return training;
	}

	/** Getters and Setters **/

	public String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdNumber() {
		return IdNumber;
	}

	private void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	private void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getStudio() {
		return studio;
	}

	private void setStudio(String studio) {
		this.studio = studio;
	}

	public String getSeniority() {
		return seniority;
	}

	protected void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	public int getSalary() {
		return salary;
	}

	private void setSalary(int salary) {
		this.salary = salary;
	}

	public Assignation getAssignationStatus() {
		return assignationStatus;
	}

	public void setAssignationStatus(Assignation assignationStatus) {
		this.assignationStatus = assignationStatus;
	}

	public List<String> getArrayResponsabilities() {
		return arrayResponsabilities;
	}

	private void setArrayResponsabilities(List<String> arrayResponsabilities) {
		this.arrayResponsabilities = arrayResponsabilities;
	}

}
