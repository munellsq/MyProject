public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Imagine", "John Lennon", 1000000);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 5000000);
        Artist artist1 = new Artist("John Lennon", "pop", 3);
        Artist artist2 = new Artist("Queen", "rock", 2);

        Playlist playlist = new Playlist("My Playlist");
        playlist.addSong(song1);
        playlist.addSong(song2);

        System.out.println(playlist);

        if (song1.getListenersPM() > song2.getListenersPM()) {
            System.out.println(song1.getTitle() + " has more listeners than " + song2.getTitle());
        } else {
            System.out.println(song2.getTitle() + " has more listeners than " + song1.getTitle());
        }

        playlist.filterSongsByArtist("Queen").forEach(System.out::println);

        Song foundSong = playlist.findSongByTitle("Imagine");
        System.out.println(foundSong != null ? "Found: " + foundSong : "Song not found");

        playlist.sortSongsByListeners();
        System.out.println("\nSorted Playlist:\n" + playlist);
    }
}
