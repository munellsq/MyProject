import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Imagine", "John Lennon", 3.5);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 5.9);

        Artist artist1 = new Artist("John Lennon", "pop", 3);
        Artist artist2 = new Artist("Queen", "rock", 2);

        Playlist playlist = new Playlist("My Playlist");
        playlist.addSong(song1);
        playlist.addSong(song2);

        System.out.println(playlist);

        // Сравнение песен
        if (song1.getDuration() > song2.getDuration()) {
            System.out.println(song1.getTitle() + " is longer than " + song2.getTitle());
        } else {
            System.out.println(song2.getTitle() + " is longer than " + song1.getTitle());
        }

        // Фильтрация
        playlist.filterSongsByArtist("Queen").forEach(System.out::println);

        // Поиск
        Song foundSong = playlist.findSongByTitle("Imagine");
        System.out.println(foundSong != null ? "Found: " + foundSong : "Song not found");

        // Сортировка
        playlist.sortSongsByDuration();
        System.out.println("\nSorted Playlist:\n" + playlist);
    }
}
