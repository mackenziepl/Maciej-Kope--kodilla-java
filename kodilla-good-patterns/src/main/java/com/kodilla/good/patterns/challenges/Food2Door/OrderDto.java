package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {

    private Firm firm;
    private boolean isOrder;

    public OrderDto(final Firm firm, final boolean isOrder) {
        this.firm = firm;
        this.isOrder = isOrder;
    }

    public Producent getFirm() {
        return firm;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
