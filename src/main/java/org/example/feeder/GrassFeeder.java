package org.example.feeder;

public class GrassFeeder implements ZooFeederBehavior{
    @Override
    public String clean() {
        return "Relaxing cleaning";
    }

    @Override
    public String feed() {
        return "Feeding by grass";
    }
}
