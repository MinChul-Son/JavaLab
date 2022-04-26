package com.minchul.javalab.object.ch14.decorator;

public abstract class Decorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public Decorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorator() {
        return christmasTree.decorator();
    }
}
