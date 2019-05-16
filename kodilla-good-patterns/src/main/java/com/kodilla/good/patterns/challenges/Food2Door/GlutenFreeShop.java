package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Random;

public class GlutenFreeShop implements Provider {
    @Override
    public OrderAck process(ItemDto itemDto) {
        return new OrderAck(new Random().nextBoolean());
    }
}
