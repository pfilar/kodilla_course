package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {
    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + slices of salami";
    }
}
