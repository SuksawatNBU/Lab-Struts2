package com.cct.labstruts2.core.strutstag.domain;

import java.io.Serializable;

public class SelectItem implements Serializable{

	private static final long serialVersionUID = 6766249402062320203L;
	
	private String code;
	private String desc;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
