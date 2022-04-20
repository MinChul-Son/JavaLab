package com.minchul.javalab.object.ch14.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyServer implements Server{

    private final Server server;

    public ProxyServer(Server server) {
        this.server = server;
    }

    @Override
    public void process() {
        log.info("이거는 부가 기능이에요!~");

        server.process();

        log.info("부가 기능 끝!");
    }
}
