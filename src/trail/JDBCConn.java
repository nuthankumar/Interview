/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Davidvilla
 */
public class JDBCConn {

    public static void main(String args[]) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
        Statement stmt = con.createStatement();
        con.getAutoCommit();
        con.commit();

//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
        int result = stmt.executeUpdate("delete from emp765 where id=33");

        System.out.println(result + " records affected");
        con.close();
    }
}
