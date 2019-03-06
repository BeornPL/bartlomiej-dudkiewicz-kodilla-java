package com.kodilla.food2door.products;

public class OrderProcessor {
    public static void process(Order order) {
        if (order.getVendor().process(order)) {
            System.out.println("Order processed.");
        } else {
            System.out.println("Error processing the order.");
        }
    }
}
