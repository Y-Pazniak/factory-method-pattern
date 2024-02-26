package org.example.components;

import java.util.Objects;

public class Fur {
    private String color;

    public Fur(String color) {
        this.color = color;
    }

    public void cleanFur() {
        if (color.isEmpty()) {
            System.out.println("Animal is bald");
        } else {
            System.out.println("You clean fur: " + color);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
