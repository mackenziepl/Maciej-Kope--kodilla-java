package com.kodilla.good.patterns.challenges.Allegro;

public class BuyNowRetriever {

    public BuyNow retrieve() {
        User user = new User("Jan", "Kowalski");
        String thing = "Soft toy";
        int price = 50;

        return new BuyNow(user, thing, price);
    }
}
