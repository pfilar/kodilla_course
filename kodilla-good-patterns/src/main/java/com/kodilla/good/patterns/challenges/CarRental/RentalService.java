package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(UserOfRental userOfRental, LocalDateTime carRentFrom, LocalDateTime carRentTo);
}
