package Database;

import java.sql.*;

public class InsertData {
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
            String sql = "INSERT INTO User (id, name, age, phone_number, address) " +
                         "VALUES (1, ' Bibek Parajuli', 23, '986612345', 'Kathmandu'),"+
                         "(2, ' Sanju', 23, '9866123435', 'Imadol'),"+
                         "(3, ' Saman', 24, '9846123435', 'Kathmandu')";
            stmt.executeUpdate(sql);

            System.out.println("Data inserted successfully");

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
