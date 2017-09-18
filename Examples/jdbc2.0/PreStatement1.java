import java.sql.*;
public class PreStatement1
{
  public static void main(String s[] )throws Exception
  {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
System.out.println("class loaded..........");
Connection con1=DriverManager.getConnection("jdbc:odbc:jitu","scott","tiger");
PreparedStatement pst=con1.prepareStatement("select * from pemp where eno=? and ename=?");
	pst.setInt(1,Integer.parseInt(s[0]));
	pst.setString(2,s[1]);
	
	ResultSet rs=pst.executeQuery();
	while(rs.next())
{

System.out.println("emp number "+ rs.getInt(1));
System.out.println("emp Name "+ rs.getString(2));
System.out.println("emp sal "+ rs.getString(3));
			
		}
		
	}
}
