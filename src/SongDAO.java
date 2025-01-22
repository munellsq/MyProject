import java.sql.*;

public class SongDAO {

    // Добавление новой песни в базу данных
    public void addSong(String title, String artist, int listenersPM) {
        String sql = "INSERT INTO songs (title, artist, listeners_pm) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, artist);
            pstmt.setInt(3, listenersPM);
            pstmt.executeUpdate();
            System.out.println("Song added successfully.");
        } catch (SQLException e) {
            System.err.println("Error adding data: " + e.getMessage());
        }
    }

    // Чтение всех песен из базы данных
    public void readSongs() {
        String sql = "SELECT * FROM songs";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("--- Song List ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Title: " + rs.getString("title") +
                        ", Artist: " + rs.getString("artist") +
                        ", Listeners/Month: " + rs.getInt("listeners_pm"));
            }
        } catch (SQLException e) {
            System.err.println("Error getting data: " + e.getMessage());
        }
    }

    // Обновление названия песни по её ID
    public void updateSong(int id, String newTitle) {
        String sql = "UPDATE songs SET title = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newTitle);
            pstmt.setInt(2, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Song updated successfully.");
            } else {
                System.out.println("No song found with ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error updating data: " + e.getMessage());
        }
    }

    // Удаление песни по её ID
    public void deleteSong(int id) {
        String sql = "DELETE FROM songs WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Song deleted successfully.");
            } else {
                System.out.println("No song found with ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error deleting data: " + e.getMessage());
        }
    }
}
