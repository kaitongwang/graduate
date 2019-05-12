package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.domain.request.EmployeeViewVo;

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

    /**
     * 分页查询+
     * @param employee
     * @return
     */
    HttpResponse getList(EmployeeViewVo employee);

    /**
     * 获取详情
     * @param id
     * @return
     */
    HttpResponse view(long id);

    /**
     *
     * @param employee
     * @return
     */
    HttpResponse update(Employee employee);

    /**
     * 获取首页员工信息
     * @return
     */
    HttpResponse getHomeList(EmployeeViewVo employee);
}
