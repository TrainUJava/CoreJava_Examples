import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RedirectTest extends HttpServlet
{

public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
  PrintWriter pw=res.getWriter();
  res.setContentType("text/html");
  String s1=req.getParameter("t1");
  int i=Integer.parseInt(s1.trim());

  pw.println("<font size=6>");
  if(i==3)
     pw.println("option invalid");
  else 
    if(i==2)
	   res.sendRedirect("option2.html");
    else if(i==1)
	    res.sendRedirect("http://localhost:8080/app/servlet/hello");
	
	pw.println("</font>");
}
}

 
