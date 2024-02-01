package org.example.birds;

public class Owl implements Bird {
    @Override
    public String name() {
        return "Owl";
    }

    @Override
    public boolean isDangerous() {
        return true;
    }

    @Override
    public int size() {
        return 30;
    }
}