package com.kodilla.good.patterns.challenges.Car;

public class RentalDto {

    public User user;
    public boolean isRented;

    public RentalDto(final User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
