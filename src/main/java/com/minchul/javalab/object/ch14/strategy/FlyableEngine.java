package com.minchul.javalab.object.ch14.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyableEngine implements Engine {
    @Override
    public void move() {
        log.info("날아가욧!");
    }
}
