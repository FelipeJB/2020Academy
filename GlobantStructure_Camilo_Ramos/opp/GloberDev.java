package org.globant.opp;

public class GloberDev extends Glober implements WorkDescription{
		
	private int salary;
	private String assignation;
	public GloberDev(String name, int age, int experience, String role,int salary, String assignation) {
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
		 +"\nResponsabilyty: Develop a product\n");
		
	}
	

}
