package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.EmployeeMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname: EmployeeServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/23
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EncodingRuleDao encodingRuleDao;
    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)//开启事务，一旦注册失败，所有对数据库的操作都撤销
    public HttpResponse add(Employee employee) {
        try {
            //验证名字是否重复
            Integer integer=employeeMapper.checkName(employee.getName(),null);
            if(integer>0){
                return HttpResponse.failure("名字重复无法添加");
            }
            // 获取客户编码
            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.EMPLOYEE_CODE);
            //给客户设置编码
            employee.setCode("YG"+encodingRule.getNumberingValue());
            // 设置状态编码，名称
            employee.setStatusCode("1");
            employee.setStatusName("在职");
            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());

            //插入客户
            int i = employeeMapper.insertSelective(employee);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }
    }

}
