package org.example.bar;

public class Accountant implements Bar {
    @Override
    public void takeAnOrder() {
        System.out.println("Accountant has recorded an order");
    }

    @Override
    public void createDrink() {
        System.out.println("Accountant has counted the cost of drink");
    }

    @Override
    public void takePayment() {
        System.out.println("Accountant has recorded income");
    }
}
