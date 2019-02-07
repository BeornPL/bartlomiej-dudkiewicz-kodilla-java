package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return null;
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i=0; i<numbers.size(); i++) {
            Integer n = numbers.get(i);
            if (n%2 == 0) {
                evenNumbers.add(n);
            }
        }
        return evenNumbers;
    }
}
