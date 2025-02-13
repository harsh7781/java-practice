package AbstractClasses;
public abstract class MediaItem extends Item{
    private int runtime;

    public MediaItem(String id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
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
