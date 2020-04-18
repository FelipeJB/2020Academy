package org.globant.opp;

public class GloberTD extends Glober implements WorkDescription{
		
		private int salary;
		private String assignation;
		
	public GloberTD(String name, int age, int experience,String role, int salary, String assignation) {
		super(name, age, experience,role);
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
			 +"\nResponsabilyty: Leadering teams\n");
		
	}

}
