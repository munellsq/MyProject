public class Song {
    private String title;
    private String artist;
    private double duration;

    // Конструктор
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    // Метод для вывода информации о песне
    public void displayInfo() {
        System.out.println("Song: " + title + ", Artist: " + artist + ", Duration: " + duration + " mins");
    }
}
