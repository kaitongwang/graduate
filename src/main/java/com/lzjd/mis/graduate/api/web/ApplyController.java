package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Apply;
import com.lzjd.mis.graduate.api.domain.request.ApplyViewReqVo;
import com.lzjd.mis.graduate.api.service.ApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname: ApplyController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/5
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@EnableAutoConfiguration
@Api(description = "申请表控制器")
@RequestMapping("/apply")
public class ApplyController {

    @Autowired
    private   ApplyService applyService;
    @PostMapping("/add")
    @ApiOperation("添加申请数据")
    public HttpResponse add(@RequestBody Apply apply){
        return applyService.add(apply);
    }

    @PostMapping("/list")
    @ApiOperation("获取申请数据列表")
    public HttpResponse getList(@RequestBody ApplyViewReqVo applyViewReqVo){
        return applyService.getList(applyViewReqVo);
    }
    @GetMapping("/view")
    @ApiOperation("查看申请详情")
    public HttpResponse view(@RequestParam (value = "id") Long id){
        return applyService.view(id);
    }

    @PostMapping("/update")
    @ApiOperation("修改申请状态")
    public HttpResponse update(@RequestBody Apply apply){
        return applyService.update(apply);
    }
}
