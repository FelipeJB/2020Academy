package org.globant.opp;

public class GloberDesigner extends Glober implements WorkDescription{

	private int salary;
	private String assignation;
	public GloberDesigner(String name, int age, int experience, String role, int salary, String assignation) {
		super(name, age, experience, role);
		this.salary=salary;
		this.assignation=assignation;
	}

	@Override
	public void wDescrtiption() {
		System.out.println("Glober: "+getName()
		 +"\nAge: "+getAge()
		 +"\nExperience: "+getExperience()+" years"
		 +"\nRole: "+getRole()
		 +"\nSalary: "+salary
		 +"\nProject Assignation: "+assignation
		 +"\nResponsabilyty: Design a product\n");
		
	}

}
