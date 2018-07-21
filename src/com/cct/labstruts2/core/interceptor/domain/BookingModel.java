package com.cct.labstruts2.core.interceptor.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookingModel implements Serializable {

	private static final long serialVersionUID = 7344347017217622685L;

	// เงือนไขการค้นหา
	private BookingSearchCriteria criteria = new BookingSearchCriteria();

	// ผลลัพธ์การค้นหา
	private List<Booking> listResult = new ArrayList<Booking>();
	
	// สำหรับเพิ่มข้อมุล
	private Booking data = new Booking();
	
	private String token;
	
	public Booking getData() {
		return data;
	}

	public void setData(Booking data) {
		this.data = data;
	}

	public BookingSearchCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(BookingSearchCriteria criteria) {
		this.criteria = criteria;
	}

	public List<Booking> getListResult() {
		return listResult;
	}

	public void setListResult(List<Booking> listResult) {
		this.listResult = listResult;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
