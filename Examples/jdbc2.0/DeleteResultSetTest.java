import java.sql.*;
class DeleteResultSetTest
{
	public static void main(String[] args) 
	{

	Connection con=null;
	Statement st=null;
	ResultSet rs=null;

	try
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		con=DriverManager.getConnection("jdbc:odbc:DataSource","scott","tiger");
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		con.setAutoCommit(false);
		rs=st.executeQuery("select * from student");

		if(!rs.next())
		{
			System.out.println("no recods found");
			return;
		}
			rs.absolute(2);		
			rs.deleteRow();
			con.commit();
		
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("exception="+e.getMessage());
	}
	catch(SQLException e)
	{
	System.out.println("exception="+e.getMessage());
	}
	finally
	{
		try
		{
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("finally exception="+e.getMessage());
		}
		
		}
	}
}