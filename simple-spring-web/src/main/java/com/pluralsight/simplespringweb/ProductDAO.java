package com.pluralsight.simplespringweb;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO {
    void add(Product product);
    List<Product> getAll();
}
