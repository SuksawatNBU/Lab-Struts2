package com.cct.labstruts2.web.wildcard.action;

import java.util.Calendar;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.cct.labstruts2.core.wildcard.domain.Email;
import com.cct.labstruts2.core.wildcard.domain.EmailModel;
import com.cct.labstruts2.core.wildcard.domain.EmailSearchCriteria;
import com.cct.labstruts2.core.wildcard.service.EmailManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmailAction extends ActionSupport implements ModelDriven<EmailModel> {

	private static final long serialVersionUID = 2947720634552845418L;

	private EmailModel model = new EmailModel();
	
	public String init() {
		System.out.println("init");
		return "init";
	}
	
	public String search() {
		System.out.println("search");
		try {
			manageSearch();
			
			EmailManager manager = new EmailManager();
			List<Email> listResult = manager.search(getModel().getCriteria());
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
			EmailManager manager = new EmailManager();
			manager.add(getModel().getData());
			
			getModel().setData(new Email());
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
			EmailSearchCriteria criteria = (EmailSearchCriteria) ServletActionContext.getRequest().getSession().getAttribute(getModel().getCriteria().getCriteriaKey());	
			getModel().setCriteria(criteria);
		}
		ServletActionContext.getRequest().getSession().setAttribute(getModel().getCriteria().getCriteriaKey(), getModel().getCriteria());
		
	}

	@Override
	public EmailModel getModel() {
		return model;
	}
}
