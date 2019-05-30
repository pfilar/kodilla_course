package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunEnum.STANDARDBUN)
                .burgers(1)
                .ingredients(IngredientsEnum.LETTUCE)
                .ingredients(IngredientsEnum.ONION)
                .ingredients(IngredientsEnum.BACON)
                .ingredients(IngredientsEnum.CHEES)
                .sauce(SauceEnum.STANDARD)
                .buildBigmac();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String typeOfBun = bigmac.getBun();
        int quantityOfBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("standardbun", typeOfBun);
        Assert.assertEquals(1, quantityOfBurgers);


    }
}
