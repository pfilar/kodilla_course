package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDateTime;

public class RentRequest {

    private UserOfRental userOfRental;
    private LocalDateTime carRentFrom;
    private LocalDateTime carRentTo;

    public RentRequest(final UserOfRental userOfRental, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        this.userOfRental = userOfRental;
        this.carRentFrom = carRentFrom;
        this.carRentTo = carRentTo;
    }

    public UserOfRental getUserOfRental() {
        return userOfRental;
    }

    public LocalDateTime getCarRentFrom() {
        return carRentFrom;
    }

    public LocalDateTime getCarRentTo() {
        return carRentTo;
    }
}
