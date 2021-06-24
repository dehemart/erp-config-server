package com.dehemart.erpconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ErpConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpConfigServerApplication.class, args);
    }

}
