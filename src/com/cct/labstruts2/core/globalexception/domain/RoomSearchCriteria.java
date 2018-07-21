package com.cct.labstruts2.core.globalexception.domain;

public class RoomSearchCriteria {

	private String criteriaKey;
	private Room data = new Room();

	public Room getData() {
		return data;
	}

	public void setData(Room data) {
		this.data = data;
	}

	public String getCriteriaKey() {
		return criteriaKey;
	}

	public void setCriteriaKey(String criteriaKey) {
		this.criteriaKey = criteriaKey;
	}
}
