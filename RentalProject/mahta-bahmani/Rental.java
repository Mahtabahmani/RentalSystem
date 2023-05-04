import java.util.Date;

public class Rental {
    private int id;
    private Customer customer;
    private Movie movie;
    private Date rentaldate;
    private Date returndate;

    public Rental(Movie movie,Customer customer,int id){
        this.movie = movie;
        this.customer = customer;
        this.id = id;
        Date date = new Date();
        this.rentaldate = date;
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentaldate() {
        return rentaldate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public double calculateLateFee(){
        return 0;
    }
}
