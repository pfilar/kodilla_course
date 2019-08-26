package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamDecorator extends AbstractPizzaOrderDecorator {
    public HamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + pieces of ham";
    }
}
