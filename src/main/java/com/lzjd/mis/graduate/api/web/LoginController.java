package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.domain.pojo.User;
import com.lzjd.mis.graduate.api.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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
@Api(description = "登录控制器")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    /**
     * 登陆用户信息
     * @param user
     * @return
     */
    @ApiOperation("用户登录")
    @PostMapping("/landing")
    public HttpResponse login(@RequestBody User user, @RequestParam(value = "type" ) Byte type){
        return loginService.login(user,type);

    }


    /**
     * 退出登录用户信息
     * @param request
     * @return
     */

    @ApiOperation("退出登录")
    @GetMapping("/logout")
    public HttpResponse logout(HttpServletRequest request){
      return  loginService.logout(request);
    }

    /**
     * 客户注册
     * @param customer
     * @return
     */

    @ApiOperation("用户注册")
    @PostMapping("/check")
    public HttpResponse checkIn(@RequestBody Customer customer){
        return loginService.checkIn(customer);
    }

    /**
     * 上传文件
     * @param file
     * @return
     */
    @ApiOperation("上传文件65")
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        return loginService.Upload(file);
    }


}
