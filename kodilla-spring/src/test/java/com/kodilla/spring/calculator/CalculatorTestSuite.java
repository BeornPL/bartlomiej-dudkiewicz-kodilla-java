package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(1.0, 1.1);
        double resultSub = calculator.sub(1.0, 1.1);
        double resultMul = calculator.mul(1.0, 1.1);
        double resultDiv = calculator.div(1.0, 0.5);
        //Then
        Assert.assertEquals(2.1, resultAdd, 0.001);
        Assert.assertEquals(-0.1, resultSub, 0.001);
        Assert.assertEquals(1.1, resultMul, 0.001);
        Assert.assertEquals(2.0, resultDiv, 0.001);
    }
}
