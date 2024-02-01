package org.example.spaces;

import org.example.animals.Animal;
import org.example.birds.Bird;
import org.example.reptiles.Reptile;

public interface CreaturesFactory {
    Animal animal();

    Bird bird();

    Reptile reptile();
}