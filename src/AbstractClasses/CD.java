package AbstractClasses;

public class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(String id, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(id, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + getTitle() + " by " + artist + ", Genre: " + genre + ", Runtime: " + getRuntime() + " minutes, Copies: " + getNumberOfCopies());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in the CD: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out the CD: " + getTitle());
    }

    @Override
    public void addItem() {
        System.out.println("Adding a new CD to the library: " + getTitle());
    }
}


