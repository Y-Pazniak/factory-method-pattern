package org.example.feeder;

public class PredatorFeeder implements ZooFeederBehavior{
    @Override
    public String clean() {
        return "Dangerous cleaning";
    }

    @Override
    public String feed() {
        return "Feeding by meat";
    }
}
