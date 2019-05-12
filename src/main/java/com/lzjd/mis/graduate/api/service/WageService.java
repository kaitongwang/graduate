package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.request.WageViewVo;

/**
 * @Classname: WageService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/12
 * @Version 1.0
 * @Since 1.0
 */
public interface WageService {

    HttpResponse getList(WageViewVo wageViewVo);



    HttpResponse view(long id);


   HttpResponse update( Wage wage);

}
