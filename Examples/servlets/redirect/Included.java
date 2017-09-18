import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class  Included extends HttpServlet
{
   public void service(HttpServletRequest hreq,HttpServletResponse hres)throws ServletException,IOException
	{
	   PrintWriter out=hres.getWriter();
	   hres.setContentType("text/html");
	   out.println("<center>  JavaPoint Computers Pvt Ltd</center>");
	   out.println("<hr color=blue width=60%>");
	}
}
