package com.pluralsight.resttest;

public class Product {
    private int productId;
    private String productName;
    private int categoryId;
    private double unitPrice;



    public Product(int productId, String product1, double v, double unitPrice) {
        this.productId = productId;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Product() {

    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productId=").append(productId);
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", categoryId=").append(categoryId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append('}');
        return sb.toString();
    }
}
