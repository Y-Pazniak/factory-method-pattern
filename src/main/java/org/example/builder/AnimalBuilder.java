package org.example.builder;

import org.example.animal.AnimalEntity;
import org.example.animal.AnimalType;
import org.example.components.*;

import java.util.Objects;

public class AnimalBuilder implements Builder {
    private AnimalType animalType;
    private String origin;
    private Body body;
    private Fur fur;
    private Size size;
    private Tail tail;

    @Override
    public void setAnimalType(final AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public void setBody(final Body body) {
        this.body = Objects.isNull(body) ? ComponentsStorage.getInstance().getDefaultBody() : body;
    }

    @Override
    public void setFur(final Fur fur) {
        this.fur = Objects.isNull(fur) ? ComponentsStorage.getInstance().getDefaultFur() : fur;
    }

    @Override
    public void setSize(final Size size) {
        this.size = Objects.isNull(size) ? Size.AVERAGE : size;
    }

    @Override
    public void setTail(final Tail tail) {
        this.tail = Objects.isNull(tail) ? ComponentsStorage.getInstance().getDefaultTail() : tail;
    }

    @Override
    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public AnimalEntity getResult() {
        checkSize(animalType, size);
        checkAndExterminateFleas(body.isHasFleas());
        washFur(fur);
        petSmallAnimal(body);

        return new AnimalEntity(animalType, body, fur, size, tail, origin);
    }

    private void petSmallAnimal(final Body body) {
        if (!body.isDangerous() && size.equals(Size.SMALL)) {
            body.pet();
            System.out.println("Builder petted this small animal");
        }
    }

    private void washFur(Fur fur) {
        if (!fur.getColor().isEmpty()) {
            fur.cleanFur();
            System.out.println("Builder cleaned fur");
        }
    }

    private void checkAndExterminateFleas(final boolean hasFleas) {
        if (hasFleas) {
            body.setHasFleas(false);
            System.out.println("Builder exterminated fleas");
        }
    }

    private void checkSize(final AnimalType animalType, final Size size) {
        if (animalType.equals(AnimalType.ELEPHANT) || size.equals(Size.BIG)) {
            throw new IllegalArgumentException("Animal is too big for this builder");
        }
    }
}
