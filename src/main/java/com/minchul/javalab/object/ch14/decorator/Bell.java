package com.minchul.javalab.object.ch14.decorator;

public class Bell extends Decorator{

    public Bell(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorator() {
        return super.decorator() + " with Bell";
    }
}
