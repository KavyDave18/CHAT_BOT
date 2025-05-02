import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Messaging {
    public static void sendMessage(String sender, String receiver, String message) {
        String query = "INSERT INTO messages (sender, receiver, message) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, sender);
            stmt.setString(2, receiver);
            stmt.setString(3, message);
            stmt.executeUpdate();
            System.out.println("Message sent successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void viewMessages(String username) {
        String query = "SELECT sender, message, timestamp FROM messages WHERE receiver = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            System.out.println("Your Messages:");
            while (rs.next()) {
                System.out.println("From: " + rs.getString("sender") +
                        " | Message: " + rs.getString("message") +
                        " | Time: " + rs.getTimestamp("timestamp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
