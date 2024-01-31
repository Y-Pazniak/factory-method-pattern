package org.example;

import org.example.animals.Animals;
import org.example.birds.Birds;
import org.example.reptiles.Reptiles;
import org.example.spaces.CreaturesFactory;

public class Application {
    private final Animals animal;
    private final Birds bird;
    private final Reptiles reptile;

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
