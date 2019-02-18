package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetSandBeansQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Poland", new BigDecimal("1"));
        Country germany = new Country("Germany", new BigDecimal("10"));
        Country france = new Country("France", new BigDecimal("100"));
        Country egypt = new Country("Egypt", new BigDecimal("1000"));
        Country libya = new Country("Libya", new BigDecimal("10000"));
        Country japan = new Country("Japan", new BigDecimal("100000"));
        Country china = new Country("China", new BigDecimal("1000000"));

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        asia.addCountry(japan);
        asia.addCountry(china);

        africa.addCountry(egypt);
        africa.addCountry(libya);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();


        //Then
        BigDecimal expectedTotalPeople = new BigDecimal("1111111");
        Assert.assertEquals(expectedTotalPeople, totalPeople);
    }
}