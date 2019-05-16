package com.kodilla.good.patterns.challenges.airline;

import java.util.Objects;

public class DirectFlights {
    public String departureAirportDF;
    public String arrivalAirportDF;

    public DirectFlights(String departureAirportDF, String arrivalAirportDF) {
        this.departureAirportDF = departureAirportDF;
        this.arrivalAirportDF = arrivalAirportDF;
    }

    public String getDepartureAirportDF() {
        return departureAirportDF;
    }

    public String getArrivalAirportDF() {
        return arrivalAirportDF;
    }

    @Override
    public String toString() {
        return departureAirportDF + " -> " + arrivalAirportDF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DirectFlights)) return false;
        DirectFlights flight = (DirectFlights) o;
        return Objects.equals(getDepartureAirportDF(), flight.getDepartureAirportDF()) &&
                Objects.equals(getArrivalAirportDF(), flight.getArrivalAirportDF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirportDF(), getArrivalAirportDF());
    }
}
