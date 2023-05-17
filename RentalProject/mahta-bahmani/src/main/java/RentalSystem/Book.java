package RentalSystem;
import java.util.Date;

public class Book extends  Item{

    private String writer;
    private String publisher;
    private String bookCover;

    Book(String title, String genre, String writer, String publisher, String bookCover, Date releaseDate, int id){
        super(title ,genre,releaseDate,id);
        this.writer = writer;
        this.publisher = publisher;
        this.bookCover = bookCover;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookCover() {
        return bookCover;
    }

    public String getWriter() {
        return writer;
    }
}
