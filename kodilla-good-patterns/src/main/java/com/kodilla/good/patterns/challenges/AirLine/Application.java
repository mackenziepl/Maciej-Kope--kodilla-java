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

           /*Loty powinny być dodawane w formacie (lotnisko startowe, lotnisko docelowe). Klucz jest zbędny,
            możesz się go pozbyć stosując Set zamiast Map.

            Po zmianie implementacji z Map na Set zmieni się także implementacja metod. Metoda wyszukujące loty
            z przesiadką powinna działać tak, że dostaje informacje z skąd (A) i dokąd (C) ma się odbyć podróż.
            W pierwszym kroku szukane są loty z miasta A. Następnie zostaną zwrócone loty z kilku różnych miast B, D, E.
            W kolejnym kroku powinny być wyszukane takie loty z miast B, D, E, gdzie lotnisko docelowe równa się C*/

    }
}
