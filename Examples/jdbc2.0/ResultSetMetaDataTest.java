import java.sql.*;
class ResultSetMetaDataTest
{
	public static void main(String[] args) 
	{

	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	ResultSetMetaData rsmd=null;
	try
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:oracle:oci8@","scott","tiger");
		st=con.createStatement();
		rs=st.executeQuery("select * from emp");
		rsmd=rs.getMetaData();
		for(int i=1; i<=rsmd.getColumnCount();i++)
		{

		System.out.println("name= "+rsmd.getColumnName(i)+"\t type= "+ rsmd.getColumnTypeName(i)+"\t size = "+rsmd.getColumnType(i));
		}
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