import java.sql.*;
class DatabaseMetaDataTest
{
	public static void main(String[] args) 
	{

		Connection con=null;
		DatabaseMetaData dbmd=null;
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:datasource","scott","tiger");
			dbmd=con.getMetaData();
			System.out.println("Driver version  : \t"+dbmd.getDriverVersion());
			System.out.println("Driver Major version  : \t"+dbmd.getDriverMajorVersion());
			System.out.println("Driver Minor version  : \t"+dbmd.getDriverMinorVersion());
			System.out.println("Database product name: \t"+dbmd.getDatabaseProductName());
			System.out.println("Database product version: \t"+dbmd.getDatabaseProductVersion());
			System.out.println("Database user name \t"+dbmd.getUserName());
			System.out.println("jdbc url\t"+dbmd.getURL());
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
				con.close();
			}
			catch(SQLException e)
			{
				System.out.println("finally exception="+e.getMessage());
			}
		}//finally closing
	} //main closing
} //class closing