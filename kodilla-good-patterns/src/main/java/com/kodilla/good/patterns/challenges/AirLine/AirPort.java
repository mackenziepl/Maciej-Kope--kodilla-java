package com.kodilla.good.patterns.challenges.AirLine;

public class AirPort {
    private String nameAirPortFrom;
    private String nameAirPortOn;
    private String nameAirPortThrough;

    public AirPort(String nameAirPortFrom, String nameAirPortOn, String nameAirPortThrough) {
        this.nameAirPortFrom = nameAirPortFrom;
        this.nameAirPortOn = nameAirPortOn;
        this.nameAirPortThrough = nameAirPortThrough;
    }

    public String getNameAirPortFrom() {
        return nameAirPortFrom;
    }

    public String getNameAirPortOn() {
        return nameAirPortOn;
    }

    public String getNameAirPortThrough() {
        return nameAirPortThrough;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirPort airPort = (AirPort) o;

        if (nameAirPortFrom != null ? !nameAirPortFrom.equals(airPort.nameAirPortFrom) : airPort.nameAirPortFrom != null)
            return false;
        if (nameAirPortOn != null ? !nameAirPortOn.equals(airPort.nameAirPortOn) : airPort.nameAirPortOn != null)
            return false;
        return nameAirPortThrough != null ? nameAirPortThrough.equals(airPort.nameAirPortThrough) : airPort.nameAirPortThrough == null;
    }

    @Override
    public int hashCode() {
        int result = nameAirPortFrom != null ? nameAirPortFrom.hashCode() : 0;
        result = 31 * result + (nameAirPortOn != null ? nameAirPortOn.hashCode() : 0);
        result = 31 * result + (nameAirPortThrough != null ? nameAirPortThrough.hashCode() : 0);
        return result;
    }
}
