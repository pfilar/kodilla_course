package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrder {
    public boolean buy(User user, LocalDateTime orderDate, Product product, int quantity) {
        System.out.println("User: " + user.getLogin() + " has bought product: " + product.getProductName());
        return true;
    }

}
