package com.kodilla.food2door.products;

import com.kodilla.food2door.vendors.ExtraFoodShopVendor;
import com.kodilla.food2door.vendors.Vendor;

public class OrderRetriever {

    public Order retrieve() {

        Item item1 = new Item("Item 1", 1.0);
        Item item2 = new Item("Item 2", 2.0);
        Item item3 = new Item("Item 3", 3.0);

        Vendor chosenVendor = new ExtraFoodShopVendor();

        Order order = new Order(chosenVendor);

        order.getItemList().add(item1);
        order.getItemList().add(item2);
        order.getItemList().add(item3);

        return order;
    }
}
