package org.gavin.springboot1.hello1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Hello1Application {

    public static void main(String[] args) {
        SpringApplication.run(Hello1Application.class, args);
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello1";
    }
}
