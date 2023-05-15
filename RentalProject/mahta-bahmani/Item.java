import java.util.ArrayList;
import java.util.Date;

public class Item {
    private String title;
    private String genre;
    private Date releaseDate;
    private int id;
    private boolean isAvailable;
    public Item(String title, String genre, Date releaseDate, int id){
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.id = id;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }


    public String getGenre() {
        return genre;
    }


    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getId() {
        return id;
    }
}
