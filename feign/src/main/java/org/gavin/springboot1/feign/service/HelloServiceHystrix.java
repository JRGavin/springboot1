package org.gavin.springboot1.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: huangjr
 * @DateTime: 2019/12/1 22:27
 * @Des: 熔断demo，服务不可用时触发以下返回
 */
@Component
public class HelloServiceHystrix implements HelloService {

    @Override
    public String hello() {
        return "调用服务失败";
    }
}
