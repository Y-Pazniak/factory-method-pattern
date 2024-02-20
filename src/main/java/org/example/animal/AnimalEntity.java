package org.example.animal;

import org.example.components.*;

public class AnimalEntity {
    private final AnimalType animalType;
    private final Body body;
    private final Fur fur;
    private final Size size;
    private final Tail tail;
    private final String origin;
    private boolean isHungry;

    public AnimalEntity(AnimalType animalType, Body body, Fur fur, Size size, Tail tail, String origin) {
        this.animalType = animalType;
        this.body = body;
        this.fur = fur;
        this.size = size;
        this.tail = tail;
        this.origin = origin;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public Body getBody() {
        return body;
    }

    public Fur getFur() {
        return fur;
    }

    public Size getSize() {
        return size;
    }

    public Tail getTail() {
        return tail;
    }

    public String getOrigin() {
        return origin;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void feed() {
        isHungry = false;
    }
}
