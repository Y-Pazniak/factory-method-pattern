package org.example.cats;

public class PurebredCat implements Cat{
    private String name;

    public PurebredCat(String name) {
        this.name = name;
    }

    @Override
    public Cat clone() {
        return new PurebredCat(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
