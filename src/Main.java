public class Main {
    public static void main(String[] args) {
        SongDAO songDAO = new SongDAO();

        // Добавление песен
        songDAO.addSong("Imagine", "John Lennon", 5000000);
        songDAO.addSong("Bohemian Rhapsody", "Queen", 7000000);

        // Чтение всех песен
        songDAO.readSongs();

        // Обновление названия песни
        songDAO.updateSong(1, "Imagine - Remastered");

        // Удаление песни
        songDAO.deleteSong(2);

        // Чтение всех песен после изменений
        songDAO.readSongs();
    }
}
