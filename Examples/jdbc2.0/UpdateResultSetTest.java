import java.sql.*;
class UpdateResultSetTest
{
	public static void main(String[] args) throws Exception
	{

	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:DataSource","scott","tiger");
st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

rs=st.executeQuery("select * from emp22");

if(!rs.next())
{
System.out.println("no recods found");
return;
}
			
rs.deleteRow();
System.out.println("updated");
		
}
	catch(Exception e)
	{
	System.out.println("exception="+e.getMessage());
	}
	}
}