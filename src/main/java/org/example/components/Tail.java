package org.example.components;

public class Tail {
    private double length;

    public Tail(double length) {
        this.length = length;
    }

    public void touchTail() {
        if (length > 0) {
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
}
