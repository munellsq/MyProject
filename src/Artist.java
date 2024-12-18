public class Artist {
    private String name;
    private String genre;
    private int totalAlbums;

    // Constructor
    public Artist(String name, String genre, int totalAlbums) {
        this.name = name;
        this.genre = genre;
        this.totalAlbums = totalAlbums;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getTotalAlbums() {
        return totalAlbums;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTotalAlbums(int totalAlbums) {
        this.totalAlbums = totalAlbums;
    }

    // ToString method for output
    @Override
    public String toString() {
        return "Artist: " + name + ", Genre: " + genre + ", Total Albums: " + totalAlbums;
    }
}
