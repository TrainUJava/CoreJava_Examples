package com.example;

import java.io.*;
import javax.servlet.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 	1.0
 * @author
 */
public class ConfigDemoServlet extends HttpServlet {

	/**
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	*/
	ServletConfig config=null;
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			String param = config.getInitParameter("driver");
			out.println("<h2>parameter Name : "+"driver</h2>");
			out.println("<h2>parameter Value : "+param+"</h2>");
			

	}

	/**
	* @see javax.servlet.GenericServlet#void ()
	*/
	public void init(ServletConfig config) throws ServletException {

		super.init();
		this.config=config;

	}

}
