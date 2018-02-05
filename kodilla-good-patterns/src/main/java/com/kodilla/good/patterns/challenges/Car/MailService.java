package com.kodilla.good.patterns.challenges.Car;

public class MailService {
    public void inform(User user) {
        System.out.println("Renting Car for: " + user.getName() + user.getSurname());
    }
}
