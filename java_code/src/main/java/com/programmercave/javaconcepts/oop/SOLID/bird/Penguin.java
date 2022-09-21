package com.programmercave.javaconcepts.oop.SOLID.bird;

import com.programmercave.javaconcepts.oop.SOLID.bird.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable{

    public Penguin(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub   
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
    }

}
