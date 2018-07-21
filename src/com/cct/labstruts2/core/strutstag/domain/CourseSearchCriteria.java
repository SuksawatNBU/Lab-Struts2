package com.cct.labstruts2.core.strutstag.domain;

import java.io.Serializable;

public class CourseSearchCriteria implements Serializable{

	private static final long serialVersionUID = 4869653564735154086L;

	private String categoryId;
	private String lecturerId;
	private String courseName;
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
