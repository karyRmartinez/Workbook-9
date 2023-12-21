package com.pluralsight.DAO;

import com.pluralsight.resttest.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);

}
