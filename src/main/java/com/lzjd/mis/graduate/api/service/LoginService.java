package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.domain.pojo.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname: LoginService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/19
 * @Version 1.0
 * @Since 1.0
 */
public interface LoginService {

    /**
     * 登陆用户验证
     * @param user
     * @return
     */
    HttpResponse login(User user ,Byte type);


    /**
     * 退出登录用户信息
     * @param request
     * @return
     */
    HttpResponse logout(HttpServletRequest request);


    /**
     * 注册客户
     * @param customer
     * @return
     */
    HttpResponse checkIn( Customer customer);
}
