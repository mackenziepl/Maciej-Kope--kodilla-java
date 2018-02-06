package com.kodilla.good.patterns.challenges.AirLine;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
            ListOfFight listOfFight = new ListOfFight();
            Map<Integer, AirPort> lista = listOfFight.getThelist();

           Search search1 = new Search();
           search1.searchFrom(lista, "Poznan");
           System.out.println();
           Search search2 = new Search();
           search2.searchTo(lista, "Gdansk");
           System.out.println();
           Search search3 = new Search();
           search3.searchThrough(lista, "Warszawa");

    }
}
