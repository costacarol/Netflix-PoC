package com.example.deregister_eureka;

import feign.Feign;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class DeRegister implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        EurekaConfig deRegister = Feign.builder()
                .target(EurekaConfig.class, "http://localhost:8084");
        deRegister.deRegister("appName", "appId");
    }
}


