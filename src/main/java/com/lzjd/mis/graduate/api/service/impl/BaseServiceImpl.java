package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.domain.pojo.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import sun.rmi.runtime.NewThreadAction;

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
     * 获取登录用户名称
     * @return
     */
    public String getUserName(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String userName =session.getAttribute("username").toString();

        return userName;
    }
    /**
     * 获取登录用户编码
     * @return
     */
    public String getUserCode(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String code =session.getAttribute("code").toString();
        return code;
    }
}
