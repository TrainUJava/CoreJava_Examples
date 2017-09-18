import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class SHid extends HttpServlet
{ 
    public void doGet (
	HttpServletRequest	request,
	HttpServletResponse	response
    ) throws ServletException, IOException
    {
	PrintWriter		out;
	// set content type and other response header fields first
        response.setContentType("text/html");

	// then write the data of the response
	out = response.getWriter();
//get values submitted by the form
String income = request.getParameter("income");
String tax = request.getParameter("tax");
String name = request.getParameter("name");
String fname= request.getParameter("Fname");
// here we can use jdbc to store the values in database


	out.print("<html>   <head>     <title>Income tax details</title>");
	out.print("  </head>  <body bgcolor=#ffffff>"); 
	out.print("<h2>Thanks for submitting income tax form<br>");
	out.print(" following information is stored in our database<p>");
	out.print(name+"<br>"+ fname+"<br>" +income+"<br>"+tax+"<br>");

	out.print("</h2></body> </html>");
	out.close();
    }
}
