package com.cct.labstruts2.core.interceptor.domain;

public class BookingSearchCriteria {

	private String criteriaKey;
	private Booking data = new Booking();

	public Booking getData() {
		return data;
	}

	public void setData(Booking data) {
		this.data = data;
	}

	public String getCriteriaKey() {
		return criteriaKey;
	}

	public void setCriteriaKey(String criteriaKey) {
		this.criteriaKey = criteriaKey;
	}
}
