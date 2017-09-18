package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @version 	1.0
 * @author
 */
public class HelloServlet extends GenericServlet {

	/**
	* @see javax.servlet.GenericServlet#void (javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	*/
	public void service(ServletRequest request, ServletResponse response)
		throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html><head><title>My FirstServlet</title></head><body>");
			out.print("<h1> Hello This is my First Servlet</h1></body></html>");

	}

}
