package com.kodilla.good.patterns.challenges.Car;

import java.time.LocalDateTime;

public class CarRentalRepository {

    public boolean createRental(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Car for: " + user.getName() + user.getSurname()
                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());
        return true;
    }
}
