package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental(UserOfRental userOfRental, LocalDateTime carRentFrom, LocalDateTime carRentTo);
}
