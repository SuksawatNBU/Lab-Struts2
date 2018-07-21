package com.cct.labstruts2.web.ognl.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.cct.labstruts2.core.ognl.domain.OGNLModel;
import com.cct.labstruts2.core.ognl.domain.RequestObject;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PreOGNLAction extends ActionSupport implements ModelDriven<OGNLModel>{

	private static final long serialVersionUID = 7861057385989230174L;
	
	public static final String staticField = "Static Field";
	
	private OGNLModel model = new OGNLModel();
	
	@Override
	public OGNLModel getModel() {
		return model;
	}

	public String init() {
		model.getUser().setEmail("pre@mail.com");
		
		setRequestObject();
		
		return SUCCESS;
	}
	
	private void setRequestObject() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS", Locale.ENGLISH);
		RequestObject requestObj = new RequestObject();
		requestObj.setRequestDate("Pre : " + sdf.format(Calendar.getInstance(Locale.ENGLISH).getTime()));
		ServletActionContext.getRequest().setAttribute("reqObj", requestObj);
	} 
	
	public Map<String, String> getMapAirport() {
		Map<String, String> mapAirport = new HashMap<String, String>();
		mapAirport.put("BKK", "Suvarnabhumi Airport");
		mapAirport.put("DMK", "Don Mueang International Airport");
		mapAirport.put("CNX", "Chiang Mai International Airport");
		mapAirport.put("HKT", "Phuket International Airport");
		mapAirport.put("HDY", "Hat Yai International Airport");
		return mapAirport;
	}
	
}
