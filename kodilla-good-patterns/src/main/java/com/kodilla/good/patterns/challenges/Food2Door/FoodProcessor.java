package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodProcessor {

    public OrderAck process(FoodProviders provider, ItemDto itemDto) {
        Provider p = ProvidersFactory.getProvider(provider);
        return p.process(itemDto);
    }
}
