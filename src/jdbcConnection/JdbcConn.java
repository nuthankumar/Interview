package jdbcConnection;
import java.sql.DriverManager;
import java.sql.Connection;
public class JdbcConn {

public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
// without database works fine unless you are not trying to interact.
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fma","root", "");
System.out.print("Database is connected !");
conn.close();
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
}
}
}