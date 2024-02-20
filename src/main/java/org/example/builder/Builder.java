package org.example.builder;

import org.example.animal.AnimalType;
import org.example.components.*;

public interface Builder {
    void setAnimalType(AnimalType animalType);

    void setBody(Body body);

    void setFur(Fur fur);

    void setSize(Size size);

    void setTail(Tail tail);

    void setOrigin(String origin);
}
