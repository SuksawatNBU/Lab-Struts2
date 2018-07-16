package com.cct.labstruts2.web.interceptor.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class BookingValidateIntercaptor implements Interceptor {

	private static final long serialVersionUID = -4186144213842126650L;

	@Override
	public void destroy() {
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		String result = "invalid.bookingName";
		if (!actionInvocation.getProxy().getActionName().equals("addBooking")) {
			return actionInvocation.invoke();
		}
		
		String bookingName = actionInvocation.getStack().findString("data.bookingName");
		System.out.println("bookingName: " + bookingName);
		if ((bookingName == null) || bookingName.isEmpty()) {
			ActionSupport action = (ActionSupport) actionInvocation.getAction();
			action.addActionError("Booking name cannot be blank.");
		} else {
			result =  actionInvocation.invoke();
		}	
		return result;
	}

}
