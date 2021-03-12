package com.example.EurekaSendHeartBeats;

import feign.Param;
import feign.RequestLine;

public interface EurekaConfig {

    @RequestLine("PUT /eureka/v2/apps/{appName}/{appId}")
    void sendHeartBeat(@Param("appName") String appName,
                       @Param("appId") String appId);

}

