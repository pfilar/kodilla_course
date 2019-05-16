package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        ItemDto itemDto = new ItemDto("baton Mars", 500);    // Dto - Data Transfer Object  / zgłoszenie zamówienia
        FoodProcessor foodProcessor = new FoodProcessor();

        FoodProviders provider = FoodProviders.GLUTEN_FREE_SHOP;
        OrderAck ack = foodProcessor.process(provider, itemDto);                  // ack - acknowledgement  / potwierdzenie zamówienia
        System.out.println(ack);
    }
}
