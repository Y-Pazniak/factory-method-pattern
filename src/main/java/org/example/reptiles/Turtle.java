package org.example.reptiles;

public class Turtle implements Reptiles{
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
