package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = i;
        }

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        double expectedAverage = 4.5;
        Assert.assertEquals(expectedAverage, average, 0.00001);

    }
}
