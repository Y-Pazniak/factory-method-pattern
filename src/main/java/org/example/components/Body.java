package org.example.components;

public class Body {
    private final boolean isDangerous;
    private double weight;

    public Body(boolean isDangerous, double weight) {
        this.isDangerous = isDangerous;
        this.weight = weight;
    }

    public void pet(){
        if (isDangerous) {
            System.out.println("It's dangerous to pet this animal");
        } else {
            System.out.println("You pet this animal safely");
        }
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
