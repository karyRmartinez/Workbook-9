package com.pluralsight.controllers;


import com.pluralsight.resttest.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final List<Product> products = Arrays.asList(

            new Product(1, "hot cocoa", 10.99),
            new Product(2, "tea", 15.99)

    );
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }
    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable long productId) {
        return products.stream()
                .filter(product -> product.getProductId() == productId)
                .findFirst()
                .orElse(null);
    }
}
