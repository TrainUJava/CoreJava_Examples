import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class displaycookies extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
Cookie kukis[]=req.getCookies();
if(kukis==null)
{
out.println("no cookies are found");
}
else
{
 out.println("total cookies are as follows");
 for(int i=0;i<kukis.length;i++)
 out.println("name="+kukis[i].getName()+"\t value="+kukis[i].getValue());
 }
 }
 }