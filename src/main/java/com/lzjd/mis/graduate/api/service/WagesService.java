package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Wages;
import com.lzjd.mis.graduate.api.domain.request.WagesReqVo;

/**
 * @Classname: WagesService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/22
 * @Version 1.0
 * @Since 1.0
 */
public interface WagesService {

    HttpResponse getList(WagesReqVo wagesReqVo);

    HttpResponse add( Wages wages);

    HttpResponse view(Integer  id);

    HttpResponse update( Wages wages);

}
