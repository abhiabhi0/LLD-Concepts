package com.programmercave.javaconcepts.oop.SOLID.bird;

import com.programmercave.javaconcepts.oop.SOLID.bird.interfaces.*;

public class GlidingBehaviour implements FlyingBehaviour{
    @Override
    public void makeFly() {
        System.out.println("Gliding");
    }
}
