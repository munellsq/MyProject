import java.util.Objects;

public class Song extends MediaItem {
    private String artist;
    private int listenersPM;

    public Song(String title, String artist, int listenersPM) {
        super(title);
        this.artist = artist;
        this.listenersPM = listenersPM;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getListenersPM() {
        return listenersPM;
    }

    public void setListenersPM(int listenersPM) {
        this.listenersPM = listenersPM;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return getTitle().equals(song.getTitle()) && artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), artist);
    }

    @Override
    public String toString() {
        return getTitle() + " by " + artist + " (" + listenersPM + " listeners/month)";
    }
}
