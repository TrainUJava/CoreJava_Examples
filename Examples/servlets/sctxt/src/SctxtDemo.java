import javax.servlet.*;
import java.io.*;

public class  SctxtDemo extends  GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		
		ServletContext sctxt=getServletContext();
		String driver =sctxt.getInitParameter("Driver");
		sctxt.setAttribute("Name","Ram");
		RequestDispatcher rd=sctxt.getRequestDispatcher("/Second");
		out.println("<h1>Hi U are in the fist servlet</h1>");
		out.println("The parameter retrieved from the context is:"+driver);
		rd.include(req,res);
		out.println("<h1>Again U are in the fist servlet</h1>");

	}
}


