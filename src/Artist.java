import java.util.Objects;

public class Artist {
    private String name;
    private String genre;
    private int totalAlbums;

    public Artist(String name, String genre, int totalAlbums) {
        this.name = name;
        this.genre = genre;
        this.totalAlbums = totalAlbums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTotalAlbums() {
        return totalAlbums;
    }

    public void setTotalAlbums(int totalAlbums) {
        this.totalAlbums = totalAlbums;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return name.equals(artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Artist: " + name + ", Genre: " + genre + ", Total Albums: " + totalAlbums;
    }
}

