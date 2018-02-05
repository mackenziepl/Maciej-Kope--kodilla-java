package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {

    public static void main(String[] args) {

        LoadOrder loadOrder = new LoadOrder();
        Firm firm = loadOrder.load();
        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRespository());
        orderFoodProcess.run(firm);
    }
}
