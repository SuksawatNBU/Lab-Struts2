package com.cct.labstruts2.web.actionsupport.action;

import com.cct.labstruts2.core.actionsupport.domain.LoginModel;
import com.cct.labstruts2.core.actionsupport.domain.LoginResult;
import com.opensymphony.xwork2.ActionSupport;

public class LoginActionSupportAction extends ActionSupport{

	private static final long serialVersionUID = -521363465804905288L;

	private LoginModel model = new LoginModel();
	
	public String init() {
		return LOGIN;
	}
	
	public String login() {
		System.out.println("Username : " + model.getLogin().getUsername());
		System.out.println("Password : " + model.getLogin().getPassword());
		
		LoginResult result = new LoginResult();
		if(model.getLogin().getUsername() == "admin" || "admin".equals(model.getLogin().getUsername())){
			result.setMessage(getText("acc.success"));
			model.setLoginResult(result);
			return SUCCESS;
		}else{
			result.setMessage(getText("acc.loginfail"));
			model.setLoginResult(result);
			return ERROR;
		}
	}

	public LoginModel getModel() {
		return model;
	}

	public void setModel(LoginModel model) {
		this.model = model;
	}
}
