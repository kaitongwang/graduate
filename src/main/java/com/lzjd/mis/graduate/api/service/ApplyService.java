package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Apply;
import com.lzjd.mis.graduate.api.domain.request.ApplyViewReqVo;

/**
 * @Classname: ApplyService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/5
 * @Version 1.0
 * @Since 1.0
 */
public interface ApplyService {
    /**
     * 添加申请数据
      * @param apply
     * @return
     */
    HttpResponse add(Apply apply);


    /**
     * 获取申请列表
     * @param applyViewReqVo
     * @return
     */
    HttpResponse getList(ApplyViewReqVo applyViewReqVo);


    /**
     * 查看申请详情
     * @param id
     * @return
     */
    HttpResponse view(Long id);

    /**
     * 修改申请表
     * @param apply
     * @return
     */
    HttpResponse update( Apply apply);
}
