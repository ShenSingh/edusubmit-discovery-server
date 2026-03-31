package com.edusubmit.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EdusubmitDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdusubmitDiscoveryServerApplication.class, args);
    }
}
