package com.cct.labstruts2.web.modeldriven.action;

import java.util.ArrayList;
import java.util.List;

import com.cct.labstruts2.core.modeldriven.domain.Privilege;
import com.cct.labstruts2.core.modeldriven.domain.PrivilegeModel;
import com.cct.labstruts2.core.modeldriven.service.PrivilegeManager;
import com.opensymphony.xwork2.ActionSupport;

public class UnImplementModelDrivenAction extends ActionSupport {

	private static final long serialVersionUID = 3277880035321333337L;
	private PrivilegeModel privilege;
	
	public String init() {
		return "init";
	}
	
	public String search() {
		try {
			// รับค่าข้อมูล list 
			PrivilegeManager pm = new PrivilegeManager();
			List<Privilege> lst =  pm.simulateData();
			
			// ถ้า parameter เป็นค่าว่างแสดงทั้งหมด
			if(getPrivilege().getCustomerId() == null){
				getPrivilege().setListResult(lst);
				return SUCCESS;
			}
			
			// แสดงข้อมูลตามคีย์เวิด
			List<Privilege> lstPrivilege = new ArrayList<>();
			for(Privilege p : lst){
				if(p.getPrivilegeCode().equals( String.valueOf(getPrivilege().getCustomerId()) )){
					lstPrivilege.add(p);
				}
			}
			getPrivilege().setListResult(lstPrivilege);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public PrivilegeModel getPrivilege() {
		return privilege;
	}

	public void setPrivilege(PrivilegeModel privilege) {
		this.privilege = privilege;
	}

	
	
	
	
	
}
