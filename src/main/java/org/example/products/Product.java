package org.example.products;

import java.util.Objects;

public class Product {
    private String name;
    private String id;

    public Product(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Comment to test it´s importance
    @Override
    public boolean equals(Object o) {
        //if the current object (this) is the same as the object being compared with (o) = TRUE
        if (this == o) return true;

        //if o is null OR if o and this do not belong to the same class (Product) = FALSE
        if (o == null || getClass() != o.getClass()) return false;

        //if neither of the above cases:
        //Casts the Object o to a Product type and assigns it to a variable product
        //this is safe because we have already checked that o is an instance of Product in line 36
        Product product = (Product) o;

        //compare the names and IDs of this and the new product object
        //if both the name and the ID are equal, returns TRUE, else FALSE
        return Objects.equals(getName(), product.getName()) && Objects.equals(getId(), product.getId());
    }

    //Comment to test it´s importance
    @Override
    public int hashCode() {
        //takes parameters and generates a hash code for the Product object based on their values
        return Objects.hash(getName(), getId());
   }
}
