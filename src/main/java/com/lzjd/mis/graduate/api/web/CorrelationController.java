package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Correlation;
import com.lzjd.mis.graduate.api.service.CorrelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname: CorrelationController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/19
 * @Version 1.0
 * @Since 1.0
 */
@RequestMapping("correlation")
@RestController
@Api(description = "员工选择服务控制器")
public class CorrelationController {

    @Autowired
    private CorrelationService  correlationService;

    @PostMapping("/add")
    @ApiOperation("添加选择服务")
    public HttpResponse add(@RequestBody List<Correlation> list){
        return correlationService.add(list);
    }


    @GetMapping("/getList")
    @ApiOperation("根据人员信息获取服务类型")
    public HttpResponse getList(@RequestParam String employeeCode){
        return correlationService.getList(employeeCode);
    }

    @PostMapping("/update")
    @ApiOperation("修改选择服务")
    public HttpResponse update(@RequestBody List<Correlation> list){
        return correlationService.update(list);
    }
}
