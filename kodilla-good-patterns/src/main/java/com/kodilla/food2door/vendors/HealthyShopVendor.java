package com.kodilla.food2door.vendors;

import com.kodilla.food2door.products.Order;

public class HealthyShopVendor implements Vendor {
    @Override
    public boolean process(Order order) {
        System.out.println("Even different processing method.");
        return true;
    }
}
