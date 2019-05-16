package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CarRentalService {
    public boolean rent(final UserOfRental userOfRental, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting car for: " + userOfRental.getUserName() + " " + userOfRental.getUserSurname() + "from: " + carRentFrom.toString() + " to: " + carRentTo.toString());
        return true;
    }
}
