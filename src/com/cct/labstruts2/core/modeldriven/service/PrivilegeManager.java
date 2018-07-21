package com.cct.labstruts2.core.modeldriven.service;

import java.util.ArrayList;
import java.util.List;

import com.cct.labstruts2.core.modeldriven.domain.Privilege;

public class PrivilegeManager {
	
	public List<Privilege> simulateData() throws Exception{
		List<Privilege> lst = new ArrayList<>();
		
		try {
			Privilege p = new Privilege();
			p.setExpireDate("12/07/2561");
			p.setPrivilegeCode("2090");
			p.setPrivilegeName("Amazon's day pay");
			p.setPrivilegeDetail("รับส่วนลด10บาทเมื่อซื้อเครื่องดื่มทุกเมนู");
			lst.add(p);
			
			p = new Privilege();
			p.setExpireDate("20/07/2561");
			p.setPrivilegeCode("2091");
			p.setPrivilegeName("KFC");
			p.setPrivilegeDetail("ซื้อชุดเมนูที่ร่วมรายการในราคาพิเศษเพียง 69 บาท");
			lst.add(p);
			
			p = new Privilege();
			p.setExpireDate("09/09/2561");
			p.setPrivilegeCode("2093");
			p.setPrivilegeName("Croc");
			p.setPrivilegeDetail("รับส่วนลด 10% เมื่อซื้อรองเท้าคร็อคส์ราคาปกติที่ร่วมรายการ");
			lst.add(p);
			
			p = new Privilege();
			p.setExpireDate("11/09/2561");
			p.setPrivilegeCode("2094");
			p.setPrivilegeName("Dusit zoo");
			p.setPrivilegeDetail("รับส่วนลดค่าผ่านประตู 50% ที่สวนสัตว์ดุสิต");
			lst.add(p);

		} catch (Exception e) {
			throw e;
		}
		return lst;
	}
}
