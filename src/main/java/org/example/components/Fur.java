package org.example.components;

public class Fur {
    private String color;
    private boolean exists;

    public Fur(String color, boolean exists) {
        this.color = color;
        this.exists = exists;
    }

    public void cleanFur() {
        if (exists) {
            System.out.println("You clean fur: " + color);
        } else {
            System.out.println("This animal is bald :(");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
