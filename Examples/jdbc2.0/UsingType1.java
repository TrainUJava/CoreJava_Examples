import java.sql.*;
class  UsingType1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		System.out.println("Driver is loaded...");

		Connection con = DriverManager.getConnection("jdbc:odbc:datasource");
		Statement stmt= con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from pemp");
	while (rs.next())
	{
		int id= rs.getInt(1);
		String name=rs.getString(2);
		int sal = rs.getInt(3);

		System.out.println(id+" "+name+" "+sal);
	}
	}
}
