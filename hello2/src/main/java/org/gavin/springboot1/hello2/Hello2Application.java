package org.gavin.springboot1.hello2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Hello2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hello2Application.class, args);
    }
    @GetMapping("hello")
    public String hello(){
        return "Hello2";
    }
}
