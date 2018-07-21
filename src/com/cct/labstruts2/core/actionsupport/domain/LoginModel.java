package com.cct.labstruts2.core.actionsupport.domain;

public class LoginModel {
	
	private Login login; // สำหรับหน้า Login
	private LoginResult loginResult; // สำหรับหน้า LoginSuccess, LoginFail
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public LoginResult getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(LoginResult loginResult) {
		this.loginResult = loginResult;
	}
}
