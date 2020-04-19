package com.java.training.role;

import com.java.training.data.Assignation;
import com.java.training.interfaces.AssignationTechPm;

public  class TechLead extends Assignation implements AssignationTechPm  {

	public TechLead(String projectName) {
		super(projectName);
		setRole("Tech Lead");
	}

	/** These methods belongs to any Glober assigned to a project **/
	
	@Override
	public String printAssignations() {
		System.out.println("The assignations according with the rol are:\n");
		return documentWork() + attendScrumCeremonies() + attendReleases()
		+ detectBusinessOportunities() + leadTeam() + managementTeam() + focalPoint()  + performEvaluation();
	}

	@Override
	public String documentWork() {
		return "* Document pendings after team meetings\n";
	}

	@Override
	public String attendScrumCeremonies() {
		return "* Attend to these ceremonies: \n" +
				"  - Sprint Planning\n" +
				"  - Sprint Review\n"+
				"  - Sprint Retrospective\n";
	}

	@Override
	public String attendReleases() {
		return "* To be available to answer doubts on release days\n";
	}

	@Override
	public String detectBusinessOportunities() {
		return "* Discuss business opportunities with the PM\n";
	}

	/** These methods are shared with a PM **/
	
	@Override
	public String leadTeam() {
		return "* Guide the team technically\n";
		
	}

	@Override
	public String managementTeam() {
		return "* Lead weekly team meetings\n";
		
	}

	@Override
	public String focalPoint() {
		return "* Show enough technical knowledge to advise customers\n";
		
	}

	@Override
	public String performEvaluation() {
		return "* Add comments in BetterMe Evaluations\n"; 
	
	}
	
}
