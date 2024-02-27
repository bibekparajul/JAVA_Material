package Database;

import java.sql.*;

public class FetchData {
    static final String DB_URL = "jdbc:mysql://localhost/db_tests";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // Execute a query
            stmt = conn.createStatement();
            String sql = "SELECT * FROM User";
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone_number = rs.getString("phone_number");
                String address = rs.getString("address");

                // Display values
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Phone Number: " + phone_number);
                System.out.println("Address: " + address);
            }
            rs.close();

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // End finally try
        } // End try
    } // End main
}
