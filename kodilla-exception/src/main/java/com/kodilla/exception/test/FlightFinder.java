package com.kodilla.exception.test;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warszawa", true);
        flightMap.put("Londyn", true);
        flightMap.put("Berlin", false);

        String result = flight.getArrivalAirport();
        Boolean flightMapResult = flightMap.get(result);
        if (flightMapResult == null) {
            throw new RouteNotFoundException();
        } else {
            System.out.println("flight was found");
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("Warszawa", "Paryż");
        //Flight flight2 = new Flight("Berlin", "Londyn");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFilght(flight1);

        } catch (RouteNotFoundException e) {
            System.out.println(e);//  e.printStackTrace();
        }

//        try {
//            flightFinder.findFilght(flight2);
//        } catch (RouteNotFoundException e) {
//            System.out.println(e);// e.printStackTrace();
//        }
    }
}