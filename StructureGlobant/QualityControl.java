package StructureGlobant;

import javax.lang.model.element.QualifiedNameable;

public class QualityControl extends Glober {
	private String type_tester;

	public QualityControl(int dni, String name, String last_name, String gender, String seniority, String project,
			float salary, String type_tester) {
		super(dni, name, last_name, gender, seniority, project, salary);
		this.type_tester = type_tester;
		
	}


	@Override
	public String showTask() {
		return "Test US";
	}


	@Override
	public String toString() {
		return "QuelityControl  " + type_tester + super.toString();
	}
	
	
	

}
