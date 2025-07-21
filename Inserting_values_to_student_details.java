import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserting_values_to_student_details 
{
   static final String DB_URL = "jdbc:mysql://localhost/PERSONAL_DETAILS";
   static final String USER = "root";
   static final String PASS = "root";

   public static void main(String[] args)
   {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      )
      {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String mysql = "INSERT INTO student_details VALUES (100, 'Zara', 'Ali', 18)";
         stmt.executeUpdate(mysql);
         mysql = "INSERT INTO student_details VALUES (101, 'Mahnaz', 'Fatma', 25)";
         stmt.executeUpdate(mysql);
         mysql = "INSERT INTO student_details VALUES (102, 'Zaid', 'Khan', 30)";
         stmt.executeUpdate(mysql);
         mysql = "INSERT INTO student_details VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(mysql);
         System.out.println("Inserted records into the table...");   	  
      } 
      catch (SQLException h)
      {
         h.printStackTrace();
      } 
   }
}