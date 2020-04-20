package GlobantStructure;

public class Developer extends Glober {

	private String language;

	public Developer(int dni, String name, String last_name, String gender, String seniority, String project,
			float salary, String language) {
		super(dni, name, last_name, gender, seniority, project, salary);
		this.language = language;

	}

	@Override
	public String showTask() {
		return "Develop US";
	}

	@Override
	public String toString() {
		return "Developer " + language + super.toString();
	}

}
