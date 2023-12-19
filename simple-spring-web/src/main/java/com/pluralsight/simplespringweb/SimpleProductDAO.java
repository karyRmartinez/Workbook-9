package com.pluralsight.simplespringweb;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
@Component
public class SimpleProductDAO implements ProductDAO {
    private List<Product> products = new ArrayList<>();

    public SimpleProductDAO() {
        this.products = new ArrayList<>();
        // Adding products
        this.products.add(new Product(1, "Coffee", "pantry", 9.99));
        this.products.add(new Product(2, "Tea", "pantry", 9.99));
        this.products.add(new Product(3, "Cocoa powder", "candy", 12.99));
    }
    public SimpleProductDAO(List<Product> products) {
        this.products = products;
    }

    @Override
    public void add(Product product) {
    products.add(product);
    }

    @Override
    public List<Product> getAll() {
       return new ArrayList<>(products);
    }
}
