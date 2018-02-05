package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderFoodProcess {
        private OrderRespository orderRespository;

    public OrderFoodProcess(OrderRespository orderRespository) {
        this.orderRespository = orderRespository;
    }

    public OrderDto run(Producent producent){
        boolean isOrder = producent.process();

        if (isOrder) {
            orderRespository.createOrder(producent.getClass().getSimpleName(), producent.getProduct(), producent.getQuantity());
            return new OrderDto(producent.getProduct(), producent.getQuantity(), true);
        } else {
            return new OrderDto(producent.getProduct(), producent.getQuantity(), false);
        }
    }

}
