package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Comments;
import com.lzjd.mis.graduate.api.domain.request.CommentsViewReqVo;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname: CommentsService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/15
 * @Version 1.0
 * @Since 1.0
 */
public interface CommentsService {
    /**
     * 添加评论
     * @param comments
     * @return
     */
    HttpResponse add(Comments comments);

    HttpResponse getList(CommentsViewReqVo commentsViewReqVo);

    HttpResponse getDegree(String employeesCode);

    HttpResponse getView( String oder_Code);



}
