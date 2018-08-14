package com.example.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableEurekaServer
@EnableRedisHttpSession
public class DiscoveryServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}
