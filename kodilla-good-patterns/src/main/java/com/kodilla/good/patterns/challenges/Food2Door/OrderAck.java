package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderAck {
    private boolean confirmed;

    public OrderAck(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    @Override
    public String toString() {
        return "OrderAck{" +
                "confirmed=" + confirmed +
                '}';
    }
}
