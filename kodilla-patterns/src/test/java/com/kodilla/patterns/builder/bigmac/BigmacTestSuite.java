package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .burgers((short) 3)
                .sauce("Barbecue")
                .ingredients("Bacon")
                .ingredients("Cheddar")
                .ingredients("Chili")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsNumber = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(3, ingredientsNumber);
    }
}