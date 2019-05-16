package com.kodilla.good.patterns.challenges.airline;

import java.util.Objects;

public class ConnectingFlights {
    public String departureAirportCF;
    public String stopoverAirportCF;
    public String arrivalAirportCF;

    public ConnectingFlights(String departureAirportCF, String stopoverAirportCF, String arrivalAirportCF) {
        this.departureAirportCF = departureAirportCF;
        this.stopoverAirportCF = stopoverAirportCF;
        this.arrivalAirportCF = arrivalAirportCF;
    }

    public String getDepartureAirportCF() {
        return departureAirportCF;
    }

    public String getStopoverAirportCF() {
        return stopoverAirportCF;
    }

    public String getArrivalAirportCF() {
        return arrivalAirportCF;
    }

    @Override
    public String toString() {
        return departureAirportCF + " -> " + stopoverAirportCF + " -> " + arrivalAirportCF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DirectFlights)) return false;
        ConnectingFlights flight = (ConnectingFlights) o;
        return Objects.equals(getDepartureAirportCF(), flight.getDepartureAirportCF()) &&
                Objects.equals(getArrivalAirportCF(), flight.getArrivalAirportCF()) &&
                Objects.equals(getStopoverAirportCF(), flight.getStopoverAirportCF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirportCF(), getStopoverAirportCF(), getArrivalAirportCF());
    }
}


