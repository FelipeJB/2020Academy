
public class JuniorEngineer extends Employee implements Job{

	public int salary;
	public String project;
	public String role;
	
	public JuniorEngineer(int id, String fName, String lName, int age, int salary, String project, String role) {
		super(id, fName, lName, age);
		this.salary = salary;
		this.project = project;
		this.role = role;
	}

	@Override
	public void jodDescription() {
		System.out.println("----------------------------------");
		System.out.println("Employee: " + id + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + " \nSalary: " + salary + "\nProject: " + project + "\nRole: " + role + "\n");
		System.out.println("----------------------------------");
	}

}
