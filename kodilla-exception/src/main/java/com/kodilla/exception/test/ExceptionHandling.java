package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(0.5, 0.0));
        } catch (Exception e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Finally block!");
        }

    }
}
