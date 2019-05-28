package com.kodilla.spring.calculator;

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
        double resultOfAdd = calculator.add(8, 2);
        double resultOfSub = calculator.sub(8, 2);
        double resultOfMul = calculator.mul(8, 2);
        double resultOfDiv = calculator.div(8, 2);

        //Then
        Assert.assertEquals(10, resultOfAdd, 0.01);
        Assert.assertEquals(6, resultOfSub, 0.01);
        Assert.assertEquals(16, resultOfMul, 0.01);
        Assert.assertEquals(4, resultOfDiv, 0.01);


    }
}
