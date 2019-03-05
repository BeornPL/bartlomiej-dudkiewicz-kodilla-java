package com.kodilla.good.patterns.challenges;

public class TextFileRepository implements OrderRepository {
    @Override
    public void storeData() {
        System.out.println("Saving in txt... ... ... Done!");
    }
}
