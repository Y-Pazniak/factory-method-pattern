package org.example.cage;

import org.example.feeder.ZooFeederBehavior;

public abstract class ZooCage {
    public void feedersWork(){
        ZooFeederBehavior feeder = askForFeeder();
        feeder.clean();
        feeder.feed();
    }

    public abstract ZooFeederBehavior askForFeeder();
}
