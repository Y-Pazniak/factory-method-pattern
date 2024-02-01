package org.example.reptiles;

public class Turtle implements Reptile {
    @Override
    public String name() {
        return "Turtle";
    }

    @Override
    public boolean isDangerous() {
        return false;
    }

    @Override
    public int size() {
        return 5;
    }
}