package com.kodilla.stream.world;

import java.util.LinkedList;
import java.util.List;

public final class Continent {

    private final List<Country> countries = new LinkedList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
