package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: EmployeeController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/23
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@EnableAutoConfiguration
@Api(description = "员工控制器")
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;
    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("添加员工信息")
    public HttpResponse add(@RequestBody Employee employee){
         return employeeService.add(employee);
    }
}
