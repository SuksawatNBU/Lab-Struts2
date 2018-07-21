package com.cct.labstruts2.web.ognl.action;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.apache.struts2.ServletActionContext;

import com.cct.labstruts2.core.ognl.domain.OGNLModel;
import com.cct.labstruts2.core.ognl.domain.RequestObject;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostOGNLAction extends ActionSupport implements ModelDriven<OGNLModel>{

	private static final long serialVersionUID = 7861057385989230174L;
	
	private OGNLModel model = new OGNLModel();
	
	@Override
	public OGNLModel getModel() {
		return model;
	}
	
	public String init() {
		model.getUser().setEmail("post@mail.com");
		
		setRequestObject();
		
		return SUCCESS;
	}
	
	private void setRequestObject() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS", Locale.ENGLISH);
		RequestObject requestObj = new RequestObject();
		requestObj.setRequestDate("Post : " + sdf.format(Calendar.getInstance(Locale.ENGLISH).getTime()));
		ServletActionContext.getRequest().setAttribute("reqObj", requestObj);
	} 
	
	public static String getHostName() {
		String hostName = "";
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			hostName = inetAddress.getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return hostName;
	}
}
