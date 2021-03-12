package com.example.EurekaSendHeartBeats;

import feign.Feign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Slf4j
public class EurekaSendHeartBeat implements Runnable, CommandLineRunner {

    public EurekaSendHeartBeat() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        EurekaConfig send = Feign.builder()
                .target(EurekaConfig.class, "https://localhost:{port}");
        while (true) {
            try {
                send.sendHeartBeat("appname", "appId");
                Thread.sleep(30000);
                log.info("Service is UP!")
            } catch (Exception e) {
                e.printStackTrace();
                log.info("Something was wrong. The request is not responding or is not available.");
            }
        }
    }

    @Override
    public void run(String... args) throws Exception {
        this.run();
    }
}

