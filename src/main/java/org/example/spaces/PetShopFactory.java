package org.example.spaces;

import org.example.animals.Animals;
import org.example.animals.DomesticCat;
import org.example.birds.Birds;
import org.example.birds.Carrot;
import org.example.reptiles.Reptiles;
import org.example.reptiles.Turtle;

public class PetShopFactory implements CreaturesFactory {
    @Override
    public Animals animal() {
        return new DomesticCat();
    }

    @Override
    public Birds bird() {
        return new Carrot();
    }

    @Override
    public Reptiles reptile() {
        return new Turtle();
    }
}
