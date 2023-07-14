package com.kuang.swaggerdemo.controller;


import com.kuang.swaggerdemo.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Operation接口
@ApiOperation("Hello控制类")
@RestController
public class HelloController {

    // /error请求为默认请求
    @GetMapping(value="/hello")
    public String hello(){
    return "hello";
    }

    //只要我们接口中，返回值中存在实体类，它就会被扫描到Swagger中
    @PostMapping(value="/user")
    public User user(){
        return new User();
    }

    //operation接口,不是放在类上的
    @ApiOperation("Hello接口类")
    @GetMapping(value="/hello2")
    public String hello2(@ApiParam("用户名") String username){
        return "hello"+username;
    }

    @ApiOperation("Post测试类")
    @PostMapping(value="/postt")
    public User postt(@ApiParam("用户名") User user){
        return user;
    }
}
