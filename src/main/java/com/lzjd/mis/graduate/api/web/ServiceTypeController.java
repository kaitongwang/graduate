package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.request.ServiceTypeReqVo;
import com.lzjd.mis.graduate.api.domain.request.ServiceTypeViewVo;
import com.lzjd.mis.graduate.api.service.ServiceTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname: ServiceTypeController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/19
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@RequestMapping("/serviceType")
@Api(description = "服务类型控制器")
@EnableAutoConfiguration
public class ServiceTypeController {

    @Autowired
    private ServiceTypeService serviceTypeService;
    /**
     * 添加订单
     * @param serviceTypeReqVo
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("创建服务")
    public HttpResponse add(@RequestBody ServiceTypeReqVo serviceTypeReqVo){
        return serviceTypeService.add(serviceTypeReqVo);
    }


    @PostMapping("/list")
    @ApiOperation("获取服务类型列表")
    public HttpResponse getList(@RequestBody ServiceTypeViewVo serviceTypeViewVo){
        return serviceTypeService.getList(serviceTypeViewVo);
    }

    @GetMapping("/view")
    @ApiOperation("获取服务信息")
    public HttpResponse view(@RequestParam (value = "id") Integer id){
        return serviceTypeService.view(id);
    }

    @PostMapping("/update")
    @ApiOperation("修改服务信息")
    public HttpResponse update(@RequestBody ServiceTypeReqVo serviceTypeReqVo){
        return serviceTypeService.update(serviceTypeReqVo);
    }


    @GetMapping("/getApi")
    @ApiOperation("获取服务类型具体服务")
    public  HttpResponse getRowList(@RequestParam String serviceCode){
        return serviceTypeService.getRowList(serviceCode);
    }
}
