import java.sql.*;
class UpdatableResultSetTest
{
	public static void main(String[] args) 
	{

	Connection con=null;
	Statement st=null;
	ResultSet rs=null;

	try
	{

		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//con=DriverManager.getConnection("jdbc:odbc:mknn","scott","tiger");
	
	con = DriverManager.getConnection("jdbc:oracle:thin:@jpserver:1521:jpserver","scott","tiger");
	st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		con.setAutoCommit(false);
		rs=st.executeQuery("select * from empsal1");

		if(!rs.next())
		{
			System.out.println("no recods found");
			return;
		}
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
			rs.last();		
			rs.deleteRow();
			con.commit();
		rs.first();	
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		

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