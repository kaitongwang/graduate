package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Oder;
import com.lzjd.mis.graduate.api.domain.request.QueryOderReqVo;
import com.lzjd.mis.graduate.api.service.OderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: OderController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/13
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@RequestMapping("/oder")
@Api("订单控制成")
public class OderController {

@Autowired
private OderService oderService;
    /**
     * 添加订单
     * @param oder
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("创建订单")
    public HttpResponse add(@RequestBody Oder oder){
        return oderService.add(oder);
    }


    @PostMapping("/lits")
    @ApiOperation("订单列表查询")
    public HttpResponse list(@RequestBody QueryOderReqVo queryOderReqVo){
        return oderService.list(queryOderReqVo);
    }
}
