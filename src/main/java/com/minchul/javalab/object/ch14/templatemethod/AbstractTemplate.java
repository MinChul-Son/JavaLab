package com.minchul.javalab.object.ch14.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    public void execute() {
        log.info("Template Execute!");

        logic();

        log.info("Template Exit!");
    }

    protected abstract void logic();
}
