package com.kodilla.good.patterns.challenges.AirLine;

import java.util.HashMap;
import java.util.Map;

public class Application /*throws Exeption*/ {
    public static void main(String[] args) {
        AirPort airPort1 = new AirPort("Gdansk", "Poznan", "");
        AirPort airPort2 = new AirPort("Warszawa", "Poznan", "Gdansk");
        AirPort airPort3 = new AirPort("Krakow", "Gdansk", "");
        AirPort airPort4 = new AirPort("Poznan", "Gdansk", "Warszawa");
        AirPort airPort5 = new AirPort("Wroclaw", "Poznan", "Gdansk");
        AirPort airPort6 = new AirPort("Gdansk", "Warszawa", "Poznan");
        AirPort airPort7 = new AirPort("Poznan", "Gdansk", "Lodz");

        //ListOfFight listOfFight = new ListOfFight("LOT");
        Map<Integer, AirPort> TheList = new HashMap<>();
        TheList.put(1, airPort1);
        TheList.put(2, airPort2);
        TheList.put(3, airPort3);
        TheList.put(4, airPort4);
        TheList.put(5, airPort5);
        TheList.put(6, airPort6);
        TheList.put(7, airPort7);


            for (HashMap.Entry<Integer, AirPort> search : TheList.entrySet()) {
                if(search.getValue().getNameAirPortFrom() == "Gdansk") {
                System.out.println("Flight nr " + search.getKey() + " from: " + search.getValue().getNameAirPortFrom()
                + " to: " + search.getValue().getNameAirPortOn() + " trough: " + search.getValue().getNameAirPortThrough());
                }
            }



    }


}
