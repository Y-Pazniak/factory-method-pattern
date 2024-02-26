package org.example.components;

public class Body {
    private final boolean isDangerous;
    private double weight;
    private boolean hasFleas;

    public Body(boolean isDangerous, double weight, boolean hasFleas) {
        this.isDangerous = isDangerous;
        this.weight = weight;
        this.hasFleas = hasFleas;
    }

    public void pet() {
        if (isDangerous) {
            System.out.println("It's dangerous to pet this animal");
        } else {
            System.out.println("You pet this animal safely");
        }
    }

    public boolean isHasFleas() {
        return hasFleas;
    }

    public void setHasFleas(final boolean hasFleas) {
        this.hasFleas = hasFleas;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
