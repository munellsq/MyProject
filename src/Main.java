public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Song song1 = new Song("Imagine", "John Lennon", 3.5);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 5.9);

        // Вывод информации
        song1.displayInfo();
        song2.displayInfo();

        // Сравнение песен
        if (song1.getDuration() > song2.getDuration()) {
            System.out.println(song1.getTitle() + " longer than " + song2.getTitle());
        } else {
            System.out.println(song2.getTitle() + " longer than " + song1.getTitle());
        }
    }
}
