package com.cct.labstruts2.web.interceptor.action;

import java.util.Calendar;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.cct.labstruts2.core.interceptor.domain.Booking;
import com.cct.labstruts2.core.interceptor.domain.BookingModel;
import com.cct.labstruts2.core.interceptor.domain.BookingSearchCriteria;
import com.cct.labstruts2.core.interceptor.service.BookingManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookingAction extends ActionSupport implements ModelDriven<BookingModel> {

	private static final long serialVersionUID = 2947720634552845418L;

	private BookingModel model = new BookingModel();
	
	public String init() {
		System.out.println("init");
		return "init";
	}
	
	public String search() {
		System.out.println("search");
		try {
			manageSearch();
			
			BookingManager manager = new BookingManager();
			List<Booking> listResult = manager.search(getModel().getCriteria());
			if (listResult.size() == 0) {
				System.out.println("Data not found.");
				addActionMessage("Data not found.");
			} else {
				System.out.println("listResult: " + listResult.size());
				getModel().setListResult(listResult);
			}
		} catch (Exception e) {
			addActionMessage(e.toString());
			e.printStackTrace();
		}
		return "search";
	}
	
	public String gotoAdd() {
		System.out.println("gotoAdd");
		return "gotoAdd";
	}
	
	public String add() {
		System.out.println("add");
		try {
			BookingManager manager = new BookingManager();
			manager.add(getModel().getData());
			
			getModel().setData(new Booking());
			addActionMessage("Data has been saved successfully.");
		} catch (Exception e) {
			addActionMessage(e.toString());
			e.printStackTrace();
		}
		return "add";
	}
	
	public String cancelAdd() {
		System.out.println("cancelAdd");
		return "searchDo";
	}
	
	public void manageSearch() {
		if ((getModel().getCriteria().getCriteriaKey() == null)
				|| getModel().getCriteria().getCriteriaKey().isEmpty()) {
			getModel().getCriteria().setCriteriaKey(String.valueOf(Calendar.getInstance().getTimeInMillis()));
		} else {
			BookingSearchCriteria criteria = (BookingSearchCriteria) ServletActionContext.getRequest().getSession().getAttribute(getModel().getCriteria().getCriteriaKey());	
			getModel().setCriteria(criteria);
		}
		ServletActionContext.getRequest().getSession().setAttribute(getModel().getCriteria().getCriteriaKey(), getModel().getCriteria());
		
	}

	@Override
	public BookingModel getModel() {
		return model;
	}
}
