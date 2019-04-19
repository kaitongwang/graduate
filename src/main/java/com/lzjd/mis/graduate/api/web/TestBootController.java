package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.domain.pojo.User;
import com.lzjd.mis.graduate.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
@Api(description ="用户管理信息")
public class TestBootController {


    @Autowired
    private UserService userService;

    @ApiOperation("获取用户")
    @GetMapping("getuser")
    public User getUser(@RequestParam int id) {
     return userService.getUserById(id);

    }
}