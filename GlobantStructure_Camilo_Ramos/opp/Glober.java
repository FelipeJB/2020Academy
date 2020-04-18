package org.globant.opp;

public class Glober {
	
	protected String name;
	protected String role;
	protected int age;
	protected int experience;
	
	public Glober(String name, int age, int experience, String role)
	{
		this.name=name;
		this.age=age;
		this.experience=experience;
		this.role=role;
	}
    
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getExperience()
	{
		return experience;
	}
	public String getRole()
	{
		return role;
	}


	public void wDescrtiption() {
		
	}
}
