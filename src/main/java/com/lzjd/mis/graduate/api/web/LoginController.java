package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: LoginController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/19
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@EnableAutoConfiguration
@Api("登陆控制器" )
@RequestMapping("/login")
public class LoginController {


    /**
     * 登陆用户信息
     * @param user
     * @return
     */
    @PostMapping("/landing")
    public HttpResponse login(User user){
        return HttpResponse.success();

    }

}
