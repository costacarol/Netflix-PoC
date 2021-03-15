package com.example.deregister_eureka;

import feign.Param;
import feign.RequestLine;

public interface EurekaConfig {

    @RequestLine("DELETE /eureka/v2/apps/{appName}/{appId}")
    void deRegister(@Param("appName") String appName,
                    @Param("appId") String appId);

}
