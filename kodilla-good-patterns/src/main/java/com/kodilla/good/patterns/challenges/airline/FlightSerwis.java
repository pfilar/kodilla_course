package com.kodilla.good.patterns.challenges.airline;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSerwis {
    FlightList flightList = new FlightList();
    
    public List<DirectFlights> findDepartureAirport(String departureAirportDF) {
        List<DirectFlights> resultOfSearchDepartureAirport = flightList.getListOfDirectFlights().stream()
                .filter(n -> n.getDepartureAirportDF().equals(departureAirportDF))
                .collect(Collectors.toList());

        resultOfSearchDepartureAirport.stream()
                .forEach(System.out::println);

        if(resultOfSearchDepartureAirport.isEmpty()) {
            System.out.println("Unfortunately we don't have following flight in our schedule.");
        }

        return resultOfSearchDepartureAirport;
    }
    
    public List<DirectFlights> findArrivalAirport (String arrivalAirportDT) {
        List<DirectFlights> resultOfSearchArrivalAirport = flightList.getListOfDirectFlights().stream()
                .filter(n -> n.getArrivalAirportDF().equals(arrivalAirportDT))
                .collect(Collectors.toList());

        resultOfSearchArrivalAirport.stream()
                .forEach(System.out::println);

        if(resultOfSearchArrivalAirport.isEmpty()) {
            System.out.println("Unfortunately we don't have following flight in our schedule.");
        }

        return resultOfSearchArrivalAirport;
    }

    public List<ConnectingFlights> findStopoverAirport (String stopoverAirport) {
        List<ConnectingFlights> resultOfSearchStopoverAirport = flightList.getListOfConnectingFlights().stream()
                .filter(n -> n.getStopoverAirportCF().equals(stopoverAirport))
                .collect(Collectors.toList());

        resultOfSearchStopoverAirport.stream()
                .forEach(System.out::println);

        if(resultOfSearchStopoverAirport.isEmpty()) {
            System.out.println("Unfortunately we don't have following flight in our schedule.");
        }

        return resultOfSearchStopoverAirport;
    }







}
