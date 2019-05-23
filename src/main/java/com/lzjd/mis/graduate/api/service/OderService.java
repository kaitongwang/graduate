package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Oder;
import com.lzjd.mis.graduate.api.domain.request.QueryOderReqVo;

/**
 * @Classname: OderServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/13
 * @Version 1.0
 * @Since 1.0
 */
public interface OderService {

    /**
     * 添加订单
     * @param oder
     * @return
     */
    HttpResponse add(Oder oder);


    HttpResponse list(QueryOderReqVo queryOderReqVo);

       HttpResponse view(long id);


      HttpResponse update(Oder oder);


      void updateWags(Oder oder);
}
