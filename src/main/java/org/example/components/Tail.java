package org.example.components;

public class Tail {
    private double length;
    private final boolean exists;

    public Tail(double length, boolean exists) {
        this.exists = exists;
        this.length = length;
    }

    public void touchTail(){
        if (exists) {
            System.out.println("You touch tail: " + length);
        } else {
            System.out.println("There is no tail :(");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isExists() {
        return exists;
    }
}
