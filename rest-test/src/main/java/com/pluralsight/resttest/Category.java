package com.pluralsight.resttest;

public class Category {
    public Category(int categoryID, String category1) {
        CategoryID = categoryID;
    }

    public Category(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    private int CategoryID;
    private  String CategoryName;

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }
}
