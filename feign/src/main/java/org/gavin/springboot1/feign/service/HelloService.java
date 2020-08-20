package org.gavin.springboot1.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: huangjr
 * @DateTime: 2019/11/12 20:37
 * @Des:
 */
@FeignClient(name = "HELLO",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();

    @RequestMapping(method = RequestMethod.GET, value = "/user/{u}")
    String user(@PathVariable("u") String user);

}
