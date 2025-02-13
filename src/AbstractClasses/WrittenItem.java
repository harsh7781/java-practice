package AbstractClasses;

public abstract  class WrittenItem extends  Item{
    private String author;

    public WrittenItem(String id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public abstract void print();

    @Override
    public abstract void checkIn();

    @Override
    public abstract void checkOut();

    @Override
    public abstract void addItem();
}
