package org.example.animal;

import org.example.components.Body;
import org.example.components.Fur;
import org.example.components.Size;
import org.example.components.Tail;

import java.util.Objects;

public class AnimalPassport {
    private final AnimalType animalType;
    private final Body body;
    private final Fur fur;
    private final Size size;
    private final Tail tail;
    private final String origin;

    public AnimalPassport(AnimalType animalType, Body body, Fur fur, Size size, Tail tail, String origin) {
        this.animalType = animalType;
        this.body = body;
        this.fur = fur;
        this.size = size;
        this.tail = tail;
        this.origin = origin == null ? "homeless" : origin;
    }

    public String info() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type of animal: ").append(animalType).append("\n");
        stringBuilder.append("Is dangerous: ").append(body.isDangerous()).append("\n");
        stringBuilder.append("Weight: ").append(body.getWeight()).append("\n");

        if (!fur.getColor().isEmpty()) {
            stringBuilder.append("Fur color: ").append(fur.getColor()).append("\n");
        } else {
            stringBuilder.append("Bald").append("\n");
        }

        stringBuilder.append("Size: ").append(size).append("\n");

        if (!Objects.isNull(tail) && tail.getLength() > 0) {
            stringBuilder.append("Tail's length: ").append(tail.getLength()).append("\n");
        } else {
            stringBuilder.append("No tail").append("\n");
        }

        stringBuilder.append("Origin: ").append(origin);
        return stringBuilder.toString();
    }
}
