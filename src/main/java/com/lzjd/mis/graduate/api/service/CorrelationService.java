package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Correlation;

import java.util.List;

/**
 * @Classname: CorrelationService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/19
 * @Version 1.0
 * @Since 1.0
 */
public interface CorrelationService  {

    /**
     * 添加选择服务
     * @param list
     * @return
     */
    HttpResponse add(List<Correlation> list);

    HttpResponse getList(String employeeCode);

    HttpResponse update(List<Correlation> list);
}
