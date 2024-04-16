package org.example;

import org.example.books.BookCatalog;
import org.example.products.Product;
import org.example.traffic.TrafficControl;
import org.example.traffic.TrafficLight;
import org.example.users.User;
import org.example.users.UserType;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //trafficExcercise();
        //userExcercise();
        //bookExcercise();
        inventoryExercise();
    }

    private static void inventoryExercise() {
        HashMap<Product, Integer> inventory = new HashMap<>();
        Product product1 = new Product("Coffee mug", "101");

        //add quantity to our inventory for product name:"Coffee mug" id: 101
        inventory.put(product1, 150);

        Product sameProduct = new Product("Coffee mug", "101");

        //retrieve the inventory count by product name:"Coffee mug" id: 101
        System.out.println("--Retrieving value by sameProduct key--");
        System.out.println("Inventory count for product ID 101: " + inventory.get(sameProduct));

        //delete the inventory key-value pair by product name:"Coffee mug" id: 101
        System.out.println("\n--Deleting key-value pair by sameProduct key--");
        inventory.remove(sameProduct);

        //as it was deleted even if it was by another variable (sameProduct)
        // there is no inventory count for the key product name:"Coffee mug" id: 101
        System.out.println("\n--Retrieving value by product1 key--");
        System.out.println("Inventory count for product ID 101: " + inventory.get(product1));

        // TO TEST the importance of equals() and hashCode()
        // comment them in the Product class and run inventoryExercise
        // you will see it will not recognize sameProduct equals as product1
    }

    private static void bookExcercise() {
        //Hash maps - mapas hash
        BookCatalog catalog = new BookCatalog();
        String isbn = "978-0132350884";
        catalog.addBook(isbn, "Clean Code");
        System.out.println(catalog.getBook(isbn));
        catalog.deleteBook(isbn);
    }

    private static void userExcercise() {
        User user = new User("pepito", "password", UserType.ADMIN);
        user.setType(UserType.USER);
        //user.setType("WRONG");
    }

    private static void trafficExcercise() {
        TrafficControl control = new TrafficControl();
        control.changeLight(TrafficLight.GREEN);
        control.changeLight(TrafficLight.AMBER);
        control.changeLight(TrafficLight.RED);
    }
}
