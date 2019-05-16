package com.kodilla.good.patterns.challenges.airline;

public class Application {
    public static void main(String[] args) {
        FlightSerwis flightSerwis = new FlightSerwis();

        System.out.println("Find departure airport for direct flight");
        flightSerwis.findDepartureAirport("Warszawa");
        System.out.println();
        System.out.println("Find arrival airport for direct flight");
        flightSerwis.findArrivalAirport("Gdańsk");
        System.out.println();
        System.out.println("Find stopover airport for connecting flight");
        flightSerwis.findStopoverAirport("Warszawa");
    }
}
