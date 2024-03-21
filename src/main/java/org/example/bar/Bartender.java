package org.example.bar;

public class Bartender implements Bar {
    @Override
    public void takeAnOrder() {
        System.out.println("Bartender has taken an order");
    }

    @Override
    public void createDrink() {
        System.out.println("Bartender has created a drink");
    }

    @Override
    public void takePayment() {
        System.out.println("Bartender has taken a payment");
    }
}
