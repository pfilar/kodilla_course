package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDateTime;

public class ApplicationRental {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        //RentalProcessor rentalProcessor = new RentalProcessor(new InformationService, new RentalService, new RentalRepository);
        //rentalProcessor.process(rentRequest);  // userOfRental, carRentFrom, carRentTo
    }
}

