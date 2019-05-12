package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.request.WageViewVo;
import com.lzjd.mis.graduate.api.service.WageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname: WageController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/12
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@Api(description = "工资控制器")
@RequestMapping("/wage")
public class WageController {

   @Autowired
   private WageService wageService;

    @PostMapping("/list")
    @ApiOperation("获取工资列表")
    public HttpResponse getList(@RequestBody WageViewVo wageViewVo){
        return wageService.getList(wageViewVo);
    }


    @GetMapping("/view")
    @ApiOperation("获取工资信息")
    public HttpResponse view(@RequestParam (value = "id") long id){
        return wageService.view(id);
    }

    @PostMapping("/update")
    @ApiOperation("修改工资")
    public HttpResponse update(@RequestBody Wage wage){
        return wageService.update(wage);
    }
}
