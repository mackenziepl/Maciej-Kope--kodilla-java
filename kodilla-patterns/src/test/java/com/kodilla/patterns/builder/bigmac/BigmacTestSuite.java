package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigmacBuilder()
                        .roll("with sesame")
                        .burgers(1)
                        .sauce("barbecue")
                        .ingredient("onion")
                        .ingredient("cheese")
                        .ingredient("tomato")
                        .ingredient("cucumber")
                        .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        int howManyBurgers = bigMac.getBurgers();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(1, howManyBurgers);
    }
}
