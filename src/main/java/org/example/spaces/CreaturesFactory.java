package org.example.spaces;

import org.example.animals.Animals;
import org.example.birds.Birds;
import org.example.reptiles.Reptiles;

public interface CreaturesFactory {
    Animals animal();

    Birds bird();

    Reptiles reptile();
}
