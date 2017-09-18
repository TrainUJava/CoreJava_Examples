import java.sql.*;
class  UsingType2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("Driver is loaded...");

		Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@","scott","tiger");
		Statement stmt= con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
	while (rs.next())
	{
		int id= rs.getInt(1);
		String name=rs.getString(2);
		

		System.out.println(id+" "+name+" ");
	}
	}
}
