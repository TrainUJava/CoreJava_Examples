/*create or replace procedure p1 as
begin 
update empsal1 set sal=28888 where id=55;

end;*/
import java.sql.*;
public class Callable1
{
  public static void main(String args[])throws Exception
  {
    Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection( "jdbc:odbc:datasource","scott","tiger");
    String str="create or replace procedure p1 as begin update empsal1 set sal=sal+2000 where id=40;end;";
	Statement st=con.createStatement();
	st.execute(str);
	System.out.println("proc created.........");

	CallableStatement cst=con.prepareCall("{call p1}");
	cst.execute();
    System.out.println("proc executed.........");
    con.close();
 }
}