/*create or replace procedure p2(eno in number) as begin update pemp2 set sal=9999 where empno=eno; end;*/
import java.sql.*;
class Callable2
{
  public static void main(String args[])throws Exception
  {
	  int id= Integer.parseInt(args[0]);
 Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver");
  Connection con=DriverManager.getConnection("Jdbc:Odbc:datasource","scott","tiger");
    String str="create or replace procedure p2(eno in number) as begin update empsal1 set sal=sal+2000 where id=eno;end;";
	Statement st=con.createStatement();
	st.execute(str);
	System.out.println("proc created.........");

	CallableStatement cst=con.prepareCall("{call p2(?)}");
	cst.setInt(1,id);
	cst.execute();con.close();
    System.out.println("proc executed.........");
	System.out.println("Updated Result........."+'\n');
	Connection con1=DriverManager.getConnection("Jdbc:Odbc:datasource","scott","tiger");
PreparedStatement stmt=con1.prepareStatement("select * from empsal1 where id=?");
stmt.setInt(1,id);                                           
ResultSet rs = stmt.executeQuery();

while(rs.next())
	  {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
	  }



 }
}