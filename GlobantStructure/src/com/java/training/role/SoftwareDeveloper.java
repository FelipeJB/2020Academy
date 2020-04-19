package com.java.training.role;

import com.java.training.data.Assignation;
import com.java.training.interfaces.AssignationsSdQcTae;

public class SoftwareDeveloper extends Assignation implements AssignationsSdQcTae {

	public SoftwareDeveloper(String projectName) {
		super(projectName);
		setRole("Software Developer");
	}

	/** These methods belongs to any Glober assigned to a project **/

	@Override
	public String printAssignations() {
		System.out.println("The assignations according with the rol are:\n");
		return documentWork() + attendScrumCeremonies() + attendReleases() + detectBusinessOportunities()
				+ createTestScenarios() + runTest() + documentTest() + developSoftware() + fixDefects();
	}

	@Override
	public String documentWork() {
		return "* Update assigned tickets in progress\n";
	}

	@Override
	public String attendScrumCeremonies() {
		return "* Attend to these ceremonies: \n" + "  - Sprint Planning\n" + "  - Daily Scrum\n"
				+ "  - Sprint Review\n" + "  - Sprint Retrospective\n";
	}

	@Override
	public String attendReleases() {
		return "* Interviene in a Release when something goes wrong\n";
	}

	@Override
	public String detectBusinessOportunities() {
		return "* Share my business opportunities findings with my Tech Lead\n";
	}

	/** These methods are shared with QC Analyst and TAE Analyst **/

	@Override
	public String createTestScenarios() {
		return "* Create Test Unit Scenarios\n";
	}

	@Override
	public String runTest() {
		return "* Run Test Unit\n";
	}

	@Override
	public String documentTest() {
		return "* Document tickets in Dev Complete status\n";
	}

	/** These methods are proper to Software Developer **/

	public String developSoftware() {
		return "* Develop Software solutions\n";
	}

	public String fixDefects() {
		return "* Fix Bugs\n";
	};

}
