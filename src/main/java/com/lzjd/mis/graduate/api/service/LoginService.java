package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.User;

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
    HttpResponse login(User user);
}
