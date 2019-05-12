package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.domain.request.EmployeeViewVo;
import com.lzjd.mis.graduate.api.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/list")
    @ApiOperation("获取员工列表")
    public HttpResponse getList(@RequestBody EmployeeViewVo employee){
        return employeeService.getList(employee);
    }


    @GetMapping("/view")
    @ApiOperation("获取员工信息")
    public HttpResponse view(@RequestParam (value = "id") long id){
        return employeeService.view(id);
    }

    @PostMapping("/update")
    @ApiOperation("修改员工信息")
    public HttpResponse update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }



    @PostMapping("/homeList")
    @ApiOperation("获取首页员工信息")
    public HttpResponse getHomeList(@RequestBody EmployeeViewVo employee){
        return employeeService.getHomeList(employee);
    }
}
