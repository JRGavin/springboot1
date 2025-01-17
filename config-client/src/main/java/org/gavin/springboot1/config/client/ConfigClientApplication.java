package org.gavin.springboot1.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;
    @Value("democonfigclient.message")
    String message;

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

    @RequestMapping(value = "/msg")
    public String msg() {
        return message;
    }
}
