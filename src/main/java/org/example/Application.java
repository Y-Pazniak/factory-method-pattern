package org.example;

import org.example.animals.Animal;
import org.example.birds.Bird;
import org.example.reptiles.Reptile;
import org.example.spaces.CreaturesFactory;

public class Application {
    private final Animal animal;
    private final Bird bird;
    private final Reptile reptile;

    public Application(CreaturesFactory creaturesFactory) {
        animal = creaturesFactory.animal();
        bird = creaturesFactory.bird();
        reptile = creaturesFactory.reptile();
    }

    public void checkCreaturesNames() {
        System.out.println(animal.name());
        System.out.println(bird.name());
        System.out.println(reptile.name());
    }

    public void areCreaturesSafe() {
        System.out.println(animal.isDangerous());
        System.out.println(bird.isDangerous());
        System.out.println(reptile.isDangerous());
    }
}