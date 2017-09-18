import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class  Forwarding extends HttpServlet
{
   public void service(HttpServletRequest hreq,HttpServletResponse hres)throws ServletException,IOException
	{
	   PrintWriter out=hres.getWriter();
	  hres.setContentType("text/html");
	  String n = hreq.getParameter("name");
	  hreq.setAttribute("Name","JavaPoint");
	  hreq.setAttribute("Name1",n);
	out.println("Message from Forwarding");	
	  RequestDispatcher rd1=hreq.getRequestDispatcher("/servlet/Forwarded");
	   rd1.forward(hreq,hres);
	  out.println("After Message from Forwarded");
	 //  return;
	}/*the session object is forwarded to the forwarded serlet and distroyedafter  forwarded*/

}
