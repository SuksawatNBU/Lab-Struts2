package com.cct.labstruts2.core.wildcard.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmailModel implements Serializable {

	private static final long serialVersionUID = 7344347017217622685L;

	// เงือนไขการค้นหา
	private EmailSearchCriteria criteria = new EmailSearchCriteria();

	// ผลลัพธ์การค้นหา
	private List<Email> listResult = new ArrayList<Email>();
	
	// สำหรับเพิ่มข้อมุล
	private Email data = new Email();
	
	private String token;
	
	public Email getData() {
		return data;
	}

	public void setData(Email data) {
		this.data = data;
	}

	public EmailSearchCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(EmailSearchCriteria criteria) {
		this.criteria = criteria;
	}

	public List<Email> getListResult() {
		return listResult;
	}

	public void setListResult(List<Email> listResult) {
		this.listResult = listResult;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
