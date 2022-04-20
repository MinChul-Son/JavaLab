package com.minchul.javalab.object.ch14.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        log.info("자동차 운행을 시작합니다.");

        engine.move();

        log.info("자동차 운행이 종료되었습니다.");
    }
}
