package org.example;

import org.example.spaces.CreaturesFactory;
import org.example.spaces.PetShopFactory;
import org.example.spaces.ZooFactory;

public class Main {
    private static final boolean needAnimalsForPetShop = false;

    public static void main(String[] args) {
        Application application = configureApplication();
        application.checkCreaturesNames();
        application.areCreaturesSafe();
    }

    private static Application configureApplication() {
        CreaturesFactory creaturesFactory;

        if (needAnimalsForPetShop) {
            creaturesFactory = new PetShopFactory();
        } else creaturesFactory = new ZooFactory();

        return new Application(creaturesFactory);
    }
}