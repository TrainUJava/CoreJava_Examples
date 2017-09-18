import java.sql.*;
class BatchUpdate
{
 public static void main(String args[])
 {
   try{
   Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver");
   Connection con=DriverManager.getConnection("jdbc:odbc:jitu","scott","tiger");
   Statement st=con.createStatement();
con.setAutoCommit(false);
  st.addBatch("insert into emp values(1,'nissinath',50000)");
   st.addBatch("insert into emp values(2,'sridhar',200)");
   st.addBatch("insert into emp values(3,'durga',300)");
 st.addBatch("insert into emp values(4,'srinivas',30000)");
 st.addBatch("insert into emp values(5,'ratna',30000)");
 st.addBatch("insert into emp values(6,'rajiv',30000)");
 st.addBatch("insert into emp values(7,'pramod',30000)");
 st.addBatch("insert into emp values(8,'madhuri',12000)");
 
 int a[]=st.executeBatch();
con.commit();
con.rollback();
con.setAutoCommit(true);
   ResultSet rs=st.executeQuery("select * from emp");
   while(rs.next())
   {
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
   }
   st.close();
   con.close();
   }catch(Exception e ){System.out.println(e);}
 }
}