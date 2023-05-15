import java.util.Date;

public class Game extends Item{

    private String platform;
    private String publisher;
    public Game(String title, String genre, String platform, String publisher, Date releaseDate, int id){
        super(title ,genre,releaseDate,id);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }
}
