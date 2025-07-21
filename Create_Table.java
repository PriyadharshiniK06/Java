import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Create_Table
{
    static final String DB_URL="jdbc:mysql://localhost:3306/PERSONAL_DETAILS";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[]args)
    {
        try (Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stmt= conn.createStatement();
        )
        {
            String mysql = "create table student_details"+
                        " (id INTEGER not Null ," +
                        " first_name VARCHAR(325) , " +
                        "last_name VARCHAR(350) ,"+
                        "AGE INTEGER ,"+
                        "PRIMARY KEY (id))";
            stmt.executeUpdate(mysql);
            System.out.println("Created table successfully !!!!!");            

        }
        catch(SQLException h)
        {
            h.printStackTrace();
        }
    }
}        