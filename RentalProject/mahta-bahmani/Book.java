import java.util.Date;

public class Book extends  Item{

    private String author;
    private String publisher;

    Book(String title, String genre, String author, String publisher, Date releaseDate, int id){
        super(title ,genre,releaseDate,id);
        this.author = author;
        this.publisher = publisher;
    }
}
