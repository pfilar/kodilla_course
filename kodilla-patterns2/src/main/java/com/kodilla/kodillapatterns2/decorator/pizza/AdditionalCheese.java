package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheese extends AbstractPizzaOrderDecorator {
    public AdditionalCheese (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + additional cheese";
    }
}
