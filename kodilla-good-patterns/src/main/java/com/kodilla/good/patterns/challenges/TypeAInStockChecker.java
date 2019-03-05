package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class TypeAInStockChecker implements InStockChecker {
    @Override
    public boolean isInStock() {
        System.out.println("Checking if in stock... ... ... Done!");
        Random random = new Random();
        return random.nextBoolean();
    }
}
