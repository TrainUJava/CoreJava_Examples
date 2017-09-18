import java.sql.*;
class Callable31
{
  public static void main(String args[])throws Exception
  {
Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection( "jdbc:odbc:javaora","scott","tiger");
 String str="create or replace procedure p31(eno in number,salary out number) as begin select sal into salary from emp22 where empno=eno;end;";
	Statement st=con.createStatement();
	st.execute(str);
	System.out.println("proc created.........");

	CallableStatement cst=con.prepareCall("{call p31(?,?)}");
	cst.registerOutParameter(2, java.sql.Types.DOUBLE);
	cst.setInt(1,24);
	cst.execute();
    System.out.println("proc executed........."+cst.getString(2));

 }
}