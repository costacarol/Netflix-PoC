package com.example.feignpoc;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RegisterOnStartup implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        EurekaRegister register = Feign.builder()
                .decoder(new GsonDecoder())
                .target(EurekaRegister.class, "http://localhost:{port}}");
        register.registerEureka("appName");
    }
}