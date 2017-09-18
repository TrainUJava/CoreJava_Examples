package com.example;

import java.io.*;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 	1.0
 * @author
 */
public class GetData extends HttpServlet {

	/**
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	*/
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			response.setContentType("text/html");
PrintWriter out = response.getWriter();
String title = "Your Information";
out.println("<HTML>" +"<BODY BGCOLOR=\"pink\">\n"
+"<H1 ALIGN=CENTER>" + title + "</H1>\n" +
"<UL>\n" +" <LI><B>First Name in Response</B>: "
+ request.getParameter("param1") + "\n" +
" <LI><B>Last Name in Response</B>: "
+request.getParameter("param2") + "\n" +
" <LI><B>NickName in Response</B>: "
+request.getParameter("param3") + "\n" +
"</UL>\n" +"</BODY></HTML>");
	}

}
