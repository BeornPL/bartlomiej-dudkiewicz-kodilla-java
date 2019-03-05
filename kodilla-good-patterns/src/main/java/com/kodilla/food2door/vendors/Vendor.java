package com.kodilla.food2door.vendors;

import com.kodilla.food2door.products.Order;

public interface Vendor {
    boolean process(Order order);
}
