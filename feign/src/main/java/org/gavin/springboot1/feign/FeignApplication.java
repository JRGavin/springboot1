package org.gavin.springboot1.feign;

import org.gavin.springboot1.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient //用于启动服务发现功能
@EnableFeignClients //用于启动Fegin功能
@SpringBootApplication
@RestController
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @Autowired
    private HelloService service;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return service.hello();
    }

    @RequestMapping(value = "/user/{u}", method = RequestMethod.GET)
    public String user(@PathVariable("u") String user) {
        return service.user(user);
    }
}
