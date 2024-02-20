package org.example;

import org.example.animal.AnimalType;
import org.example.builder.Builder;
import org.example.components.Body;
import org.example.components.Fur;
import org.example.components.Size;
import org.example.components.Tail;

public class Director {
    public void constructCat(Builder builder) {
        builder.setAnimalType(AnimalType.DOMESTIC_CAT);
        builder.setBody(new Body(false, 5));
        builder.setFur(new Fur("red", true));
        builder.setOrigin("pet shelter");
        builder.setSize(Size.SMALL);
        builder.setTail(new Tail(30, true));
    }

    public void constructDog(Builder builder){
        builder.setAnimalType(AnimalType.DOMESTIC_DOG);
        builder.setBody(new Body(false, 20));
        builder.setFur(new Fur("black", true));
        builder.setOrigin("nursery");
        builder.setSize(Size.AVERAGE);
        builder.setTail(new Tail(0, false));
    }

    public void constructElephant(Builder builder){
        builder.setAnimalType(AnimalType.ELEPHANT);
        builder.setBody(new Body(true, 6000));
        builder.setFur(new Fur("", false));
        builder.setOrigin("Africa");
        builder.setSize(Size.BIG);
        builder.setTail(new Tail(1000, true));
    }
}
