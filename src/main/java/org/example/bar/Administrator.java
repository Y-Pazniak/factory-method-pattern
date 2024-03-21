package org.example.bar;

public class Administrator implements Bar {
    @Override
    public void takeAnOrder() {
        System.out.println("Administrator is controlling an order");
    }

    @Override
    public void createDrink() {
        System.out.println("Administrator is controlling a drink creation");
    }

    @Override
    public void takePayment() {
        System.out.println("Administrator is controlling a payment receiving");
    }
}
