package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderFoodProcess {
        private OrderRespository orderRespository;

    public OrderFoodProcess(OrderRespository orderRespository) {
        this.orderRespository = orderRespository;
    }

    public OrderDto run(Firm firm){
        boolean isOrder = firm.process(firm.getNameFirm(), firm.getProduct(), firm.getQuantity());

        if (isOrder) {
            orderRespository.createOrder(firm.getNameFirm(), firm.getProduct(), firm.getQuantity());
            return new OrderDto(firm, true);
        } else {
            return new OrderDto(firm, false);
        }
    }

}
