package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Notice;
import com.lzjd.mis.graduate.api.domain.request.NoticeViewVo;
import com.lzjd.mis.graduate.api.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname: NoticeService
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/25
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@EnableAutoConfiguration
@Api(description = "公告控制器")
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * 添加公告信息
     * @param notice
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("添加公告信息")
    public HttpResponse add(@RequestBody Notice notice){
        return noticeService.add(notice);
    }

    @PostMapping("/list")
    @ApiOperation("获取公告列表")
    public HttpResponse getList(@RequestBody NoticeViewVo noticeViewVo){
        return noticeService.getList(noticeViewVo);
    }


    @GetMapping("/view")
    @ApiOperation("获取公告信息")
    public HttpResponse view(@RequestParam (value = "id") long id){
        return noticeService.view(id);
    }

    @PostMapping("/update")
    @ApiOperation("修改公告信息")
    public HttpResponse update(@RequestBody Notice notice){
        return noticeService.update(notice);
    }

    @GetMapping("/page/notice/list")
    @ApiOperation("首页公告显示")
    public HttpResponse getPageList(){
            return noticeService.getPageList();

    }

}
