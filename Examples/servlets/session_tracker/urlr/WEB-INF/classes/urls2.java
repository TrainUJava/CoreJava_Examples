import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class  urls2 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String s1=req.getParameter("t1");
String s2=req.getParameter("up");
pw.println("<font size=6>");
pw.println("your selected items are "+s1+"  "+s2);
pw.println("</font>");
}
}