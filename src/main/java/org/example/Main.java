package org.example;

import org.example.cats.Cat;
import org.example.cats.OrdinaryCat;
import org.example.cats.PurebredCat;

public class Main {
    public static void main(String[] args) {
        Cat scrappyCat = new OrdinaryCat("Scrappy");
        Cat sirJasperCat = new PurebredCat("Sir Jasper The Third");

        Cat noodleCat = scrappyCat.clone();
        Cat marblesCat = sirJasperCat.clone();

        noodleCat.setName("Noodle");
        marblesCat.setName("Her Majesty Marbles");

        System.out.println(noodleCat.getName());
        System.out.println(marblesCat.getName());
    }
}