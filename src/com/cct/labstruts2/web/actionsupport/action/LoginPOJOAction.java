package com.cct.labstruts2.web.actionsupport.action;

import java.util.ResourceBundle;

import com.cct.labstruts2.core.actionsupport.domain.LoginModel;
import com.cct.labstruts2.core.actionsupport.domain.LoginResult;


public class LoginPOJOAction {
	private LoginModel model = new LoginModel();
	
	public String init() {
		return "login";
	}
	
	public String login() {
		System.out.println("Username : " + model.getLogin().getUsername());
		System.out.println("Password : " + model.getLogin().getPassword());
		  
		LoginResult result = new LoginResult();
		ResourceBundle bundle = ResourceBundle.getBundle("resources.bundle.actionsupport.MessageAction");
		if(model.getLogin().getUsername() == "admin" || "admin".equals(model.getLogin().getUsername())){
			result.setMessage(bundle.getString("acc.success"));
			model.setLoginResult(result);
			return "success";
		}else{
			result.setMessage(bundle.getString("acc.loginfail"));
			model.setLoginResult(result);
			return "error";
		}
	}

	public LoginModel getModel() {
		return model;
	}

	public void setModel(LoginModel model) {
		this.model = model;
	}
	
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("resources.bundle.actionsupport.MessageAction");
		System.out.println("bundle--> " + bundle.getString("acc.success"));
	}
}
