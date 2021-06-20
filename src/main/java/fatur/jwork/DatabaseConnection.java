package fatur.jwork;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Class DatabaseConnection, untuk bisa melakukan koneksi pada postgresql, berdasarkan port,username, password, dan nama database
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class DatabaseConnection {
    public static Connection connection() {
        Connection c = null;
        Statement stmt = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "fatur1602";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
