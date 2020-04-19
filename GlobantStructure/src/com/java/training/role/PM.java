package com.java.training.role;

import com.java.training.data.Assignation;
import com.java.training.interfaces.AssignationTechPm;

public class PM extends Assignation implements AssignationTechPm {

	public PM(String projectName) {
		super(projectName);
		setRole("PM");
	}

	/** These methods belongs to a Glober assigned to a project **/

	@Override
	public String printAssignations() {
		System.out.println("The assignations according with the rol are:\n");
		return  documentWork() + attendScrumCeremonies() + attendReleases()
				+ detectBusinessOportunities() + leadTeam() + managementTeam() + focalPoint() + performEvaluation()
				+ manageBudget() + createIndicators();
	}

	@Override
	public String documentWork() {
		return "* Document customers meetings agreements\n";
	}

	@Override
	public String attendScrumCeremonies() {
		return "* Attend to these ceremonies: \n" + "  - Sprint Planning\n";
	}

	@Override
	public String attendReleases() {
		return "* To know the releases calendar\n";
	}

	@Override
	public String detectBusinessOportunities() {
		return "* Discuss Business Oportunities with the customer\n";
	}

	/** These methods are shared with a Teach Lead **/

	@Override
	public String leadTeam() {
		return "* Be a administrative guide for the team\n";

	}

	@Override
	public String managementTeam() {
		return "* Follow the team performance\n";

	}

	@Override
	public String focalPoint() {
		return "* Advise the client in business decision making\n";

	}

	@Override
	public String performEvaluation() {
		return "* Create Evaluations in Better Me\n";

	}

	/** These methods are proper to a PM **/

	public String manageBudget() {
		return "* Control the montly budget\n";
	}

	public String createIndicators() {
		return "* Create project indicators\n";
	}

}
