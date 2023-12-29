package com.pluralsight.controllers;


import com.pluralsight.DAO.CategoryDao;
import com.pluralsight.resttest.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private CategoryDao categoryDao;
    @Autowired
    public CategoriesController(CategoryDao categoryDao){
        this.categoryDao = categoryDao;
    }
    private final List<Category> categories = Arrays.asList(
            new Category(1, "Category1"),
            new Category(2, "Category2"),
            new Category(3, "Category 3")

    );

    @RequestMapping(path="/categories", method = RequestMethod.GET)
    public List<Category> findAll(){
        return categoryDao.getAll();
    }

    @RequestMapping(path="/categories/{id}", method = RequestMethod.GET)
    public Category findById(@PathVariable(name="id") int id){
        return categoryDao.getById(id);
    }
//    @GetMapping
//    public List<Category> getAllCategories() {
//        return categories;
//    }
//
//    @GetMapping("/{categoryId}")
//    public Category getCategoryById(@PathVariable long categoryId) {
//        return categories.stream()
//                .filter(category -> category.getCategoryID() == categoryId)
//                .findFirst()
//                .orElse(null);
//    }
}
