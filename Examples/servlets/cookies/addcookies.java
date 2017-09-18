import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;
public class addcookies extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
if((req.getParameter("name")==null)&&(req.getParameter("value")==null))
out.println("the cookie can not be added because due to incomplete information");
else
{
Cookie kuki=new Cookie(req.getParameter("name"),req.getParameter("value"));
//kuki.setMaxAge(6000);
res.addCookie(kuki);
out.println("the cookie was successfully added");
}
}
public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
doPost(req,res);
}
}

