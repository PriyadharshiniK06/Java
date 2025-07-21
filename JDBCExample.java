import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample
{
   static final String DB_URL = "jdbc:mysql://localhost/personal_details";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT id, first_name, last_name, age FROM student_details";

   public static void main(String[] args) 
   {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      )
      {		      
         while(rs.next())
         {
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first_name"));
            System.out.println(", Last: " + rs.getString("last_name"));
         }
      } 
      catch (SQLException e) 
      {
         e.printStackTrace();
      } 
   }
}