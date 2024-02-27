import java.sql.*;

public class StudentDatabaseOperations {
    static final String DB_URL = "jdbc:mysql://localhost/College";

    static final String USER = "root"; 
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
        
            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Insert a record into the Student table
            System.out.println("Inserting a record into the Student table...");
            stmt = conn.createStatement();
            // String sql = "INSERT INTO Student (s_id, name, address, gender, program) VALUES (1, 'Sam', 'Kathmandu', 'male', 'CSIT')";
            // stmt.executeUpdate(sql);
            // System.out.println("Record inserted successfully");

            // // Display the data from the Student table
            // System.out.println("Displaying data from the Student table...");
            // sql = "SELECT * FROM Student";
            // ResultSet rs = stmt.executeQuery(sql);
            // while (rs.next()) {
            //     int s_id = rs.getInt("s_id");
            //     String name = rs.getString("name");
            //     String address = rs.getString("address");
            //     String gender = rs.getString("gender");
            //     String program = rs.getString("program");
            //     System.out.println("s_id: " + s_id + ", Name: " + name + ", Address: " + address + ", Gender: " + gender + ", Program: " + program);
            // }

            // Update the program from CSIT to BBA
            // System.out.println("Updating program from CSIT to BBA...");
            // String sql = "UPDATE Student SET program = 'BBA' WHERE s_id = 1";
            // int rowsUpdated = stmt.executeUpdate(sql);
            // System.out.println(rowsUpdated + " records updated successfully");

            // // Display the updated data from the Student table
            // System.out.println("Displaying updated data from the Student table...");
            // ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            // while (rs.next()) {
            //     int s_id = rs.getInt("s_id");
            //     String name = rs.getString("name");
            //     String address = rs.getString("address");
            //     String gender = rs.getString("gender");
            //     String program = rs.getString("program");
            //     System.out.println("s_id: " + s_id + ", Name: " + name + ", Address: " + address + ", Gender: " + gender + ", Program: " + program);
            // }

            // Delete the record where id=1
            System.out.println("Deleting record where id=1...");
            String sql = "DELETE FROM Student WHERE s_id = 1";
            int rowsDeleted = stmt.executeUpdate(sql);
            System.out.println(rowsDeleted + " record deleted successfully");

            // Display the updated data from the Student table after deletion
            System.out.println("Displaying data after deletion from the Student table...");
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            while (rs.next()) {
                int s_id = rs.getInt("s_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                String program = rs.getString("program");
                System.out.println("s_id: " + s_id + ", Name: " + name + ", Address: " + address + ", Gender: " + gender + ", Program: " + program);
            }

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
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
        System.out.println("Over!");
    } // End main
} // End StudentDatabaseOperations
