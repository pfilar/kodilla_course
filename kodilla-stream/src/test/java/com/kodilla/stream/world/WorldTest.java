package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTest {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.getCountries().add(new Country("Poland", new BigDecimal("38000000")));
        europe.getCountries().add(new Country("Germany", new BigDecimal("47000000")));

        Continent asia = new Continent("Asia");
        europe.getCountries().add(new Country("Japane", new BigDecimal("50000000")));
        europe.getCountries().add(new Country("Korea", new BigDecimal("60000000")));

        World world = new World();
        world.getContinents().add(europe);
        world.getContinents().add(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("195000000"), result);
    }
}