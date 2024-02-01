package org.example.spaces;

import org.example.animals.Animal;
import org.example.animals.Tiger;
import org.example.birds.Bird;
import org.example.birds.Owl;
import org.example.reptiles.Cobra;
import org.example.reptiles.Reptile;

public class ZooFactory implements CreaturesFactory {
    @Override
    public Animal animal() {
        return new Tiger();
    }

    @Override
    public Bird bird() {
        return new Owl();
    }

    @Override
    public Reptile reptile() {
        return new Cobra();
    }
}