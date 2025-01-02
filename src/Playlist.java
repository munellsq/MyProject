import java.util.ArrayList;
import java.util.Comparator;

public class Playlist extends MediaItem {
    private ArrayList<Song> songs;

    public Playlist(String title) {
        super(title);
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public ArrayList<Song> filterSongsByArtist(String artistName) {
        ArrayList<Song> filtered = new ArrayList<>();
        for (Song song : songs) {
            if (song.getArtist().equalsIgnoreCase(artistName)) {
                filtered.add(song);
            }
        }
        return filtered;
    }

    public Song findSongByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    public void sortSongsByDuration() {
        songs.sort(Comparator.comparingDouble(Song::getDuration));
    }

    @Override
    public String toString() {
        StringBuilder playlistInfo = new StringBuilder("Playlist: " + getTitle() + "\nSongs:\n");
        for (Song song : songs) {
            playlistInfo.append(song).append("\n");
        }
        return playlistInfo.toString();
    }
}
