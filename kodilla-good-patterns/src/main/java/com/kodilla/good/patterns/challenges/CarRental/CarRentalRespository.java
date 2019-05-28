package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDateTime;
import java.util.Random;

public class CarRentalRespository {
    public boolean createRental(UserOfRental userOfRental, LocalDateTime carRentFrom, LocalDateTime carRentTo) {
        return new Random().nextBoolean();
    }
}
