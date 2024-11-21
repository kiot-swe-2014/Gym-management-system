package project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getcon() {
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure driver name is correct
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", ""); // Make sure URL, username, and password are correct
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to establish a database connection.");
            e.printStackTrace();
        }
        return null; // Return null if connection fails
    }
}
