package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrive() {
        User user = new User("Bilbo", "Baggins");

        Basket basket = new Basket();

        Item item1 = new Item("Product 1", 2.0);
        Item item2 = new Item("Product 2", 1.0);
        Item item3 = new Item("Product 3", 3.0);

        basket.getItems().add(item1);
        basket.getItems().add(item2);
        basket.getItems().add(item3);

        return new OrderRequest(user, basket);
    }
}
