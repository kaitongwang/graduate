package com.lzjd.mis.graduate.api.service.impl;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Classname: BaseServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/20
 * @Version 1.0
 * @Since 1.0
 */
public class BaseServiceImpl {


    /**
     * 获取登录用户信息
     * @return
     */
    public String getUser(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String userName =session.getAttribute("userName").toString();
        return userName;
    }
}
