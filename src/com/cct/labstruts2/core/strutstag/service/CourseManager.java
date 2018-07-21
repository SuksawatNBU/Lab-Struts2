package com.cct.labstruts2.core.strutstag.service;

import java.util.ArrayList;
import java.util.List;

import com.cct.labstruts2.core.strutstag.domain.Course;
import com.cct.labstruts2.core.strutstag.domain.SelectItem;

public class CourseManager {
	
	public CourseManager() {
		// TODO Auto-generated constructor stub
	}
	
	public List<SelectItem> loadComboLecturer() throws Exception{
		List<SelectItem> listLecturer = new ArrayList<>();
		SelectItem item = null;
		try {
			for (int i = 0; i < 5; i++) {
				item = new SelectItem();
				item.setCode(""+(i+1));
				item.setDesc("Lecturer " + (i+1));
				listLecturer.add(item);
			}
		} catch (Exception e) {
			throw e;
		}
		return listLecturer;
	}
	
	public List<SelectItem> loadCategory() throws Exception{
		List<SelectItem> listCategory = new ArrayList<>();
		SelectItem item = null;
		try {
			String str = "";
			for (int i = 0; i < 3; i++) {
				switch (i+1) {
					case 1:
						str = "Mobile Application";
						break;
					case 2:
						str = "Web Development";
						break;
					case 3:
						str = "Software Engineering";
						break;
	
					default:
						break;
				}
				item = new SelectItem();
				item.setCode(""+(i+1));
				item.setDesc(str);
				listCategory.add(item);
			}
		} catch (Exception e) {
			throw e;
		}
		return listCategory;
	}
	
	public List<Course> search() throws Exception{
		List<Course> listResult = new ArrayList<>();
		Course course = null;
		
		try {
			List<String> listCurr = new ArrayList<>();
			listCurr.add("Introduction");
			listCurr.add("X");
			listCurr.add("Y");
			
			course = new Course();
			course.setActive("Y");
			course.setCourseId(1l);
			course.setCourseName("Course 1");
			course.setCourseDetail("Course 1 detail...");
			course.setLecturerId("1");
			course.setLecturer("Mr.A");
			course.setPrice("300$");
			course.setCategoryId("1");
			course.setCategory("Mobile Application");
			course.setListCurriculum(listCurr);
			listResult.add(course);
			
			course = new Course();
			course.setActive("Y");
			course.setCourseId(2l);
			course.setCourseName("Course 2");
			course.setCourseDetail("Course 2 detail...");
			course.setLecturerId("2");
			course.setLecturer("Mr.B");
			course.setPrice("500$");
			course.setCategoryId("1");
			course.setCategory("Mobile Application");
			course.setListCurriculum(listCurr);
			listResult.add(course);
			
			course = new Course();
			course.setActive("Y");
			course.setCourseId(3l);
			course.setCourseName("Course 3");
			course.setCourseDetail("Course 3 detail...");
			course.setLecturerId("3");
			course.setLecturer("Mr.C");
			course.setPrice("600$");
			course.setCategoryId("2");
			course.setCategory("Web Development");
			course.setListCurriculum(listCurr);
			listResult.add(course);
			
			course = new Course();
			course.setActive("N");
			course.setCourseId(4l);
			course.setCourseName("Course 4");
			course.setCourseDetail("Course 4 detail...");
			course.setLecturerId("4");
			course.setLecturer("Mr.D");
			course.setPrice("300$");
			course.setCategoryId("2");
			course.setCategory("Web Development");
			course.setListCurriculum(listCurr);
			listResult.add(course);
			
		} catch (Exception e) {
			throw e;
		}
		return listResult;
	}
	
	public Course view(Long id) throws Exception{
		Course course = null;
		try {
			//TODO
		} catch (Exception e) {
			throw e;
		}
		return course;
	}
}
