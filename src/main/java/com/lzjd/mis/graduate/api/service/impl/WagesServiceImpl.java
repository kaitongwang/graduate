package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.dao.mapper.WagesMapper;
import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.pojo.Wages;
import com.lzjd.mis.graduate.api.domain.request.WagesReqVo;
import com.lzjd.mis.graduate.api.service.WagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname: WagesServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/22
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class WagesServiceImpl implements WagesService {
    @Autowired
    private WagesMapper wagesMapper;

    @Override
    public HttpResponse getList(WagesReqVo wagesReqVo) {
        try {
            PageHelper.startPage(wagesReqVo.getPageNo(), wagesReqVo.getPageSize());
            List<Wages> wagesList = wagesMapper.getList(wagesReqVo);
            BasePage<Wages> basePage = PageUtil.getPageList(wagesReqVo.getPageNo(), wagesList);
            return HttpResponse.success(basePage);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse add(Wages wages) {
        try {
            int i = wagesMapper.insert(wages);
            return HttpResponse.success("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }
    }

    @Override
    public HttpResponse view(Integer id) {
        try {
            Wages i = wagesMapper.selectByPrimaryKey(id);
            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse update(Wages wages) {
        try {
        int i = wagesMapper.updateByPrimaryKeySelective(wages);
        return HttpResponse.success("修改成功");
    } catch (Exception e) {
        e.printStackTrace();
        return HttpResponse.failure("修改失败");
    }
    }
}
