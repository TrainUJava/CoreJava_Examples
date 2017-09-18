package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 	1.0
 * @author
 */
public class FirstHttpServlet extends HttpServlet {

	/**
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	*/
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.print("<html><head><title>My FirstServlet</title></head><body>");
						out.print("<h1> Hello This is my First Servlet</h1></body></html>");
			

	}

}
