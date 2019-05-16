package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<DirectFlights> listOfDirectFlights = new ArrayList<>();
    private List<ConnectingFlights> listOfConnectingFlights = new ArrayList<>();

    public FlightList() {
        listOfDirectFlights.add(new DirectFlights("Bydgoszcz", "Gdańsk"));
        listOfDirectFlights.add(new DirectFlights("Warszawa", "Szczecin"));
        listOfDirectFlights.add(new DirectFlights("Bydgoszcz", "Katowice"));
        listOfDirectFlights.add(new DirectFlights("Katowice", "Gdańsk"));
        listOfDirectFlights.add(new DirectFlights("Bydgoszcz", "Warszawa"));
        listOfDirectFlights.add(new DirectFlights("Gdańsk", "Zielona Góra"));
        listOfDirectFlights.add(new DirectFlights("Katowice", "Łódź"));
        listOfDirectFlights.add(new DirectFlights("Szczecin", "Warszawa"));
        listOfDirectFlights.add(new DirectFlights("Szczecin", "Poznań"));

        listOfConnectingFlights.add(new ConnectingFlights("Gdańsk", "Warszawa", "Katowice"));
        listOfConnectingFlights.add(new ConnectingFlights("Katowice", "Poznać", "Szczecin"));
        listOfConnectingFlights.add(new ConnectingFlights("Kraków", "Rzeszów", "Gdańsk"));
        listOfConnectingFlights.add(new ConnectingFlights("Łódź", "Warszawa", "Kraków"));
        listOfConnectingFlights.add(new ConnectingFlights("Szczecin", "Modlin", "Katowice"));
    }

    public List<DirectFlights> getListOfDirectFlights() {
        return new ArrayList<>(listOfDirectFlights);
    }

    public List<ConnectingFlights> getListOfConnectingFlights() {
        return new ArrayList<>(listOfConnectingFlights);
    }
}
