package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;

/**
 * @Classname: CustomerService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/15
 * @Version 1.0
 * @Since 1.0
 */
public interface CustomerService {

    /**
     * 通过编码查询客户信息
     * @param code
     * @return
     */
    HttpResponse viewByCode(String  code);


    HttpResponse update(Customer customer);
}
