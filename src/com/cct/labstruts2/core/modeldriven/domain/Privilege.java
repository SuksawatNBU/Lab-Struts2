package com.cct.labstruts2.core.modeldriven.domain;

import java.io.Serializable;

public class Privilege implements Serializable{

	private static final long serialVersionUID = 3091631436026721263L;
	
	private String privilegeCode;
	private String privilegeName;
	private String privilegeDetail;
	private String expireDate;
	
	public String getPrivilegeCode() {
		return privilegeCode;
	}
	public void setPrivilegeCode(String privilegeCode) {
		this.privilegeCode = privilegeCode;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public String getPrivilegeDetail() {
		return privilegeDetail;
	}
	public void setPrivilegeDetail(String privilegeDetail) {
		this.privilegeDetail = privilegeDetail;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
}
