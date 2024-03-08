package org.example.cats;

public interface Cat {
    Cat clone();
    String getName();
    void setName(final String name);
}
