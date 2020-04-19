package com.java.training.role;

import com.java.training.data.Assignation;
import com.java.training.interfaces.AssignationsQcTae;
import com.java.training.interfaces.AssignationsSdQcTae;

public class TAEAnalyst extends Assignation implements AssignationsSdQcTae, AssignationsQcTae{

	public TAEAnalyst(String projectName) {
		super(projectName);
		setRole("TAE Analyst");
	}

	/** These methods belongs to any Glober assigned to a project **/
	
	@Override
	public String printAssignations() {
		System.out.println("The assignations according with the rol are:\n");
		return documentWork() + attendScrumCeremonies() + attendReleases()
		+ detectBusinessOportunities() + createTestScenarios() + runTest() + documentTest() + defectWriteUp()
		+ closeDefects();
	}

	@Override
	public String documentWork() {
		return "* Attach scripts to tickets in test\n";
	}

	@Override
	public String attendScrumCeremonies() {
		return "* Attend to these ceremonies: \n" +
				"  - Sprint Planning\n" +
				"  - Daily Scrum\n"+
				"  - Sprint Retrospective\n";
	}

	@Override
	public String attendReleases() {
		return "* Test the artifacts under release\n";
	}

	@Override
	public String detectBusinessOportunities() {
		return "* Share my business opportunities findings with my Technical Director\n";
	}

	/** These methods are shared with Software Developer and QC Analyst **/

	@Override
	public String createTestScenarios() {
		return "* Write automated test cases\n";
	}

	@Override
	public String runTest() {
		return "* Run automated test\n";
	}

	@Override
	public String documentTest() {
		return "* Attach job results to Artifactory\n";
	}

	/** These methods are shared a QC Analyst **/
	
	@Override
	public String defectWriteUp() {
		return "* Write Defects from automated test results\n";
		
	}

	@Override
	public String closeDefects() {
		return "* Verify Bugs and document them with job results\n";
		
	}
	
}
