package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.request.DectionaryReqVo;
import com.lzjd.mis.graduate.api.domain.request.DectionaryViewVo;
import com.lzjd.mis.graduate.api.service.DictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname: DictionaryController
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/27
 * @Version 1.0
 * @Since 1.0
 */
@RestController
@EnableAutoConfiguration
@Api(description = "字典控制器")
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;


    @PostMapping("/add")
    @ApiOperation("添加数据字典")
    public HttpResponse add(@RequestBody DectionaryReqVo dectionaryReqVo){
        return dictionaryService.add(dectionaryReqVo);
    }

    @PostMapping("/list")
    @ApiOperation("获取字典列表")
    public HttpResponse getList(@RequestBody DectionaryViewVo dectionaryViewVo){
        return dictionaryService.getList(dectionaryViewVo);
    }


    @GetMapping("/view")
    @ApiOperation("获取字典信息")
    public HttpResponse view(@RequestParam (value = "id") Integer id){
        return dictionaryService.view(id);
    }

    @PostMapping("/update")
    @ApiOperation("修改字典信息")
    public HttpResponse update(@RequestBody DectionaryReqVo dectionaryReqVo){
        return dictionaryService.update(dectionaryReqVo);
    }


    @GetMapping("/getapi")
    @ApiOperation("外部获取字典接口")
    public  HttpResponse getRowList(@RequestParam String dicCode){
        return dictionaryService.getRowList(dicCode);
    }
}
