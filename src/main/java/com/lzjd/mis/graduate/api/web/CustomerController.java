package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

/**
 * @Classname: CustomerController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/15
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@Api(description = "客户控制器")
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;


    @GetMapping("/viewByCode")
    @ApiOperation("获取客户信息")
    public HttpResponse viewByCode(@RequestParam(value = "code") String  code){
        return customerService.viewByCode(code);
    }


    @PostMapping("/update")
    @ApiOperation("修改客户信息")
    public HttpResponse update(@RequestBody Customer customer){
        return customerService.update(customer);
    }
}
