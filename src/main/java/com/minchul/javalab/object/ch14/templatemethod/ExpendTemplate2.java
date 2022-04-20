package com.minchul.javalab.object.ch14.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExpendTemplate2 extends AbstractTemplate{

    @Override
    protected void logic() {
        log.info("비즈니스 로직2 실행");
    }
}
