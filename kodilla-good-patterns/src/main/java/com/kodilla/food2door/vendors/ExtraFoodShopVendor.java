package com.kodilla.food2door.vendors;

import com.kodilla.food2door.products.Order;

import java.util.Random;

public class ExtraFoodShopVendor implements Vendor {
    @Override
    public boolean process(Order order) {
        System.out.println("Completely random processing...");
        Random random = new Random();

        return random.nextBoolean();
    }
}
