package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.dao.mapper.CorrelationMapper;
import com.lzjd.mis.graduate.api.domain.pojo.Correlation;
import com.lzjd.mis.graduate.api.service.CorrelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname: CorrelationServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/19
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class CorrelationServiceImpl implements CorrelationService {

    @Autowired
    private CorrelationMapper correlationMapper;
    @Override
    public HttpResponse add(List<Correlation> list) {
        try {
            int i  = correlationMapper.insert(list);
            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return   HttpResponse.failure("添加失败");
        }
    }

    @Override
    public HttpResponse getList(String employeeCode) {
        try {
            List<Correlation> correlations = correlationMapper.getList(employeeCode);
            return HttpResponse.success(correlations);
        } catch (Exception e) {
            e.printStackTrace();
            return   HttpResponse.failure("添加失败");
        }
    }

    @Override
    public HttpResponse update(List<Correlation> list) {
        try {
            //删除旧的数据
            int j = correlationMapper.deleteByCode(list.get(0).getEmployeeCode());
            //添加数据
            int i  = correlationMapper.insert(list);
            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return   HttpResponse.failure("添加失败");
        }
    }
}
