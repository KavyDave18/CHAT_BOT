import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private String u_name;
    private String pass;

    public User(String username, String password) {
        this.u_name = (username != null) ? username.trim() : "";
        this.pass = (password != null) ? password.trim() : "";
    }


    public boolean registerUser() {
        System.out.println("DEBUG: Username = '" + u_name + "', Password = '" + pass + "'");
        String query = "INSERT INTO user (u_name, pass) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, u_name);
            stmt.setString(2, pass);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // <-- shows actual issue
            return false;
        }


    }

    public static boolean loginUser(String u_name, String pass) {
        String query = "SELECT * FROM user WHERE u_name = ? AND pass = ?";;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, u_name);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
