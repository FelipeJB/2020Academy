package GlobantStructure;

public class TechnicalLeader extends Glober{

	public TechnicalLeader(int dni, String name, String last_name, String gender, String seniority, String project,
			float salary) {
		super(dni, name, last_name, gender, seniority, project, salary);

	
	}

	@Override
	public String showTask() {
		return "Lead projects";
	}
	
	
	@Override
	public String toString() {
		return "Technical Leader " + super.toString();
	}

	

}
