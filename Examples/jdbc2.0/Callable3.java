import java.sql.*;
class Callable3
{
  public static void main(String args[])throws Exception
  {
Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection( "jdbc:odbc:datasource","scott","tiger");
 String str="create or replace procedure p3(empno in number,ename out varchar2, s out number) as begin select name into ename from empsal1 where id=empno;select sal into s from empsal1 where id=empno;end;";
	Statement st=con.createStatement();
	st.execute(str);
	System.out.println("proc created.........");

	CallableStatement cst=con.prepareCall("{call p3(?,?,?)}");
	System.out.println("1");

	cst.setInt(1,Integer.parseInt(args[0]));
	System.out.println("2");

	cst.registerOutParameter(2, java.sql.Types.VARCHAR);
	System.out.println("3");

	cst.registerOutParameter(3, java.sql.Types.INTEGER);
	System.out.println("4");

	cst.execute();
   System.out.println("5");
 System.out.println("proc executed..empname  "+cst.getString(2)+"  empsal  " +cst.getInt(3));
 con.close();

 }
}