package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivesDecorator extends AbstractPizzaOrderDecorator {
    public OlivesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + additional vegetable: olives";
    }
}
