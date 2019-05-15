package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.dao.mapper.CustomerMapper;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname: CustomerServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/15
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {

@Autowired
private CustomerMapper customerMapper;
    @Override
    public HttpResponse viewByCode(String code) {
        try{
            Customer customer = customerMapper.selectByCode(code);
           return HttpResponse.success(customer);

        }catch (Exception e){
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public HttpResponse update(Customer customer) {

        try{
          int i = customerMapper.updateByPrimaryKeySelective(customer);
            return HttpResponse.success(i);

        }catch (Exception e){
            return HttpResponse.failure("更新失败");
        }
    }
}
