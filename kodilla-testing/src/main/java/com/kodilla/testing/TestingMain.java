package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Test user");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test add:");
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(6, 3);

        if (resultAdd == 9) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test subtract:");
        int resultSubtract = calculator.subtract(6, 3);
        if (resultSubtract == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
