package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface ProductOrderService {
    boolean sold(User user, LocalDateTime orderDate, Product product, int quantity);
}
