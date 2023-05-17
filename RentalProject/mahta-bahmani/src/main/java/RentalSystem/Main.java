package RentalSystem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) throws IOException {
        RentalStore rentalStore = new RentalStore();
        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\Admin\\Desktop\\New folder\\m2\\untitled7\\src\\test\\TestYourFork.json");
        ObjectData objectData = gson.fromJson(reader , new TypeToken<ObjectData>(){}.getType());
        Customer Joshn = objectData.customers.get(0);
        Customer Emily = objectData.customers.get(1);
        Customer Brown = objectData.customers.get(2);
        for(Item item : objectData.books){
            if (item.getId() == 3 || item.getId() == 6)
                rentalStore.rentItem(item , Joshn);

            if (item.getId() == 1 || item.getId() == 7)
                rentalStore.rentItem(item , Emily);

            if(item.getId() == 9)
                rentalStore.rentItem(item , Brown);
        }
        for (Item item : objectData.games){
            if(item.getId() == 4){
                rentalStore.rentItem(item , Brown);
                break;
            }
        }
        reader.close();
        Gson gson1 = new Gson();
        String json = gson1.toJson(objectData);
        String filepath = "C:\\Users\\Admin\\Desktop\\New folder\\m2\\untitled7\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(filepath);
            writer.write(json);
            writer.close();
            System.out.println("JSON Data has been updated");
        }
        catch (IOException e ){
            e.printStackTrace();
        }

    }
}