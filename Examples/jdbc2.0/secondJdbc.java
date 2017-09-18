import java.sql.*;
class secondJdbc
{
	public   static void main(String[] args) throws Exception
	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:first","scott","tiger");
		Statement st=con.createStatement();
       /*boolean b=st.execute("drop table test"); */
		st.execute("create table test45(no number(4),name varchar2(10))");
		st.executeUpdate("insert into test45 values(3001,'mmm')");
		st.executeUpdate("insert into test45 values(4002,'mmn')");
		ResultSet rs=st.executeQuery("select * from test3303");
		while(rs.next())
		{
			System.out.println(rs.getInt("no")+"\t"+rs.getString("name"));
		}
		rs.close();
		st.close();
		con.close();
}
}












