package com.kodilla.good.patterns.challenges.AirLine;

import java.util.Map;

public class Search {

    public void searchTo(Map<Integer, AirPort> TheList, String nameAirPort) {

        TheList.values().stream()
                .filter(l-> l.getNameAirPortOn().equals(nameAirPort))
                .forEach(System.out::println);
    }

    public void searchFrom(Map<Integer, AirPort> TheList, String nameAirPort) {

        TheList.values().stream()
                .filter(l-> l.getNameAirPortFrom().equals(nameAirPort))
                .forEach(System.out::println);
    }

    public void searchThrough(Map<Integer, AirPort> TheList, String nameAirPort) {

        TheList.values().stream()
                .filter(l-> l.getNameAirPortThrough().equals(nameAirPort))
                .forEach(System.out::println);
    }

    /*public void searchFrom(Map<Integer, AirPort> TheList, String nameAirPort) {

        for(HashMap.Entry<Integer, AirPort> search : TheList.entrySet()) {
            if(search.getValue().getNameAirPortFrom() == nameAirPort) {
                System.out.println("Flight nr " + search.getKey() + " from: " + search.getValue().getNameAirPortFrom()
                        + " to: " + search.getValue().getNameAirPortOn() + " trough: " + search.getValue().getNameAirPortThrough());
            }
        }
    }*/
}
