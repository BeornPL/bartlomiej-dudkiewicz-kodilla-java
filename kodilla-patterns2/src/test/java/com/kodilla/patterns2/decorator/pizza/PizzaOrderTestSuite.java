package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);

        //When
        BigDecimal calculatedCost = pizzaOrder.getValue();
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals(new BigDecimal(19), calculatedCost);
        assertEquals("Basic pizza with tomato sauce and cheese with extra cheese with ham", description);
    }
}
