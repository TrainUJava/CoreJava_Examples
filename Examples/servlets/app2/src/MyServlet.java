import javax.servlet.*;
import java.io.*;

public class  MyServlet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
	{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>"+"Hello Students"+"</h1>");
	}
}
