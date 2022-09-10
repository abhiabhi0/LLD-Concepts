package com.programmercave.javaconcepts.oop.SOLID.bird;

public class Eagle extends FlyingBird {

    public Eagle(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    public void fly() {
        System.out.println("\nEagle is flying");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
    }
}