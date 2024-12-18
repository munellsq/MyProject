import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Song> songs;

    // Constructor
    public Playlist(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove a song from the playlist
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Get all songs in the playlist
    public ArrayList<Song> getSongs() {
        return songs;
    }

    // ToString method for output
    @Override
    public String toString() {
        StringBuilder playlistInfo = new StringBuilder("Playlist: " + title + "\nSongs:\n");
        for (Song song : songs) {
            playlistInfo.append(song).append("\n");
        }
        return playlistInfo.toString();
    }
}
