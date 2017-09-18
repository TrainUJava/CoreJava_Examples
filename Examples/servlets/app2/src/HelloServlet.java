import javax.servlet.*;
import java.io.*;
import java.util.*;

public class HelloServlet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
	{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		//retriev the value from request
                             String name =req.getParameter("t1");
                  out.println("<html><head><title>"+"FirstServlet"+"</title></head>");
		out.println("<body>");
		out.println("<h1>"+"Hello "+name+"</h1>");
		out.println("<h2>"+"Today's date is "+new java.util.Date().toString()+"</h2>");
		out.println("</body></html>");
	}

};
