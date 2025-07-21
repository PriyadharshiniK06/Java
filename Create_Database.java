import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Database
{
    static final String DB_URL="jdbc:mysql://localhost:3306/?user=root";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[]args)
    {
        try (Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stmt= conn.createStatement();
        )
        {
            String mysql = "Create database PERSONAL_DETAILS";
            stmt.executeUpdate(mysql);
            System.out.println("Database created successfully...");
        }
        catch(SQLException h)
        {
            h.printStackTrace();
        }
    }
}