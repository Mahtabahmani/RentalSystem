package RentalSystem;
import java.util.Date;

public class Game extends Item{

    private String manufacturer;
    private String director;
    private double gameRate;
    private String aboutGame;
    public Game(String title, String genre, String manufacturer, String director, String aboutGame, double gameRate, Date releaseDate, int id){
        super(title ,genre,releaseDate,id);
        this.manufacturer = manufacturer;
        this.director = director;
        this.aboutGame =aboutGame;
        this.gameRate = gameRate;
    }

    public String getDirector() {
        return director;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getGameRate() {
        return gameRate;
    }

    public String getAboutGame() {
        return aboutGame;
    }
}
