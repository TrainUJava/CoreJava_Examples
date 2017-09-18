import java.sql.*;
public class ScrollableResult
  {
    public static void main(String[] a) throws Exception      {  

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con;
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ocl","scott","tiger");

Statement st = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

System.out.println("\n Record inserted......................");	
ResultSet rs = st.executeQuery( "select  * from empsal1");
rs.afterLast();
while (rs.previous()) {
System.out.print(" idno" +rs.getInt("id"));
System.out.print(" name "+ rs.getString("name"));
System.out.print(" sal "+ rs.getInt("sal"));
System.out.println(" contact   "+ rs.getString("contact"));

}
System.out.println("....end of Prvious....."+"\n");

rs.absolute(4);
System.out.println("emp number "+ rs.getInt("id"));
System.out.println("emp name "+ rs.getString("name"));
System.out.println("emp sal "+ rs.getInt("sal"));
System.out.println(" sal "+ rs.getString("contact"));
System.out.println("....end of Absolute....."+"\n");
rs.relative(-1);
System.out.println("emp number "+ rs.getInt("id"));
System.out.println("emp name "+ rs.getString("name"));
System.out.println("emp sal "+ rs.getInt("sal"));
System.out.println(" sal "+ rs.getString("contact"));
	}
}	