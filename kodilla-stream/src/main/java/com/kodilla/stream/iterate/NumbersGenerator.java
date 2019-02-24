package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(1, n -> ++n)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        NumbersGenerator.generateEven(20);
    }
}

