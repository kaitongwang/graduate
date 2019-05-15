package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Comments;
import com.lzjd.mis.graduate.api.domain.request.CommentsViewReqVo;
import com.lzjd.mis.graduate.api.service.CommentsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: CommentsController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/15
 * @Version 1.0
 * @Since 1.0
 */
@RequestMapping
@RestController
@Api(description = "评论控制器")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @PostMapping("/add")
    @ApiOperation("添加评论数据")
    public HttpResponse add(@RequestBody Comments comments){
        return commentsService.add(comments);
    }


   @PostMapping("/getList")
    @ApiOperation("获取评价列表")
    public HttpResponse getList(@RequestBody CommentsViewReqVo commentsViewReqVo){
       return commentsService.getList(commentsViewReqVo);
   }



}
