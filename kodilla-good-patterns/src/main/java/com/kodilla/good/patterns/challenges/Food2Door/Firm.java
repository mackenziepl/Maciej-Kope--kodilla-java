package com.kodilla.good.patterns.challenges.Food2Door;

public class Firm implements Producent {

    private String nameFirm;
    private String product;
    private double quantity;

    public Firm(String nameFirm, String product, double quantity) {
        this.nameFirm = nameFirm;
        this.product = product;
        this.quantity = quantity;
    }

    public String getNameFirm() {
        return nameFirm;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean process(String nameFirm, String product, double quantity) {
        return true;
    }
}
