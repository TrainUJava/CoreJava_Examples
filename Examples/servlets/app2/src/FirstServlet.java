import javax.servlet.*;
import java.io.*;
public class FirstServlet extends GenericServlet
{
String s;
public void init(ServletConfig sc) throws ServletException
	{
		s=sc.getInitParameter("driver");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
	{
		
		
	PrintWriter  out = res.getWriter();
	String name = req.getParameter("t1");
	res.setContentType("text/html");
	out.println("<h1>"+" Hello  "+name+" "+s+"  this is my First servlet"+"</h1>");
}
	};