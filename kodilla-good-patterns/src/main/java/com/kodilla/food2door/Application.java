package com.kodilla.food2door;

import com.kodilla.food2door.products.Order;
import com.kodilla.food2door.products.OrderRetriever;

public class Application {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        if (order.getVendor().process(order)) {
            System.out.println("Order processed.");
        } else {
            System.out.println("Error processing the order.");
        }
    }
}
