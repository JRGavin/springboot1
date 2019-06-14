package org.gavin.springboot1.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.gavin.springboot1.common.JsonUtil;
import org.gavin.springboot1.swagger.entity.User;
import org.gavin.springboot1.swagger.repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangjr
 * @DateTime: 2019/6/13 14:13
 * @Des:
 */
@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {
    @Autowired
    UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(SwaggerDemoController.class);


    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户账号", paramType = "path", required = true, dataType = "String")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getStudent(@PathVariable String id) {
        logger.info("开始查询某个用户信息");
        User user = userRepository.findOne(id);
        logger.info("用户信息={}", user);
        if(user!=null){
            System.out.println(user.getUsername());
        }
//        logger.info("用户信息={}", JsonUtil.Object2Json(user));
        return user;
    }


}
