package com.java.training.data;

import java.util.Date;

public abstract class Assignation {

	private String projectName;
	private String role;
	private Date assignationDate;

	public Assignation(String projectName) {
		setProjectName(projectName);
	}

	public abstract String printAssignations();

	public abstract String documentWork();

	public abstract String attendScrumCeremonies();

	public abstract String attendReleases();

	public abstract String detectBusinessOportunities();

	public String getProjectName() {
		return projectName;
	}

	private void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRole() {
		return role;
	}

	protected void setRole(String role) {
		this.role = role;
	}

	public Date getAssignationDate() {
		return assignationDate;
	}

	protected void setAssignationDate(Date assignationDate) {
		this.assignationDate = assignationDate;
	}

}
