package com.programmercave.javaconcepts.oop.SOLID.bird;

import com.programmercave.javaconcepts.oop.SOLID.bird.interfaces.Swimmable;
import com.programmercave.javaconcepts.oop.SOLID.bird.interfaces.Flyable;

public class Runner {
    public static void main(String[] args) {
        Flyable parrot = new Parrot(10, "Green", "Small", "Sharp", BirdType.Parrot, new FlappingBehaviour());
        parrot.fly();

        Flyable eagle = new Eagle(20, "Brown", "Medium", "Sharp", BirdType.Eagle, new GlidingBehaviour());
        eagle.fly();

        Bird penguin = new Penguin(30, "Black", "Large", "Sharp", BirdType.Penguin);
        penguin.makeSound();

        // Make a pengiun swim
        ((Swimmable) penguin).swim();
    }
}