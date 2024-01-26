package org.example.cage;

import org.example.feeder.PredatorFeeder;
import org.example.feeder.ZooFeederBehavior;

public class WolfsCage extends ZooCage {
    @Override
    public ZooFeederBehavior askForFeeder() {
        return new PredatorFeeder();
    }
}
