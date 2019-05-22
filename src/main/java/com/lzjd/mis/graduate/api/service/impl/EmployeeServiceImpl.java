package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.EmployeeMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.dao.mapper.WageMapper;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.request.EmployeeHomeReqVo;
import com.lzjd.mis.graduate.api.domain.request.EmployeeViewVo;
import com.lzjd.mis.graduate.api.domain.responses.EmployeeHomeVo;
import com.lzjd.mis.graduate.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Autowired
    private WageMapper wageMapper;
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


            //添加工资信息
            Wage wage =new Wage();
            wage.setEpmCode(employee.getCode());
            wage.setEpmName(employee.getName());
            wage.setBaseSalary(2500L);
            wage.setCost(10L);
            wage.setPerformance(8L);
            wageMapper.insert(wage);
            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }
    }


    /**
     * 分页查询
     * @param employee
     * @return
     */
    @Override
    public HttpResponse getList(EmployeeViewVo employee) {
        try {
            PageHelper.startPage(employee.getPageNo(), employee.getPageSize());
            List<Employee> contractResDTOList = employeeMapper.getEmployeelist();
            BasePage<Employee> basePage = PageUtil.getPageList(employee.getPageSize(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse view(long id) {
        try {
        Employee employee =employeeMapper.selectByPrimaryKey(id);
            return HttpResponse.success(employee);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public HttpResponse update(Employee employee) {
        try {
            //验证名字是否重复
            Integer integer=employeeMapper.checkName(employee.getName(),employee.getId());
            if(integer>0){
                return HttpResponse.failure("名字重复无法添加");
            }
          int i = employeeMapper.updateByPrimaryKeySelective(employee);
            return HttpResponse.success(i);
        } catch (Exception ex) {
            return HttpResponse.failure("修改失败");
        }
    }

    @Override
    public HttpResponse getHomeList(EmployeeHomeReqVo employee) {
        try {
            PageHelper.startPage(employee.getPageNo(), employee.getPageSize());
            List<EmployeeHomeVo> contractResDTOList = employeeMapper.getHomeList(employee.getServiceCode());
            BasePage<EmployeeHomeVo> basePage = PageUtil.getPageList(employee.getPageSize(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse viewByCode(String code) {
        try {
            Employee employee =employeeMapper.selectByCode(code);
            return HttpResponse.success(employee);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

}
