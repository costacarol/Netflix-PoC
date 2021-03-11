package com.example.feignpoc;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface EurekaRegister {

    @RequestLine("POST /eureka/v2/apps/{appname}")
    @Headers("Content-Type: application/json")
    @Body("%7B\"instance\": \n{\n\"hostName\": \"localhost\",\n\"app\": \"appname\",\n\"vipAddress\": \"appname\",\n\"secureVipAddress\": \"appname\",\n\"ipAddr\": \"127.0.1.1\", \n\"status\": \"STARTING\", \n\"port\": {\"$\": \"8080\", \"@enabled\": \"true\"}, \n\"securePort\": {\"$\": \"8443\", \"@enabled\": \"true\"}, \n\"healthCheckUrl\": \"http://localhost:8080/healthcheck\", \n\"statusPageUrl\": \"http://localhost:8080/healthcheck\", \n\"homePageUrl\": \"http://localhost:8080\", \n\"dataCenterInfo\": { \n\"@class\": \"com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo\", \n\"name\": \"MyOwn\" \n}\n}%7D"
    )
    void registerEureka(@Param("appName") String appName);

}
