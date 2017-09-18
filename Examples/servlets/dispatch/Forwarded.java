import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class  Forwarded extends HttpServlet
{
   public void service(HttpServletRequest hreq,HttpServletResponse hres)throws ServletException,IOException
	{
	   PrintWriter out=hres.getWriter();
	   hres.setContentType("text/html");
	   
	   out.println("The last Servlet :");
	   
	   String s1=(String)hreq.getAttribute("Name");
	    String s2=(String)hreq.getAttribute("Name1");
	   out.println("The attribute value is: "+s1);
	   	   out.println("The attribute value is: "+s2);
		   out.println("completed");
	}

}
