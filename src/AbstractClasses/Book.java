package AbstractClasses;

public class Book extends  WrittenItem{
    public Book(String id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", Copies: " + getNumberOfCopies());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in the book: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out the book: " + getTitle());
    }

    @Override
    public void addItem() {
        System.out.println("Adding a new book to the library: " + getTitle());
    }
}
