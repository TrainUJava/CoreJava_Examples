import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmpInfo extends HttpServlet
{
   Connection con;
   Statement st;
   ResultSet rs;
int id;
public void init(ServletConfig config) throws ServletException
  {
   super.init(config);
   try{
	   System.out.println("\n in the Init ");
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection( "jdbc:odbc:datasource","scott","tiger");
   st=con.createStatement();
     }catch(Exception se)

	 {System.out.println("problem with connection establishment");}
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException
  {
	  	   System.out.println("\n in the doGet ");
    res.setContentType("text/plain");
	PrintWriter out = res.getWriter();
     id = Integer.parseInt(req.getParameter("no"));
   try
   {
	ResultSet rs = st.executeQuery("Select name,sal from empsal1 where id="+id);
  while( rs.next())
	   {
	  out.println("Employee No :"+id);
	out.println("Name :"+rs.getString(2));
	out.println("Salary : "+rs.getInt(3));
	   }
	out.close();
	} catch(SQLException e)
	 { System.out.println("error while retrieving the data "+e);
     }  
}
public void destroy()
	{
	System.out.println("\n in the destroy");
				try
				{
					rs.close();
				st.close();
				con.close();
				}
				catch (SQLException e )
				{
					System.out.println("Sorry connections could not be closed");
				}
	}
};