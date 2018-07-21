package com.cct.labstruts2.web.strutstag.action;


import com.cct.labstruts2.core.strutstag.domain.Course;
import com.cct.labstruts2.core.strutstag.domain.CourseModel;
import com.cct.labstruts2.core.strutstag.service.CourseManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CourseAction extends ActionSupport implements ModelDriven<CourseModel>{

	private static final long serialVersionUID = 1890397877922414132L;

	private CourseModel model = new CourseModel();
	
	public CourseAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String init() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			loadCombo();
		}
		return "init";
	}
	
	public String search() {
		try {
			CourseManager manager = new CourseManager();
			model.setListResult(manager.search());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			loadCombo();
		}
		return SUCCESS;
	}
	
	public String view() {
		try {
			CourseManager manager = new CourseManager();
			model.setListResult(manager.search());
			
			for(Course c : model.getListResult()){
				if(getModel().getCourse().getCourseId().equals(c.getCourseId())){
					Course course = new Course();
					course.setCourseId(c.getCourseId());
					course.setCourseName(c.getCourseName());
					course.setCourseDetail(c.getCourseDetail());
					course.setPrice(c.getPrice());
					course.setLecturerId(c.getLecturerId());
					course.setLecturer(c.getLecturer());
					course.setCategoryId(c.getCategoryId());
					course.setCategory(c.getCategory());
					course.setActive(c.getActive());
					course.setListCurriculum(c.getListCurriculum());
					model.setCourse(course);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			loadCombo();
		}
		return "view";
	}
	
	public String edit() {
		try {
			CourseManager manager = new CourseManager();
			model.setListResult(manager.search());
			
			for(Course c : model.getListResult()){
				if(getModel().getCourse().getCourseId().equals(c.getCourseId())){
					Course course = new Course();
					course.setCourseId(c.getCourseId());
					course.setCourseName(c.getCourseName());
					course.setCourseDetail(c.getCourseDetail());
					course.setPrice(c.getPrice());
					course.setLecturerId(c.getLecturerId());
					course.setLecturer(c.getLecturer());
					course.setCategoryId(c.getCategoryId());
					course.setCategory(c.getCategory());
					course.setActive(c.getActive());
					course.setListCurriculum(c.getListCurriculum());
					model.setCourse(course);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			loadCombo();
		}
		return "view";
	}
	
	private void loadCombo() {
		try {
			CourseManager manager = new CourseManager();
			model.setListLecturer(manager.loadComboLecturer());
			model.setListCategory(manager.loadCategory());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public CourseModel getModel() {
		return model;
	}

}
