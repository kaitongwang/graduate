package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.request.DectionaryReqVo;
import com.lzjd.mis.graduate.api.domain.request.DectionaryViewVo;

/**
 * @Classname: DictionaryService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/27
 * @Version 1.0
 * @Since 1.0
 */
public interface DictionaryService {



    HttpResponse add( DectionaryReqVo dectionaryReqVo);

    HttpResponse getList(DectionaryViewVo employee);


    HttpResponse view(int id);


    HttpResponse update(DectionaryReqVo dectionaryReqVo);


    HttpResponse getRowList(String dicCode);


}
