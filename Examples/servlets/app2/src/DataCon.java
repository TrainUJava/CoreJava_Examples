import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataCon extends HttpServlet
{
	Connection con;
	public void init(ServletConfig sc) 
	{
		//super.init(sc);
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:DataSource","scott","tiger");
	}
	catch(ClassNotFoundException e)
		{}
	catch(SQLException e)
		{}
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String s = req.getParameter("t1");
		int id = Integer.parseInt(s);
try{
	PreparedStatement pst = con.prepareStatement("select * from empsal1 where id=?");
	pst.setInt(1,id);
	ResultSet rs=pst.executeQuery();
	while(rs.next())
		{
		int i = rs.getInt(1);
		String name = rs.getString(2);
		int sal = rs.getInt(3);
		int contact = rs.getInt(4);
		out.println( "<h3>"+i+" "+name+" "+sal+" "+contact+"</h3>");
		}
}
catch( SQLException e)
		{}
		
	}
};
