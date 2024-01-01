package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer8888 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer8888.class, args);
    }
}