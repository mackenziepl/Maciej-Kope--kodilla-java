package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {

    public static void main(String[] args) {

        LoadOrder loadOrder = new LoadOrder();
        Producent producent = loadOrder.load("Mars", 20);
        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRespository());
        orderFoodProcess.run(producent);
    }
}
