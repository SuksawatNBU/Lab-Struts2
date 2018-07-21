package com.cct.labstruts2.web.ognl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetSessionAttributeServlet")
public class SetSessionAttributeServlet extends HttpServlet{

	private static final long serialVersionUID = -7153276807861434095L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			if(req.getParameter("sessionName") != null && !req.getParameter("sessionName").equals("")) {
				req.getSession().setAttribute("sessionName", req.getParameter("sessionName"));
				System.out.println("Set sessionName = " + req.getParameter("sessionName"));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
