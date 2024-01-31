package org.example.animals;

public class Tiger implements Animals{
    @Override
    public String name() {
        return "Tiger";
    }

    @Override
    public boolean isDangerous() {
        return true;
    }

    @Override
    public int size() {
        return 100;
    }
}
