package GlobantStructure;

public class Champion extends Glober{

	public Champion(int dni, String name, String last_name, String gender, String seniority, String project,
			float salary) {
		super(dni, name, last_name, gender, seniority, project, salary);
	}

	@Override
	public String showTask() {
		return "Advise on questions in processes and policies";
	}
	
	

}
