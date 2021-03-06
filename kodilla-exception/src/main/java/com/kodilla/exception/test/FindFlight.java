package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlight {
    private HashMap<String, Boolean> canIFlyTo;

    FindFlight() {
        canIFlyTo = new HashMap<>();
        canIFlyTo.put("Airport", true);
        canIFlyTo.put("No Airport", false);
    }

    void findFlight(Flight flight) throws RouteNotFoundException {

        if ( ! canIFlyTo.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Destination airport not found!");
        } else {
            System.out.println("Destination for flight: " + flight + " found.");
        }
    }
}
