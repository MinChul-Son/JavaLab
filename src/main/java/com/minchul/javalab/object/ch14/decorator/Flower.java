package com.minchul.javalab.object.ch14.decorator;

public class Flower extends Decorator{

    public Flower(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorator() {
        return super.decorator() + " with Flower";
    }
}
