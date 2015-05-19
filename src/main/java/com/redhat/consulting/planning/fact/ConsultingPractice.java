package com.redhat.consulting.planning.fact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
public class ConsultingPractice implements Solution<HardSoftScore> {
	
	List<Role> roleList;
	List<Consultant> consultantList;
    private HardSoftScore score;
	
	@PlanningEntityCollectionProperty
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	@ValueRangeProvider(id="consultantList")
	public List<Consultant> getConsultantList() {
		return consultantList;
	}
	public void setConsultantList(List<Consultant> consultantList) {
		this.consultantList = consultantList;
	}
    public HardSoftScore getScore() {
		return score;
	}
	public void setScore(HardSoftScore score) {
		this.score = score;
	}

    // ************************************************************************
    // Complex methods
    // ************************************************************************

	public Collection<? extends Object> getProblemFacts() {
        List<Object> facts = new ArrayList<Object>();
        facts.addAll(consultantList);
        // Do not add the planning entity's (processList) because that will be done automatically
        return facts;
    }

}
