package org.example;

import org.example.bar.Accountant;
import org.example.bar.Administrator;
import org.example.bar.Bartender;

public class BarFacade {
    private final Bartender bartender;
    private final Administrator administrator;
    private final Accountant accountant;

    public BarFacade() {
        bartender = new Bartender();
        administrator = new Administrator();
        accountant = new Accountant();
    }

    public void serveClient() {
        bartender.takeAnOrder();
        administrator.takeAnOrder();
        accountant.takeAnOrder();

        administrator.createDrink();
        bartender.createDrink();
        accountant.createDrink();

        administrator.takePayment();
        bartender.takePayment();
        accountant.takePayment();
    }
}
