package com.kodilla.good.patterns.challenges;

public class Item {
    private String productName;
    private double quantity;

    public Item(String productName, double quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }
}
