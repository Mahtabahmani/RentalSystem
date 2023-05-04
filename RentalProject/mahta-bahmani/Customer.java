import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    ArrayList<Rental> rentals = new ArrayList<>();
    public Customer(String name ,String email ,String phone ,String address ,int id){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Rental> getRentals() {
        if(rentals.size()==0)
            return null;
        return rentals;
    }
}
