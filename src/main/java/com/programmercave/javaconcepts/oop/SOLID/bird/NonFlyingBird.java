package com.programmercave.javaconcepts.oop.SOLID.bird;

public abstract class NonFlyingBird extends Bird {

    public NonFlyingBird(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }
}
