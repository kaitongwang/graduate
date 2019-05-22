package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.CustomerMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.request.CustomerReqVo;
import com.lzjd.mis.graduate.api.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

@Autowired
private EncodingRuleDao encodingRuleDao;
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


    @Override
    public HttpResponse add(Customer customer) {
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
            return HttpResponse.failure("添加失败");
        }
    }

    @Override
    public HttpResponse delete(Integer id) {
        try {
         int i = customerMapper.deleteByPrimaryKey(id);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("删除失败");
        }
    }

    @Override
    public HttpResponse getList(CustomerReqVo customerReqVo) {
        try {
        PageHelper.startPage(customerReqVo.getPageNo(), customerReqVo.getPageSize());
        List<Customer> contractResDTOList = customerMapper.getList();
        BasePage<Customer> basePage = PageUtil.getPageList(customerReqVo.getPageSize(),contractResDTOList);
        return HttpResponse.success(basePage);

    } catch (Exception ex) {
        ex.printStackTrace();
        return HttpResponse.failure("查询失败");
    }
    }
}
