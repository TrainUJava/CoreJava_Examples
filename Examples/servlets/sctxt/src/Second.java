import javax.servlet.*;
import java.io.*;
public class  Second extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		ServletContext ctxt=getServletContext();
		String driver=ctxt.getInitParameter("Driver");		
		String name=(String)ctxt.getAttribute("Name");
		out.println("<h1>Hi "+name+"U are in the second servlet</h1>");
		out.println("The parameter retrieved from the context is:"+driver);
	}
}
