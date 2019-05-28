package com.kodilla.good.patterns.challenges.CarRental;

public class MailService implements InformationService {

    @Override
    public void inform(UserOfRental userOfRental) {
        System.out.println("Thank You " + userOfRental.getUserName() + " " + userOfRental.getUserSurname() + " for your order");
    }
}
