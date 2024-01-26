package org.example.cage;

import org.example.feeder.GrassFeeder;
import org.example.feeder.ZooFeederBehavior;

public class GiraffesCage extends ZooCage {
    @Override
    public ZooFeederBehavior askForFeeder() {
        return new GrassFeeder();
    }
}
