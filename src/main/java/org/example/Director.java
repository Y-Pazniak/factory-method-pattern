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
        builder.setBody(new Body(false, 5, true));
        builder.setFur(new Fur("red"));
        builder.setOrigin("pet shelter");
        builder.setSize(Size.SMALL);
        builder.setTail(new Tail(30));
    }

    public void constructDog(Builder builder){
        builder.setAnimalType(AnimalType.DOMESTIC_DOG);
        builder.setBody(new Body(false, 20, false));
        builder.setFur(new Fur("black"));
        builder.setOrigin("nursery");
        builder.setSize(Size.AVERAGE);
        builder.setTail(new Tail(0));
    }

    public void constructElephant(Builder builder){
        builder.setAnimalType(AnimalType.ELEPHANT);
        builder.setBody(new Body(true, 6000, false));
        builder.setFur(new Fur(""));
        builder.setOrigin("Africa");
        builder.setSize(Size.BIG);
        builder.setTail(new Tail(1000));
    }
}
