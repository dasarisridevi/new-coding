//program to demonestrate
import java.sql.*;
class jdbcex{
    public static void main(string arg[]){
        //5 steps
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:myaql://localhost:3306/school","root","password");
        Statement stmt=con.CreateStatement();
        stmt.excuteUdateUpdate("insert into student values(1."sri");
        con.close(); 
    }
}