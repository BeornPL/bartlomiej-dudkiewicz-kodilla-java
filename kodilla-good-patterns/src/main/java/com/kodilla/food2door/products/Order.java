package com.kodilla.food2door.products;

import com.kodilla.food2door.vendors.Vendor;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Vendor vendor;
    private List<Item> itemList = new ArrayList<>();

    public Order(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public Vendor getVendor() {
        return vendor;
    }
}
