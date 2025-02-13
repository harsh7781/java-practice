package AbstractClasses;

public abstract class Item {
    private String id;
    private String title;
    private int numberOfCopies;

    public Item(String id, String title, int numberOfCopies) {
        this.id = id;
        this.title =  title;
        this.numberOfCopies = numberOfCopies;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public abstract void print();
    public abstract void checkIn();
    public abstract void checkOut();
    public abstract void addItem();

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + numberOfCopies;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id.equals(item.id);
    }
}

