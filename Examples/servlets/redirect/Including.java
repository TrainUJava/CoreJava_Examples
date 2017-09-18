 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class  Including extends HttpServlet
{
   public void service(HttpServletRequest hreq,HttpServletResponse hres)throws ServletException,IOException
	{
	   PrintWriter out=hres.getWriter();
	   hres.setContentType("text/html");

	   RequestDispatcher rd=hreq.getRequestDispatcher( "/Included");
	   rd.include(hreq,hres);
	   
	   out.println("<center>The courses offered :<br></center>");
	   out.println("<center>c c++ java .net</center>");
	   
	}

}
