package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {
    public ProductOrderRequest retrieve() {
        User user = new User("Janusz123", "Jan Kowalski");
        LocalDateTime orderDate = LocalDateTime.of(2019, 5, 10, 10, 00);
        Product product = new Order("Samsung", "Telewizor Ultra HD, przekątna 52'", new BigDecimal("2000"));
        int quantity = 1;

        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}


