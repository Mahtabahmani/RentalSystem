import java.util.Date;

public class Rental {
    private int id;
    private Customer customer;
    private Item item;
    private Date rentaldate;
    private Date returndate;

    public Rental(Item item,Customer customer,int id){
        this.item = item;
        this.customer = customer;
        this.id = id;
        Date date = new Date();
        this.rentaldate = date;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
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

}
