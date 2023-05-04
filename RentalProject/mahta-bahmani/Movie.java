import java.util.Date;

public class Movie extends Item{

    private String director;
    private String cast;
    private boolean isAvailable;
    private String title;
    private String genre;
    private Date releaseDate;
    private int id;
    public Movie(String title, String genre, String director, String cast, Date releaseDate,int id) {
        this.setTitle(title);
        this.setGenre(genre);
        this.director = director;
        this.cast = cast;
        this.isAvailable = true;
        setReleaseDate(releaseDate);
        setId(id);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }
    public boolean isAvailable(){
        if(isAvailable) {
            return true;
        }else {
            return false;
        }
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
