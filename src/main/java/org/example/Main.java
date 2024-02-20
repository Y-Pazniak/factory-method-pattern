package org.example;

import org.example.animal.AnimalEntity;
import org.example.animal.AnimalPassport;
import org.example.builder.AnimalBuilder;
import org.example.builder.PassportBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        AnimalBuilder animalBuilder = new AnimalBuilder();
        director.constructCat(animalBuilder);

        AnimalEntity cat = animalBuilder.getResult();

        System.out.println(cat.getAnimalType());
        System.out.println(cat.getFur().getColor());

        PassportBuilder passportBuilder = new PassportBuilder();
        director.constructCat(passportBuilder);
        AnimalPassport animalPassport = passportBuilder.getResult();
        System.out.println(animalPassport.info());
    }
}