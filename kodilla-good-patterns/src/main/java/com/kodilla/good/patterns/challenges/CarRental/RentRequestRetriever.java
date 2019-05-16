package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {
        UserOfRental userOfRental = new UserOfRental("Jan", "Nowak");

        LocalDateTime carRentFrom = LocalDateTime.of(2019, 5, 18, 10, 0);
        LocalDateTime carRentTo = LocalDateTime.of(2019, 5, 19, 18, 0);

        return new RentRequest(userOfRental, carRentFrom, carRentTo);
    }
}
