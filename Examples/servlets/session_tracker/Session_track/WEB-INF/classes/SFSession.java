import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class SFSession extends HttpServlet
{ 
    public void doGet (
	HttpServletRequest	request,
	HttpServletResponse	response
    ) throws ServletException, IOException
    {
	PrintWriter		out;
	// set content type and other response header fields first
        response.setContentType("text/html");
    	HttpSession session = request.getSession(true);
	out = response.getWriter();
//get values submitted by the form
String income = request.getParameter("income");
String tax = request.getParameter("tax");
// here we can use jdbc to store the values in database


	out.print("<html>   <head>     <title>Income tax details</title>");
	out.print("  </head>  <body bgcolor=#ffffff>"); 
	out.print("Thanks for submitting income tax form<br>");
	out.print(" following information is stored in our database <BR>");
	out.print("<br>"+ tax +"<br>");
	out.print("<br>"+ income +"<br>");
	out.print("<br>"+ session.getAttribute("name")+"<br>");
	out.print("<br>"+ session.getAttribute("fname") +"<br>");


	out.print(" <BR><BR>Like this we can store the state of a client on server  by using Session");
	out.print("</body> </html>");
	out.close();
    }
}
