import java.util.Objects;

public class Song extends MediaItem {
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        super(title);
        this.artist = artist;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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
        return getTitle() + " by " + artist + " (" + duration + " mins)";
    }
}
