import java.util.ArrayList;
import java.util.Date;

public class RentalStore {
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Rental> rentals = new ArrayList<>();

    public RentalStore(){

    }
    public void Register(Customer customer){
        customers.add(customer);
    }
    public void addMovie(Movie movie){
        movies.add(movie);
    }
    public void removeMovie(Movie movie){
        movies.remove(movie);
    }
    public ArrayList<Movie> getAvailableMovies(){
        ArrayList<Movie> availableMovies = new ArrayList<>();
        for (int i=0;i<movies.size();i++){
            if(movies.get(i).isAvailable()){
                availableMovies.add(movies.get(i));
            }
        }
       return availableMovies;
    }
    public void rentMovie(Movie movie, Customer customer){
        boolean check = false;
        int id = movie.getId()+customer.getId();
        movie.setAvailable(check);
        Rental rental = new Rental(movie ,customer ,id);
        rentals.add(rental);
        customer.rentals.add(rental);
    }
    public void returnMovie(Rental rental){
        boolean available = true;
        rental.getMovie().setAvailable(available);
        rental.getCustomer().rentals.remove(rental);
        Date date = new Date();
        rental.setReturndate(date);
    }
    public Customer getCustomerByID(int id){
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getId()==id){
                return customers.get(i);
            }
        }
        return null;
    }
    public Movie getMovieById(int id){
        for(int i=0;i<movies.size();i++){
            if(movies.get(i).getId()==id){
                return movies.get(i);
            }
        }
        return null;
    }
}
