package com.minchul.javalab.object.ch14.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        ChristmasTree basicChristmasTree = new BasicChristmasTree();
        log.info(basicChristmasTree.decorator());

        ChristmasTree bellTree = new Bell(basicChristmasTree);
        log.info(bellTree.decorator());

        ChristmasTree flowerBellTree = new Flower(bellTree);
        log.info(flowerBellTree.decorator());
    }

}
