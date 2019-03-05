package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private Basket basket;

    public OrderRequest(User user, Basket item) {
        this.user = user;
        this.basket = item;
    }

    public User getUser() {
        return user;
    }

    public Basket getBasket() {
        return basket;
    }
}

