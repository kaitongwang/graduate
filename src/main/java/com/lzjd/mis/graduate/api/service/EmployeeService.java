package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;

/**
 * @Classname: EmployeeService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/23
 * @Version 1.0
 * @Since 1.0
 */
public interface EmployeeService {

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    HttpResponse add(Employee employee);
}
