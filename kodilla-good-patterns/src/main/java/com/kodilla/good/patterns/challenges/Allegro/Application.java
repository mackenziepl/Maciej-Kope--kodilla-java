package com.kodilla.good.patterns.challenges.Allegro;

public class Application {

    public static void main(String[] args) {
        BuyNowRetriever buyNowRetriever = new BuyNowRetriever();
        BuyNow buyNow = buyNowRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new ProductOrderService(),
                new OrderRepository());
        orderProcessor.process(buyNow);

    }
}
