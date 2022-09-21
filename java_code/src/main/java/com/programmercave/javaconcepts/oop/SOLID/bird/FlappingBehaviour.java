package com.programmercave.javaconcepts.oop.SOLID.bird;

import com.programmercave.javaconcepts.oop.SOLID.bird.interfaces.FlyingBehaviour;

public class FlappingBehaviour implements FlyingBehaviour{
    @Override
    public void makeFly() {
        System.out.println("Flapping");
    }
}
