package com.kodilla.good.patterns.challenges.Food2Door;

public class LoadOrder {

    public Firm load() {

        String nameFirm = "ExtraFoodShop";
        String product = "Mars";
        double quantity = 2;

        return new ExtraFoodShop(nameFirm, product, quantity);
    }
}
