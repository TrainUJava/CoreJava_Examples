/*create or replace function f1(eno  number) return varchar2 as 
name varchar2(30);  
begin 
select ename into name from pemp2 where empno=eno;
return name;
end;*/
import java.sql.*;
public class Callable4 
{
  public static void main(String args[]) throws Exception
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:DataSource","scott","tiger");
 //String str="create or replace function f1(eno  number) return varchar2 as name varchar2(30);  begin select ename into name from pemp31 where empno=eno;return name;end;";
String str="create or replace function f1(eno number) return varchar2 as ename varchar2(20); begin select name into ename from empsal1 where id=eno; return ename;end;";
	Statement st=con.createStatement();
	st.execute(str);
	System.out.println("fun created.........");
	CallableStatement cst= con.prepareCall("{?=call  f1(?)}");
     cst.registerOutParameter(1,java.sql.Types.VARCHAR);
	cst.setInt(2,40);
	cst.execute();
System.out.println("Fun executed........."+cst.getString(1));
 }
}