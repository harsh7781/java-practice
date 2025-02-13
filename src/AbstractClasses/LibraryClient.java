package AbstractClasses;

public class LibraryClient {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Java Programming", 5, "John Doe");
        JournalPaper journal1 = new JournalPaper("J001", "AI Research", 3, "Jane Smith", 2022);
        Video video1 = new Video("V001", "Inception", 4, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd1 = new CD("C001", "The Dark Side of the Moon", 2, 42, "Pink Floyd", "Rock");

        book1.print();
        journal1.print();
        video1.print();
        cd1.print();

        book1.checkOut();
        video1.checkIn();
        cd1.addItem();
    }
}


