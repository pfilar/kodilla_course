package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<DirectFlight> listOfDirectFlights = new ArrayList<>();
    private List<ConnectingFlight> listOfConnectingFlights = new ArrayList<>();

    public FlightList() {
        listOfDirectFlights.add(new DirectFlight("Bydgoszcz", "Gdansk"));
        listOfDirectFlights.add(new DirectFlight("Warszawa", "Szczecin"));
        listOfDirectFlights.add(new DirectFlight("Bydgoszcz", "Katowice"));
        listOfDirectFlights.add(new DirectFlight("Katowice", "Gdansk"));
        listOfDirectFlights.add(new DirectFlight("Bydgoszcz", "Warszawa"));
        listOfDirectFlights.add(new DirectFlight("Gdansk", "Zielona Gora"));
        listOfDirectFlights.add(new DirectFlight("Katowice", "Lodz"));
        listOfDirectFlights.add(new DirectFlight("Szczecin", "Warszawa"));
        listOfDirectFlights.add(new DirectFlight("Szczecin", "Poznan"));

        listOfConnectingFlights.add(new ConnectingFlight("Gdansk", "Warszawa", "Katowice"));
        listOfConnectingFlights.add(new ConnectingFlight("Katowice", "Poznan", "Szczecin"));
        listOfConnectingFlights.add(new ConnectingFlight("Krakow", "Rzeszow", "Gdansk"));
        listOfConnectingFlights.add(new ConnectingFlight("Lodz", "Warszawa", "Krakow"));
        listOfConnectingFlights.add(new ConnectingFlight("Szczecin", "Modlin", "Katowice"));
    }

    public List<DirectFlight> getListOfDirectFlights() {
        return new ArrayList<>(listOfDirectFlights);
    }

    public List<ConnectingFlight> getListOfConnectingFlights() {
        return new ArrayList<>(listOfConnectingFlights);
    }
}
