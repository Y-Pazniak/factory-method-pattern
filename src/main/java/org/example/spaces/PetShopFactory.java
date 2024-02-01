package org.example.spaces;

import org.example.animals.Animal;
import org.example.animals.DomesticCat;
import org.example.birds.Bird;
import org.example.birds.Carrot;
import org.example.reptiles.Reptile;
import org.example.reptiles.Turtle;

public class PetShopFactory implements CreaturesFactory {
    @Override
    public Animal animal() {
        return new DomesticCat();
    }

    @Override
    public Bird bird() {
        return new Carrot();
    }

    @Override
    public Reptile reptile() {
        return new Turtle();
    }
}