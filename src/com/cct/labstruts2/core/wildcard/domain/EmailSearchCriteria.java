package com.cct.labstruts2.core.wildcard.domain;

public class EmailSearchCriteria {

	private String criteriaKey;
	private Email data = new Email();

	public Email getData() {
		return data;
	}

	public void setData(Email data) {
		this.data = data;
	}

	public String getCriteriaKey() {
		return criteriaKey;
	}

	public void setCriteriaKey(String criteriaKey) {
		this.criteriaKey = criteriaKey;
	}
}
