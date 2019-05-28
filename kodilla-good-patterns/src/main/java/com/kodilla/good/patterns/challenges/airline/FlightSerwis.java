package com.kodilla.good.patterns.challenges.airline;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSerwis {
    FlightList flightList = new FlightList();

    public List<DirectFlight> findDepartureAirport(String departureAirportDF) {
        List<DirectFlight> resultOfSearchDepartureAirport = flightList.getListOfDirectFlights().stream()
                .filter(n -> n.getDepartureAirportDF().equals(departureAirportDF))
                .collect(Collectors.toList());

        resultOfSearchDepartureAirport.stream()
                .forEach(System.out::println);

        if (resultOfSearchDepartureAirport.isEmpty()) {
            System.out.println("Unfortunately we don't have following flight in our schedule.");
        }

        return resultOfSearchDepartureAirport;
    }

    public List<DirectFlight> findArrivalAirport(String arrivalAirportDT) {
        List<DirectFlight> resultOfSearchArrivalAirport = flightList.getListOfDirectFlights().stream()
                .filter(n -> n.getArrivalAirportDF().equals(arrivalAirportDT))
                .collect(Collectors.toList());

        resultOfSearchArrivalAirport.stream()
                .forEach(System.out::println);

        if (resultOfSearchArrivalAirport.isEmpty()) {
            System.out.println("Unfortunately we don't have following flight in our schedule.");
        }

        return resultOfSearchArrivalAirport;
    }

    public List<ConnectingFlight> findStopoverAirport(String stopoverAirport) {
        List<ConnectingFlight> resultOfSearchStopoverAirport = flightList.getListOfConnectingFlights().stream()
                .filter(n -> n.getStopoverAirportCF().equals(stopoverAirport))
                .collect(Collectors.toList());

        resultOfSearchStopoverAirport.stream()
                .forEach(System.out::println);

        if (resultOfSearchStopoverAirport.isEmpty()) {
            System.out.println("Unfortunately we don't have following flight in our schedule.");
        }

        return resultOfSearchStopoverAirport;
    }
}
