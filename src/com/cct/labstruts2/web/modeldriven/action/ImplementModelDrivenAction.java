package com.cct.labstruts2.web.modeldriven.action;

import java.util.ArrayList;
import java.util.List;

import com.cct.labstruts2.core.modeldriven.domain.Privilege;
import com.cct.labstruts2.core.modeldriven.domain.PrivilegeModel;
import com.cct.labstruts2.core.modeldriven.service.PrivilegeManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ImplementModelDrivenAction extends ActionSupport implements ModelDriven<PrivilegeModel> {

	private static final long serialVersionUID = 1874720352969531391L;

	//TODO ให้ใช้ PrivilegeModel
	private PrivilegeModel privilege = new PrivilegeModel();
	
	public String load() {
		return "load";
	}
	
	public String init() {
		return "init";
	}
	
	public String search() {
		try {
			// รับค่าข้อมูล list 
			PrivilegeManager pm = new PrivilegeManager();
			List<Privilege> lst =  pm.simulateData();
						
			// ถ้า parameter เป็นค่าว่างแสดงทั้งหมด
			if(getModel().getCustomerId() == null){
				getModel().setListResult(lst);
				return SUCCESS;
			}
			
			// แสดงข้อมูลตามคีย์เวิด
			List<Privilege> lstPrivilege = new ArrayList<>();
			for(Privilege p : lst){
				if(p.getPrivilegeCode().equals( String.valueOf(getModel().getCustomerId()) )){
					lstPrivilege.add(p);
				}
			}
			getModel().setListResult(lstPrivilege);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	@Override
	public PrivilegeModel getModel() {
		return privilege;
	}


	
}
