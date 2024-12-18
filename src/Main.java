import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Imagine", "John Lennon", 3.5);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 5.9);

        System.out.println(song1);
        System.out.println(song2);

        if (song1.getDuration() > song2.getDuration()) {
            System.out.println(song1.getTitle() + " longer than " + song2.getTitle() + "\n");
        } else {
            System.out.println(song2.getTitle() + " longer than " + song1.getTitle() + "\n");
        }

        Artist artist1 = new Artist("John Lennon", "pop", 3);
        Artist artist2 = new Artist("Queen", "pop", 2);

        System.out.println(artist1.getName() + " has " + artist1.getTotalAlbums() + " albums" );
        System.out.println(artist2.getName() + " has " + artist2.getTotalAlbums() + " albums" );

        Playlist playlist = new Playlist("ssss");
        System.out.println("\n"+"The playlist|" + playlist.getTitle() + " was created");

        playlist.addSong(song1);
        System.out.println("The song " + song1.getTitle() + " added to playlist!");
        playlist.addSong(song2);
        System.out.println("The song " + song2.getTitle() + " added to playlist!");

        System.out.println("\n"+ playlist);

        playlist.removeSong(song2);
        System.out.println("The song " + song2.getTitle() + " removed from playlist!");
        System.out.println("\n"+ playlist);

    }
}
