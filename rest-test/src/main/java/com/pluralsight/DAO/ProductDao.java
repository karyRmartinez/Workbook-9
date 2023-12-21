package com.pluralsight.DAO;

import com.pluralsight.resttest.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);
}
