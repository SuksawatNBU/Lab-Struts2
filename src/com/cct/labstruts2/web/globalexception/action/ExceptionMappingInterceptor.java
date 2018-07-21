package com.cct.labstruts2.web.globalexception.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ExceptionMappingInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4226132694904909767L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String result = invocation.invoke();
		
		if (invocation.getProxy().getActionName().equals("initRoom")) {
			System.out.println("--> initRoom");
			return invocation.invoke();
		}else{
			System.out.println("not --> initRoom");
		}
			
		
		return result;
	}

}
