package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent continentEurope = new Continent("Europe");
        Continent continentNorthAmerica = new Continent("Noth America");
        Continent continentSouthAmerica = new Continent("South America");
        world.addContinents(continentEurope);
        world.addContinents(continentNorthAmerica);
        world.addContinents(continentSouthAmerica);

        BigDecimal peoplePoland = new BigDecimal("36123546852");
        BigDecimal peopleEngland = new BigDecimal("65154856457");
        BigDecimal peopleGermany = new BigDecimal("60150826050");
        BigDecimal peopleFrance = new BigDecimal("55155856451");
        Country countryPoland = new Country("Poland", peoplePoland);
        Country countryEngland = new Country("England", peopleEngland);
        Country countryGermany = new Country("Germany", peopleGermany);
        Country countryFrance = new Country("France", peopleFrance);

        BigDecimal peopleUsa = new BigDecimal("444254789654");
        BigDecimal peopleCanada = new BigDecimal("125748652324");
        BigDecimal peopleMexico = new BigDecimal("333325784256");
        Country countryUsa = new Country("USA", peopleUsa);
        Country countryCanada = new Country("Canada", peopleCanada);
        Country countryMexico = new Country("Mexico", peopleMexico);

        BigDecimal peopleBrasil = new BigDecimal("85123578999");
        BigDecimal peopleArgentina = new BigDecimal("45456852357");
        BigDecimal peopleChile = new BigDecimal("26123654789");
        Country countryBrasil = new Country("Brasil",peopleBrasil);
        Country countryArgentina = new Country("Argentina", peopleArgentina);
        Country countryChile = new Country("Chile", peopleChile);

        continentEurope.addCountry(countryPoland);
        continentEurope.addCountry(countryEngland);
        continentEurope.addCountry(countryGermany);
        continentEurope.addCountry(countryFrance);
        continentNorthAmerica.addCountry(countryUsa);
        continentNorthAmerica.addCountry(countryCanada);
        continentNorthAmerica.addCountry(countryMexico);
        continentSouthAmerica.addCountry(countryBrasil);
        continentSouthAmerica.addCountry(countryArgentina);
        continentSouthAmerica.addCountry(countryChile);

        //When
        BigDecimal quantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("1276618398189"), quantity);
    }
}
