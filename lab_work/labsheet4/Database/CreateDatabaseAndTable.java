package Database;

import java.sql.*;

public class CreateDatabaseAndTable {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // Create database
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS db_tests";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully");

            // Switch to db_test database
            sql = "USE db_tests";
            stmt.executeUpdate(sql);

            // Create table User
            sql = "CREATE TABLE IF NOT EXISTS User (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(255)," +
                    "age INT," +
                    "phone_number VARCHAR(20)," +
                    "address VARCHAR(255))";
            stmt.executeUpdate(sql);
            System.out.println("Table User created successfully");

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
