package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents
                .stream()
                .flatMap(c -> c.getCountries().stream())
                .map(c -> c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, delta) -> sum.add(delta));
    }
}
