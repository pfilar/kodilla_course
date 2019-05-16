package com.kodilla.good.patterns.challenges.Food2Door;

public class ItemDto {
    private String productName;
    private int quantity;

    public ItemDto(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
