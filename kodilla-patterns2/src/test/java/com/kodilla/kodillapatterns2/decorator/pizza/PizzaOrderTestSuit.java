package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuit {

    @Test
    public void testBasicPizzaOrderGetPriceAndIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal pizzaPrice = theOrder.getPrice();
        String pizzaIngredients = theOrder.getIngredients();

        //Then
        assertEquals(new BigDecimal(15.00), pizzaPrice);
        assertEquals("Pizza with tomato sauce and cheese", pizzaIngredients);
    }

    @Test
    public void testPizzaOrderWithAdditionalIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalCheese(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new TomatoesDecorator(theOrder);
        theOrder = new PaprikaDecorator(theOrder);

        //When
        BigDecimal pizzaPrice = theOrder.getPrice();
        String pizzaIngredients = theOrder.getIngredients();

        //Then
        assertEquals(new BigDecimal(30.00), pizzaPrice);
        assertEquals("Pizza with tomato sauce and cheese + additional cheese + " +
                "pieces of ham + additional vegetable: olives + additional vegetable: tomatoes + " +
                "additional vegetable: paprika", pizzaIngredients);
    }
}
