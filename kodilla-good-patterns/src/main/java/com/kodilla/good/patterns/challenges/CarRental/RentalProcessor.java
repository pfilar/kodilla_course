package com.kodilla.good.patterns.challenges.CarRental;

import java.time.LocalDateTime;

public class RentalProcessor {          //  przeprocesowanie logiki związanej z wynajmem samochodów
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService, final RentalService rentalService, final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {           // final UserOfRental userOfRental, final LocalDateTime carRentFrom, final LocalDateTime carRentTo
        boolean isRendet = rentalService.rent(rentRequest.getUserOfRental(), rentRequest.getCarRentFrom(), rentRequest.getCarRentTo());
        if (isRendet) {
            informationService.inform(rentRequest.getUserOfRental());
            rentalRepository.createRental(rentRequest.getUserOfRental(), rentRequest.getCarRentFrom(), rentRequest.getCarRentTo());
            return new RentalDto(rentRequest.getUserOfRental(), true);
        } else {
            return new RentalDto(rentRequest.getUserOfRental(), false);
        }
    }
}
