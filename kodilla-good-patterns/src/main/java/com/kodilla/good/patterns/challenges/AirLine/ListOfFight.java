package com.kodilla.good.patterns.challenges.AirLine;

import java.util.HashMap;
import java.util.Map;

public class ListOfFight {
    private Map<Integer, AirPort> Thelist = new HashMap<>();
    /*private String nameAirline;

    public ListOfFight(String nameAirline) {
        this.nameAirline = nameAirline;
    }

    //public boolean putT

    public String getNameAirline() {
        return nameAirline;
    }

    public Map<Integer, AirPort> getThelist() {
        return Thelist;
    }

    @Override
    public String toString() {
        return "ListOfFight{" +
                "Thelist=" + Thelist +
                ", nameAirline='" + nameAirline + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListOfFight that = (ListOfFight) o;

        if (Thelist != null ? !Thelist.equals(that.Thelist) : that.Thelist != null) return false;
        return nameAirline != null ? nameAirline.equals(that.nameAirline) : that.nameAirline == null;
    }

    @Override
    public int hashCode() {
        int result = Thelist != null ? Thelist.hashCode() : 0;
        result = 31 * result + (nameAirline != null ? nameAirline.hashCode() : 0);
        return result;
    }*/
}
