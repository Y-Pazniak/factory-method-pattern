package org.example.cats;

public class OrdinaryCat implements Cat{
    private String name;

    public OrdinaryCat(String name) {
        this.name = name;
    }

    @Override
    public Cat clone() {
        return new OrdinaryCat(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }
}
