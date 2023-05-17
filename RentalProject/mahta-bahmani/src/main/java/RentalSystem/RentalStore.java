package RentalSystem;
import java.util.ArrayList;
import java.util.Date;

public class RentalStore {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Rental> rentals = new ArrayList<>();

    public RentalStore(){

    }
    public void Register(Customer customer){

        customers.add(customer);
    }
    public void addItem(Item item){

        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public ArrayList<Item> getAvailableItems(){
        ArrayList<Item> availableItems = new ArrayList<>();
        for (int i=0;i<items.size();i++){
            if(items.get(i).isAvailable()){
                availableItems.add(items.get(i));
            }
        }
       return availableItems;
    }
    public void rentItem(Item item, Customer customer){
        boolean check = false;
        int id = item.getId()*10+customer.getId();
        item.setAvailable(check);
        Rental rental = new Rental(item ,customer ,id);
        rentals.add(rental);
        if(customer.rentals == null)
            customer.rentals = new ArrayList<>();
        customer.rentals.add(rental);
    }
    public void returnMovie(Rental rental){
        boolean available = true;
        rental.getItem().setAvailable(available);
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
    public Item getItemById(int id){
        for(int i=0;i<items.size();i++){
            if(items.get(i).getId()==id){
                return items.get(i);
            }
        }
        return null;
    }
}
