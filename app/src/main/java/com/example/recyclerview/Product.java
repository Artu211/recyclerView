package com.example.recyclerview;

public class Product {
    private String product;

    private float price;

    public Product(String product, float price) {
        this.product = product;
        this.price = price;
    }


    public String getProduct() {
        return product;
    }

    public float getPrice() {
        return price;
    }
}
