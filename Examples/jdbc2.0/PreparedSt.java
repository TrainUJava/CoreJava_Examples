import java.sql.*;
class  PreparedSt
{
	public static void main(String[] args) 
	{
		
		Connection con=null;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		System.out.println("Driver is loaded...");

		 con = DriverManager.getConnection("jdbc:odbc:datasource");
		PreparedStatement pst=con.prepareStatement("insert into pemp values (?,?,?)");
		pst.setInt(1,21);
pst.setString(2,"Ramesh");
pst.setInt(3,4000);
		int i=pst.executeUpdate();
	System.out.println("The no of rows inserted ="+i);
		
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			//e.printStackTrace();
			System.out.println("Driver class not found");
		}
		finally {
			try
			{
				con.close();
			}
			catch (SQLException e)
			{
			}
		}
	
	}
}
