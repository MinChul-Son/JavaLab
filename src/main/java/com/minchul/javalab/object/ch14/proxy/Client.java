package com.minchul.javalab.object.ch14.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    private final Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void request() {
        log.info("요청을 서버로 전송합니다.");

        server.process();

        log.info("서버로부터 응답이 도착했습니다.");
    }
}
