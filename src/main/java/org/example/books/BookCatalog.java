package org.example.books;

import org.example.users.User;

import java.util.HashMap;

public class BookCatalog {
    //pares clave-valor, key-value pairs
    //key or "clave" data type String
    //value or "valor" data type String
    private HashMap<String, String> books = new HashMap<>();

    public void addBook(String isbn, String title) {
        //adds key-value pair
        books.put(isbn, title);
        System.out.println("Successfully created book with isbn: " + isbn);
    }

    public String getBook(String isbn){
        //retrieves value by it´s key
        return books.get(isbn);
    }

    public void deleteBook(String isbn){
        //deletes key-value by it´s key
        books.remove(isbn);
        System.out.println("Successfully deleted book by isbn: " + isbn);
    }
}
