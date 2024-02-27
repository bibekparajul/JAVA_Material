import java.sql.*;

public class DatabaseCRUD {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void insertIntoDatabase(Integer s_id, String name, String address, String gender, String program) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            String sql = "INSERT INTO Student (s_id,name, address, gender, program) VALUES (?, ?, ?, ?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, s_id);
            stmt.setString(2, name);
            stmt.setString(3, address);
            stmt.setString(4, gender);
            stmt.setString(5, program);
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // End finally try
        }
    }

    public static void getFromDatabase() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM Student";   
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int s_id = rs.getInt("s_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                String program = rs.getString("program");
                System.out.println("s_id: " + s_id + ", Name: " + name + ", Address: " + address + ", Gender: " + gender + ", Program: " + program);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // End finally try
        }
    }
    
    public static void main(String[] args) {
        // Inserting a record into the database
        insertIntoDatabase(1,"Bibek Parajuli", "Kathmandu", "Male", "BSc.CSIT");
        insertIntoDatabase(2,"Sanju", "Kathmandu", "Male", "BSc.CSIT");
        insertIntoDatabase(3,"Saman", "Kathmandu", "Male", "BSA");

        // Fetching and displaying all records from the database
        System.out.println("Displaying data from the Student table...");
        getFromDatabase();
    }
}
