package org.gavin.springboot1.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author: huangjr
 * @DateTime: 2018/2/3 15:18
 * @Des:
 */
@Controller
public class HelloWorld {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hellWorld(){
        return "HelloWorld";
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String startSuccess(){
        return "Start Success!";
    }


}
