package org.example;

import org.example.spaces.CreaturesFactory;
import org.example.spaces.PetShopFactory;
import org.example.spaces.ZooFactory;

public class Main {
    public static void main(String[] args) {
        Application application = configureApplication(args[0]);
        application.checkCreaturesNames();
        application.areCreaturesSafe();
    }

    private static Application configureApplication(final String animalDangerDescription) {
        return new Application(getProperFactory(animalDangerDescription));
    }

    private static CreaturesFactory getProperFactory(final String animalDangerDescription) {
        return animalDangerDescription.equals("dangerous") ? new ZooFactory() : new PetShopFactory();
    }
}