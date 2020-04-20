package StructureGlobant;

public class ScrumMaster extends Glober {

	public ScrumMaster 	(int dni, String name, String last_name, String gender, String seniority, String project,
			float salary) {
		super(dni, name, last_name, gender, seniority, project, salary);
	
	}

	@Override
	public String showTask() {
		
		return "Make financial reports";
	}
	
	
	

}
