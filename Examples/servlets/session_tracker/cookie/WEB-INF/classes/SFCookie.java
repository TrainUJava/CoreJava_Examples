import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class SFCookie extends HttpServlet
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
String income = request.getParameterValues("income")[0];
String tax = request.getParameterValues("tax")[0];
// here we can use jdbc to store the values in database


	out.print("<html>   <head>     <title>Income tax details</title>");
	out.print("  </head>  <body bgcolor=#ffffff>"); 
	out.print("<h2>Thanks for submitting income tax form<br>");
	out.print(" following information is stored in our database"+"<p>");
	out.print("Income :"+income+"<br>"+"Tax    :"+ tax +"<br>");
	Cookie[] c= request.getCookies();
	if(c!=null){
	for(int i =0 ;i<c.length;i++)
		out.println(c[i].getName() +"....."+c[i].getValue()+"<br>");
		out.println("<br>");
	}
	out.print(" <BR><BR>Like this we can store the state of a client on client by using Cookies");
	out.print("</h2></body> </html>");
	out.close();
    }
}
