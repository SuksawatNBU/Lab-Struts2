package com.cct.labstruts2.web.globalexception.action;

import com.cct.labstruts2.core.globalexception.domain.RoomModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RoomAction extends ActionSupport implements ModelDriven<RoomModel> {

	private static final long serialVersionUID = 370810398722729646L;
	
	private RoomModel model = new RoomModel();

	public RoomAction() {
		try {
			if (getModel().getCriteria().getCriteriaKey().isEmpty()) {
				System.out.println("Criteria key is empty.");
			}
		} catch (Exception e) {
			addActionMessage(e.toString());
			e.printStackTrace();
		}
	}
	
	public String init() {
		System.out.println("init");
		return "init";
	}
	
	public String search()  {
		System.out.println("search");
		try {
			if (getModel().getCriteria().getCriteriaKey().isEmpty()) {
				System.out.println("Criteria key is empty.");
			}
		} catch (Exception e) {
			addActionMessage(e.toString());
			e.printStackTrace();
			throw new NullPointerException();
		}
		return "search";
	}

	@Override
	public RoomModel getModel() {
		return model;
	}
}
