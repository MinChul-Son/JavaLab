package com.minchul.javalab.object.ch14.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForwardEngine implements Engine {
    @Override
    public void move() {
      log.info("앞으로 가욧!");
    }
}
