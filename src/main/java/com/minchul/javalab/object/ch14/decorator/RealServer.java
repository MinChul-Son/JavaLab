package com.minchul.javalab.object.ch14.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealServer implements Server{
    @Override
    public void process() {
        log.info("클라이언트의 요청을 처리합니다.");
        log.info("처리 끝!");
    }
}
