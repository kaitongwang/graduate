package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Wages;
import com.lzjd.mis.graduate.api.domain.request.WagesReqVo;
import com.lzjd.mis.graduate.api.service.WagesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;

/**
 * @Classname: WagesController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/22
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@Api(description = "工资条控制器")
@RequestMapping("/wages")
public class WagesController {

    @Autowired
    private WagesService wagesService;

    @ApiOperation("工资条列表展示")
    @PostMapping("/getList")
    public HttpResponse getList(@RequestBody WagesReqVo wagesReqVo){
        return  wagesService.getList(wagesReqVo);
    }

    @ApiOperation("手动添加工资条")
    @PostMapping("/add")
    public HttpResponse add(@RequestBody Wages wages){
        return  wagesService.add(wages);
    }

    @ApiOperation("查看具体工资条")
    @GetMapping("/view")
    public HttpResponse view(@RequestParam("id") Integer  id){
        return  wagesService.view(id);
    }
    @ApiOperation("修改工资条")
    @PostMapping("/update")
    public HttpResponse update(@RequestBody Wages wages){
        return  wagesService.update(wages);
    }
}
