package org.example.reptiles;

public class Cobra implements Reptile {
    @Override
    public String name() {
        return "Cobra";
    }

    @Override
    public boolean isDangerous() {
        return true;
    }

    @Override
    public int size() {
        return 10;
    }
}