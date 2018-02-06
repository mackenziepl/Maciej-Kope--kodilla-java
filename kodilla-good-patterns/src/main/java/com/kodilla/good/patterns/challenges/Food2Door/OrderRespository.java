package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRespository {

    public boolean createOrder(String nameFirm, String product, double quantity) {
        System.out.println("Producent: " + nameFirm + ", order: " + product + ", getQuantity: " + quantity);
        return true;
    }
}
