import java.sql.*;
class  UsingType4
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("Driver is loaded...");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@jpserver:1521:jpserver","scott","tiger");
		Statement stmt= con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from empsal1");
	while (rs.next())
	{
		int id= rs.getInt(1);
		String name=rs.getString(2);
		int sal = rs.getInt(3);

		System.out.println(id+" "+name+" "+sal);
	}
	}
}
