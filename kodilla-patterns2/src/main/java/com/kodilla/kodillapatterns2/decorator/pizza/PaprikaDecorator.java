package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PaprikaDecorator extends AbstractPizzaOrderDecorator {
    public PaprikaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + additional vegetable: paprika";
    }
}
