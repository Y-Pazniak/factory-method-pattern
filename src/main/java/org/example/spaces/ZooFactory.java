package org.example.spaces;

import org.example.animals.Animals;
import org.example.animals.Tiger;
import org.example.birds.Birds;
import org.example.birds.Owl;
import org.example.reptiles.Cobra;
import org.example.reptiles.Reptiles;

public class ZooFactory implements CreaturesFactory {
    @Override
    public Animals animal() {
        return new Tiger();
    }

    @Override
    public Birds bird() {
        return new Owl();
    }

    @Override
    public Reptiles reptile() {
        return new Cobra();
    }
}
