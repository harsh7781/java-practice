package AbstractClasses;


public class JournalPaper extends WrittenItem{
    private int yearPublished;

    public JournalPaper(String id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
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
