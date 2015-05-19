package com.redhat.consulting.planning.fact;

import java.util.List;

public class Project {
	
	String client;
	String id;
	List<Role> projectRoles;
	
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Role> getProjectRoles() {
		return projectRoles;
	}
	public void setProjectRoles(List<Role> projectRoles) {
		this.projectRoles = projectRoles;
	}

}
