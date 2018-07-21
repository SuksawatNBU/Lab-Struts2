package com.cct.labstruts2.core.strutstag.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable{

	private static final long serialVersionUID = -7080059571635186057L;

	private Long courseId;
	private String courseName;
	private String courseDetail;
	private String price;
	private String lecturerId;
	private String lecturer;
	private String categoryId;
	private String category;
	private String active;
	private List<String> listCurriculum = new ArrayList<>();
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	public List<String> getListCurriculum() {
		return listCurriculum;
	}
	public void setListCurriculum(List<String> listCurriculum) {
		this.listCurriculum = listCurriculum;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
}
