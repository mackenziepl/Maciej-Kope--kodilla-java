package com.kodilla.good.patterns.challenges.Food2Door;

class ExtraFoodShop extends Firm {

    public ExtraFoodShop(String nameFirm, String product, double quantity) {
        super(nameFirm, product, quantity);
    }

    public boolean process(String nameFirm, String product, double quantity) {
        System.out.println("Producent: " + getNameFirm() + ", order: " + getProduct() + ", quantity: " + getQuantity());
        return true;
    }
}
