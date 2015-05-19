package com.redhat.consulting.planning;

import java.util.ArrayList;
import java.util.List;

import com.redhat.consulting.planning.fact.Consultant;
import com.redhat.consulting.planning.fact.ConsultingPractice;
import com.redhat.consulting.planning.fact.Role;

/*
 * Titles:
 * 1 = Junior Consultant
 * 2 = Senior Consultant
 * 3 = Architect
 * 4 = SDM
 */

public class ConsultantProjectGenerator {
	
	public static ConsultingPractice generateConsultingPractice(ConsultingPractice cp) {
		List<Consultant> consultants = new ArrayList<Consultant>();
		List<Role> roles = new ArrayList<Role>();
		Consultant c = null;
		Role r = null;
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("John Alessio");
		c.setName("James Gosling");
		c.setTitle(3);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("John Alessio");
		c.setName("Vladimir Putin");
		c.setTitle(3);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("John Alessio");
		c.setName("Jimbo Brownback");
		c.setTitle(3);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("John Alessio");
		c.setName("Danko Jones");
		c.setTitle(3);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("John Alessio");
		c.setName("Dubee the Duck");
		c.setTitle(3);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jim Whitehurst");
		c.setName("Donovan McNabb");
		c.setTitle(4);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jim Whitehurst");
		c.setName("Vishnu Valencia");
		c.setTitle(4);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jim Whitehurst");
		c.setName("Chocolate Aardvark");
		c.setTitle(4);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jim Whitehurst");
		c.setName("Cthulhu Jones");
		c.setTitle(4);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Barack Obama");
		c.setName("Claude Giroux");
		c.setTitle(1);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("George Bush");
		c.setName("Steven Stamkos");
		c.setTitle(2);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jeb Bush");
		c.setName("Justin Bieber");
		c.setTitle(1);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Bill Clinton");
		c.setName("Magic Johnson");
		c.setTitle(2);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jeb Bush");
		c.setName("Jay Avance");
		c.setTitle(1);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Bill Clinton");
		c.setName("Randall Hutchinson");
		c.setTitle(2);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jeb Bush");
		c.setName("Jurgen Klinsman");
		c.setTitle(1);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Bill Clinton");
		c.setName("Miroslav Klose");
		c.setTitle(2);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jeb Bush");
		c.setName("Brian Williams");
		c.setTitle(1);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Bill Clinton");
		c.setName("Inigo Montoya");
		c.setTitle(2);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jeb Bush");
		c.setName("Julie Welker");
		c.setTitle(1);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Bill Clinton");
		c.setName("Rugger Al");
		c.setTitle(2);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Jeb Bush");
		c.setName("Diggy Dog");
		c.setTitle(1);
		consultants.add(c);
		
		c = new Consultant();
		c.setHoursPerWeek(40);
		c.setManager("Bill Clinton");
		c.setName("Diggy Hoppig");
		c.setTitle(2);
		consultants.add(c);
		
		// Citi Project 1
		
		r = new Role();
		r.setProjectId("Citi Project 1");
		r.setRoleType(1);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Citi Project 1");
		r.setRoleType(1);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Citi Project 1");
		r.setRoleType(2);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Citi Project 1");
		r.setRoleType(2);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Citi Project 1");
		r.setRoleType(3);
		r.setWeeklyHours(20);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Citi Project 1");
		r.setRoleType(4);
		r.setWeeklyHours(5);
		roles.add(r);
		
		// Citi Project 2
		
		r = new Role();
		r.setProjectId("Citi Project 2");
		r.setRoleType(1);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Citi Project 2");
		r.setRoleType(1);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Citi Project 1");
		r.setRoleType(4);
		r.setWeeklyHours(5);
		roles.add(r);
		
		// Cigna Project 1
		
		r = new Role();
		r.setProjectId("Cigna Project 1");
		r.setRoleType(2);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Cigna Project 1");
		r.setRoleType(4);
		r.setWeeklyHours(5);
		roles.add(r);
		
		// Cigna Project 2
		
		r = new Role();
		r.setProjectId("Cigna Project 2");
		r.setRoleType(3);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("Cigna Project 2");
		r.setRoleType(4);
		r.setWeeklyHours(5);
		roles.add(r);
		
		// AAP Project 1
		
		r = new Role();
		r.setProjectId("AAP Project 1");
		r.setRoleType(1);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("AAP Project 1");
		r.setRoleType(1);
		r.setWeeklyHours(40);
		roles.add(r);
		
		r = new Role();
		r.setProjectId("AAP Project 1");
		r.setRoleType(1);
		r.setWeeklyHours(40);
		roles.add(r);
		
		// Create solution object
		
		cp = new ConsultingPractice();
		cp.setConsultantList(consultants);
		cp.setRoleList(roles);
		
		return cp;
				
	}

}
