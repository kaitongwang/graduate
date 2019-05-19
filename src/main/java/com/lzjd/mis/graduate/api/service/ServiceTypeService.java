package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.request.ServiceTypeReqVo;
import com.lzjd.mis.graduate.api.domain.request.ServiceTypeViewVo;

/**
 * @Classname: ServiceTypeService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/19
 * @Version 1.0
 * @Since 1.0
 */
public interface ServiceTypeService {

    /**
     * 创建服务类型
     * @param serviceTypeReqVo
     * @return
     */
    HttpResponse add(ServiceTypeReqVo serviceTypeReqVo);

    /**
     * 获取服务类型列表
     * @param serviceTypeViewVo
     * @return
     */
    HttpResponse getList( ServiceTypeViewVo serviceTypeViewVo);

     HttpResponse view( Integer id);

     HttpResponse update( ServiceTypeReqVo serviceTypeReqVo);


      HttpResponse getRowList(String serviceCode);


}
