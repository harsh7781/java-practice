package AbstractClasses;

public class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(String id, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public void print() {
        System.out.println("Video: " + getTitle() + ", Directed by: " + director + ", Genre: " + genre + ", Released in: " + yearReleased + ", Runtime: " + getRuntime() + " minutes, Copies: " + getNumberOfCopies());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in the video: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out the video: " + getTitle());
    }

    @Override
    public void addItem() {
        System.out.println("Adding a new video to the library: " + getTitle());
    }
}


