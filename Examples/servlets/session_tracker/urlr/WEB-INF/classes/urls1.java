import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class  urls1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String s1=req.getParameter("t1");
pw.println("<html><body>");
pw.println("<font size=6>");
pw.println("<form METHOD=POST action=http://localhost/urlr/servlet/urls2?up="+s1+">");
pw.println("second item ");
pw.println("<input type=text name=t1>");
pw.println("<input type=submit>");
pw.println("</form></font></body>");
pw.println("</html>");


}
}
