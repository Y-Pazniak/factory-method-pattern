package org.example.birds;

public class Carrot implements Bird {
    @Override
    public String name() {
        return "Carrot";
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