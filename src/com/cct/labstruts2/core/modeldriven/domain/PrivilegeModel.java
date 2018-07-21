package com.cct.labstruts2.core.modeldriven.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrivilegeModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long customerId;
	private List<Privilege> listResult = new ArrayList<>();
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public List<Privilege> getListResult() {
		return listResult;
	}
	public void setListResult(List<Privilege> listResult) {
		this.listResult = listResult;
	}
	
}
