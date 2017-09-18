package com.example;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ShowParameters extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();

	out.print("<html><head><title>This is a post example</title></head><body>");
	out.print("<h1 align=\"center\">The details sent are </h1>");
	out.print("<ul><li>Item Number"
	+request.getParameter("itemNum")
	+"<li>Quantity  :"+request.getParameter("quantity")
	+"<li>Price     :"+request.getParameter("price")
	+"<li>First Name:"+request.getParameter("firstName")
	+"<li> Address  :"+request.getParameter("address")
	+"<li> card Number :"+request.getParameter("cardNum")
	+"</ul></body></html>");

}
public void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
doGet(request, response);
}
}