package com.kodilla.food2door.vendors;

import com.kodilla.food2door.products.Order;

public class GlutenFreeShopVendor implements Vendor {
    @Override
    public boolean process(Order order) {
        System.out.println("Some processing...");
        double orderQuantity = order.getItemList().stream()
                .map(i -> i.getQuantity())
                .mapToDouble(n -> n.doubleValue())
                .sum();
        if(orderQuantity >= 3.5) {
            System.out.println("Processed.");
            return true;
        } else {
            System.out.println("Too small order. Not processed.");
            return false;
        }
    }
}
