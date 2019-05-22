package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<DirectFlight> listOfDirectFlights = new ArrayList<>();
    private List<ConnectingFlight> listOfConnectingFlights = new ArrayList<>();

    public FlightList() {
        listOfDirectFlights.add(new DirectFlight("Bydgoszcz", "Gdańsk"));
        listOfDirectFlights.add(new DirectFlight("Warszawa", "Szczecin"));
        listOfDirectFlights.add(new DirectFlight("Bydgoszcz", "Katowice"));
        listOfDirectFlights.add(new DirectFlight("Katowice", "Gdańsk"));
        listOfDirectFlights.add(new DirectFlight("Bydgoszcz", "Warszawa"));
        listOfDirectFlights.add(new DirectFlight("Gdańsk", "Zielona Góra"));
        listOfDirectFlights.add(new DirectFlight("Katowice", "Łódź"));
        listOfDirectFlights.add(new DirectFlight("Szczecin", "Warszawa"));
        listOfDirectFlights.add(new DirectFlight("Szczecin", "Poznań"));

        listOfConnectingFlights.add(new ConnectingFlight("Gdańsk", "Warszawa", "Katowice"));
        listOfConnectingFlights.add(new ConnectingFlight("Katowice", "Poznać", "Szczecin"));
        listOfConnectingFlights.add(new ConnectingFlight("Kraków", "Rzeszów", "Gdańsk"));
        listOfConnectingFlights.add(new ConnectingFlight("Łódź", "Warszawa", "Kraków"));
        listOfConnectingFlights.add(new ConnectingFlight("Szczecin", "Modlin", "Katowice"));
    }

    public List<DirectFlight> getListOfDirectFlights() {
        return new ArrayList<>(listOfDirectFlights);
    }

    public List<ConnectingFlight> getListOfConnectingFlights() {
        return new ArrayList<>(listOfConnectingFlights);
    }
}
