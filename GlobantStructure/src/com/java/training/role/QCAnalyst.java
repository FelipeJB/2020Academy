package com.java.training.role;

import com.java.training.data.Assignation;
import com.java.training.interfaces.AssignationsQcTae;
import com.java.training.interfaces.AssignationsSdQcTae;

public class QCAnalyst extends Assignation implements AssignationsSdQcTae, AssignationsQcTae {

	public QCAnalyst(String projectName) {
		super(projectName);
		setRole("QC Analyst");
	}

	/** These methods belongs to any Glober assigned to a project **/

	@Override
	public String printAssignations() {
		System.out.println("The assignations according with the rol are:\n");
		return  documentWork() + attendScrumCeremonies() + attendReleases()
				+ detectBusinessOportunities() + createTestScenarios() + runTest() + documentTest() + defectWriteUp()
				+ closeDefects();
	}

	@Override
	public String documentWork() {
		return "* Update assigned tickets in test\n";
	}

	@Override
	public String attendScrumCeremonies() {
		return "* Attend to these ceremonies: \n" + "  - Sprint Planning\n" + "  - Daily Scrum\n"
				+ "  - Sprint Review\n";
	}

	@Override
	public String attendReleases() {
		return "* Test the artifacts under release\n";
	}

	@Override
	public String detectBusinessOportunities() {
		return "* Share my business opportunities findings with my Tech Director\n";
	}

	/** These methods are shared with Software Developer and TAE Analyst **/

	@Override
	public String createTestScenarios() {
		return "* Create functional test cases\n";
	}

	@Override
	public String runTest() {
		return "* Run manual test\n";
	}

	@Override
	public String documentTest() {
		return "* Document Test Cases Snecarios in Jira\n";
	}

	/** These methods are shared a TAE Analyst **/

	@Override
	public String defectWriteUp() {
		return "* Create Bugs in Jira\n";

	}

	@Override
	public String closeDefects() {
		return "* Verify Bugs and document them with screenshots\n";

	}

}
