import java.sql.*;
class Test{
  public static void main(String args[]) throws Exception{
    //registering a jdbc driver
    Class.forName("com.mysql.jdbc.Driver");
    //create a database connection
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smgkm","root","nandansoft@123");
    System.out.println("Connection Is Established.....");
    //create a statement 
    Statement stmt=con.createStatement();
    ResultSet r=stmt.executeQuery("select * from details");
    while(r.next()){
      System.out.println(r.getInt(1)+" "+r.getString(2));
    }
    con.close();
  }
}