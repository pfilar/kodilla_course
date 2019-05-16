package com.kodilla.good.patterns.challenges.CarRental;

public class RentalDto {
    public UserOfRental userOfRental;
    public boolean isRented;

    public RentalDto(UserOfRental userOfRental, boolean isRented) {
        this.userOfRental = userOfRental;
        this.isRented = isRented;
    }

    public UserOfRental getUserOfRental() {
        return userOfRental;
    }

    public boolean isRented() {
        return isRented;
    }
}
