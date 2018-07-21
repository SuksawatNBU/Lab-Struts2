package com.cct.labstruts2.core.strutstag.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseModel implements Serializable{

	private static final long serialVersionUID = 4960442353819725641L;
	
	//combo box
	private List<SelectItem> listLecturer = new ArrayList<>();
	private List<SelectItem> listCategory = new ArrayList<>();

	//Criteria
	private CourseSearchCriteria criteria = new CourseSearchCriteria();
	
	//result
	private List<Course> listResult = new ArrayList<>();
	
	//view
	private Course course = new Course();
	
	//page
	private String page;
	
	public List<SelectItem> getListLecturer() {
		return listLecturer;
	}

	public void setListLecturer(List<SelectItem> listLecturer) {
		this.listLecturer = listLecturer;
	}

	public List<SelectItem> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<SelectItem> listCategory) {
		this.listCategory = listCategory;
	}

	public CourseSearchCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(CourseSearchCriteria criteria) {
		this.criteria = criteria;
	}

	public List<Course> getListResult() {
		return listResult;
	}

	public void setListResult(List<Course> listResult) {
		this.listResult = listResult;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
}
