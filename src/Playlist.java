import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Song> songs;

    public Playlist(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public String toString() {
        StringBuilder playlistInfo = new StringBuilder("Playlist: " + title + "\nSongs:\n");
        for (Song song : songs) {
            playlistInfo.append(song).append("\n");
        }
        return playlistInfo.toString();
    }
}
