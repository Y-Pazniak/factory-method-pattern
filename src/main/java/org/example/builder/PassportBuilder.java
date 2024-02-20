package org.example.builder;

import org.example.animal.AnimalPassport;
import org.example.animal.AnimalType;
import org.example.components.Body;
import org.example.components.Fur;
import org.example.components.Size;
import org.example.components.Tail;

public class PassportBuilder implements Builder {
    private AnimalType animalType;
    private String origin;
    private Body body;
    private Fur fur;
    private Size size;
    private Tail tail;

    @Override
    public void setAnimalType(final AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public void setBody(final Body body) {
        this.body = body;
    }

    @Override
    public void setFur(final Fur fur) {
        this.fur = fur;
    }

    @Override
    public void setSize(final Size size) {
        this.size = size;
    }

    @Override
    public void setTail(final Tail tail) {
        this.tail = tail;
    }

    @Override
    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public AnimalPassport getResult() {
        return new AnimalPassport(animalType, body, fur, size, tail, origin);
    }
}
