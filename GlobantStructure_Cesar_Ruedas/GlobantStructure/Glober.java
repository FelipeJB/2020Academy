package GlobantStructure;

public abstract class Glober {
	private int dni;
	private String name;
	private String last_name;
	private String gender;
	private String seniority;
	private String project;
	private float salary;

	public Glober(int dni, String name, String last_name, String gender, String seniority, String project,
			float salary) {
		super();
		this.dni = dni;
		this.name = name;
		this.last_name = last_name;
		this.gender = gender;
		this.seniority = seniority;
		this.project = project;
		this.salary = salary;
	}

	public int getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public String getLast_name() {
		return last_name;
	}

	public float getSalary() {
		return salary;
	}

	public String getGender() {
		return gender;
	}

	public String getSeniority() {
		return seniority;
	}

	public String getProject() {
		return project;
	}

	public abstract String showTask();

	@Override
	public String toString() {
		return "\nName = " + name + "\nLast_name = " + last_name + "\nDni = " + dni + "\nGender = " + gender
				+ "\nSeniority = " + seniority + "\nProject = " + project + "\nSalary = " + salary;
	}

}
