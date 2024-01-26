package org.example;

import org.example.cage.GiraffesCage;
import org.example.cage.WolfsCage;
import org.example.cage.ZooCage;

public class Main {
    private static ZooCage zooCage;

    public static void main(String[] args) {
        checkCage(TypeOfEnimal.PREDATOR);
        doFeedersWork();
    }

    private static void doFeedersWork() {
        System.out.println(zooCage.askForFeeder().feed());
        System.out.println(zooCage.askForFeeder().clean());

    }

    private static void checkCage(final TypeOfEnimal typeOfAnimal) {
        if (typeOfAnimal == TypeOfEnimal.GRASSFEEDING) {
            zooCage = new GiraffesCage();
        } else {
            if (typeOfAnimal == TypeOfEnimal.PREDATOR) {
                zooCage = new WolfsCage();
            }
        }
    }
}