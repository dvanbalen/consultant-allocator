package com.redhat.consulting.planning.fact;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

/*
 * Titles:
 * 1 = Junior Consultant
 * 2 = Senior Consultant
 * 3 = Architect
 * 4 = SDM
 */

@PlanningEntity
public class Role {
	
	public Consultant consultant;
	public String projectId;
	public int weeklyHours;
	public int roleType;

	@PlanningVariable(valueRangeProviderRefs = "consultantList")
	public Consultant getConsultant() {
		return consultant;
	}

	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public int getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(int weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
