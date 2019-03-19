package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Bun("roll")
                .Burgers((short) 3)
                .Sauce("Barbecue")
                .Ingredients("Bacon")
                .Ingredients("Cheddar")
                .Ingredients("Chili")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsNumber = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(3, ingredientsNumber);
    }
}