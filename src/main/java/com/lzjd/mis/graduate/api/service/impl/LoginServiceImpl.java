package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.CustomerMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EmployeeMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.pojo.User;
import com.lzjd.mis.graduate.api.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Classname: LoginServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/19
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private EncodingRuleDao encodingRuleDao;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public HttpResponse login(User user, Byte type) {
        try{

            //如果type等于0则说明是客户登陆
            if (type==0){
                // 通过用户名查询用户
                //验证密码是否通过
                Customer customer =customerMapper.selectByName(user.getUserName());
                if(customer.equals(null)){
                    return HttpResponse.failure("用户不存在");
                }else if(!user.getPassword().equals(customer.getCustomerPassword())){
                    return HttpResponse.failure("密码错误");
                }else {
                    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                    HttpSession session = request.getSession();
                    session.setAttribute("username",user.getUserName());
                    session.setAttribute("code",customer.getCustomerCode());
                    return HttpResponse.success("登录成功");
                }

            }else {
                //如果是用户登陆
                // 通过用户名查询用户
                Employee employee = employeeMapper.selectByName(user.getUserName());
                // 验证用户是否可以登录
                if(employee.equals(null)){
                    return HttpResponse.failure("用户不存在");

                }else if(employee.getStatusCode().equals(0)) {
                   return HttpResponse.failure("你已离职无法登录");
                }else if(!user.getPassword().equals(employee.getName())){
                   // 验证密码是否相等
                   return HttpResponse.failure("密码错误");
               }else {
                   HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                   HttpSession session = request.getSession();

                   session.setAttribute("username",user.getUserName());
                   session.setAttribute("code",111);
                   return HttpResponse.success("登录成功");
               }
            }

        }catch ( Exception e){
            return HttpResponse.failure("登陆失败");
        }





    }

    /**
     * 退出登录用户信息
     * @param request
     * @return
     */
    @Override
    public HttpResponse logout(HttpServletRequest request) {
        try {
            /**
             * 获取session
             */
            HttpSession session = request.getSession();
            /**
             * 用户退销毁session
             */
            session.invalidate();

            return HttpResponse.success();

        }catch (Exception e){
            return HttpResponse.failure();
        }

    }

    /**
     *
     * @param customer
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)//开启事务，一旦注册失败，所有对数据库的操作都撤销
    public HttpResponse checkIn(Customer customer) {
        try {
            //验证名字是否重复
            Integer integer=customerMapper.checkName(customer.getCustomerName(),null);
            if(integer>0){
                return HttpResponse.failure("名字重复无法添加");
            }
            // 获取客户编码
            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.CUSTOMER_CODE);
            //给客户设置编码
            customer.setCustomerCode("KH"+encodingRule.getNumberingValue());

            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());

            //插入客户
            int i = customerMapper.insertSelective(customer);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("注册失败");
        }
    }
}
