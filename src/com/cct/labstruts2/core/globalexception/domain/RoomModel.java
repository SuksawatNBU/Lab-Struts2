package com.cct.labstruts2.core.globalexception.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RoomModel implements Serializable {

	private static final long serialVersionUID = 7344347017217622685L;

	// เงือนไขการค้นหา
	private RoomSearchCriteria criteria = new RoomSearchCriteria();

	// ผลลัพธ์การค้นหา
	private List<Room> listResult = new ArrayList<Room>();
	
	// สำหรับเพิ่มข้อมุล
	private Room data = new Room();
	
	private String token;
	
	public Room getData() {
		return data;
	}

	public void setData(Room data) {
		this.data = data;
	}

	public RoomSearchCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(RoomSearchCriteria criteria) {
		this.criteria = criteria;
	}

	public List<Room> getListResult() {
		return listResult;
	}

	public void setListResult(List<Room> listResult) {
		this.listResult = listResult;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
