package RentalSystem;

import java.util.ArrayList;

public class ObjectData {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Game> games = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }


}
