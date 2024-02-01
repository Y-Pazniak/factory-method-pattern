package org.example.animals;

public class DomesticCat implements Animal {
    @Override
    public String name() {
        return "DomesticCat";
    }

    @Override
    public boolean isDangerous() {
        return false;
    }

    @Override
    public int size() {
        return 10;
    }
}