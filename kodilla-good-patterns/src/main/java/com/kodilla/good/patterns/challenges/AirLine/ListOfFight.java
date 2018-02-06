package com.kodilla.good.patterns.challenges.AirLine;

import java.util.HashMap;
import java.util.Map;

public class ListOfFight {
    private Map<Integer, AirPort> TheList = new HashMap<>();

    public ListOfFight() {
        TheList.put(1, new AirPort("Gdansk", "Poznan", "Koszalin"));
        TheList.put(2, new AirPort("Warszawa", "Poznan", "Gdansk"));
        TheList.put(3, new AirPort("Gdansk", "Wroclaw", "Krakow"));
        TheList.put(4, new AirPort("Poznan", "Gdansk", "Warszawa"));
        TheList.put(5, new AirPort("Wroclaw", "Poznan", "Gdansk"));
        TheList.put(6, new AirPort("Gdansk", "Warszawa", "Poznan"));
        TheList.put(7, new AirPort("Krakow", "Gdansk", "Lodz"));
    }

    public Map<Integer, AirPort> getThelist() {
        return new HashMap<> (TheList);
    }
}
