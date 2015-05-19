package com.redhat.consulting.planning.fact;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Consultant {
	
	String name;
	int title;
	String manager;
	int hoursPerWeek;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
