package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Notice;
import com.lzjd.mis.graduate.api.domain.request.NoticeViewVo;

/**
 * @Classname: NoticeService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/25
 * @Version 1.0
 * @Since 1.0
 */
public interface NoticeService {
    /**
     * 添加公告信息
     * @param notice
     * @return
     */
    HttpResponse add(Notice notice);

    /**
     * 公告列表展示
     * @param noticeViewVo
     * @return
     */
    HttpResponse getList(NoticeViewVo noticeViewVo);

    /**
     * 获取公告详情
     * @param id
     * @return
     */
    HttpResponse view( long id);


    /**
     * 修改公告
     * @param notice
     * @return
     */
    HttpResponse update(Notice notice);

    /***
     * 首页展示公告获取
     * @return
     */
    HttpResponse getPageList();

    /**
     * 删除订单
     * @param id
     * @return
     */
    HttpResponse delete( Long id );
}
