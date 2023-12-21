package com.pluralsight.controllers;


import com.pluralsight.resttest.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/categories")
public class CategoriesController {
    private final List<Category> categories = Arrays.asList(
            new Category(1, "Category1"),
            new Category(2, "Category2")

    );

    @GetMapping
    public List<Category> getAllCategories() {
        return categories;
    }

    @GetMapping("/{categoryId}")
    public Category getCategoryById(@PathVariable long categoryId) {
        return categories.stream()
                .filter(category -> category.getCategoryID() == categoryId)
                .findFirst()
                .orElse(null);
    }
}
