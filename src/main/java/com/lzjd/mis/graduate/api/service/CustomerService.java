package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.domain.request.CustomerReqVo;

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

    /**
     * 添加客户信息
     * @param customer
     * @return
     */
    HttpResponse add( Customer customer);

    HttpResponse delete(Integer id);

    HttpResponse getList(CustomerReqVo customerReqVo);

}
