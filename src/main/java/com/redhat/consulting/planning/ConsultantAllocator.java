package com.redhat.consulting.planning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

import com.redhat.consulting.planning.fact.Consultant;
import com.redhat.consulting.planning.fact.ConsultingPractice;
import com.redhat.consulting.planning.fact.Role;

public class ConsultantAllocator {
	
    public static void main(String[] args) {
    	ConsultingPractice cp = new ConsultingPractice();
    	
        // Build the Solver
        SolverFactory solverFactory = SolverFactory.createFromXmlResource(
                "consultantAllocatorConfig.xml");
        Solver solver = solverFactory.buildSolver();

        System.out.println("Building unsolved consulting practice.");
        ConsultingPractice unsolvedConsultingPractice = ConsultantProjectGenerator.generateConsultingPractice(cp);

        // Solve the problem
        System.out.println("Solving problem.");
        solver.solve(unsolvedConsultingPractice);
        System.out.println("Getting best solution.");
        ConsultingPractice solvedConsultingPractice = (ConsultingPractice) solver.getBestSolution();

        // Display the result
        System.out.println("Going to display results...\n\n");
        
        System.out.println("\nSolved consultingPractice:\n"
                + toDisplayString(solvedConsultingPractice));
    }

    public static String toDisplayString(ConsultingPractice cp) {
        StringBuilder displayString = new StringBuilder();
        Map<String, Integer> totalHours = new HashMap<String, Integer>();
        for (Role role : cp.getRoleList()) {
            Consultant consultant = role.getConsultant();
            displayString.append("  ").append(role.getProjectId()).append(" / ").append(role.getRoleType())
            		.append(" -> ").append(consultant == null ? null : consultant.getName()).append(" / ")
            		.append(consultant.getTitle()).append("\n");
            if(!totalHours.containsKey(consultant.getName())) {
            	totalHours.put(consultant.getName(), 0);
            }
            int i = totalHours.get(consultant.getName());
            totalHours.put(consultant.getName(), i+role.getWeeklyHours());
        }
        for(Entry<String, Integer> e : totalHours.entrySet()) {
        	System.out.println("Consultant "+e.getKey()+" has been allocated "+e.getValue()+" hours per week.");
        }
        return displayString.toString();
    }

}
