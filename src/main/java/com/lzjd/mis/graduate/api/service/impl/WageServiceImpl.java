package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.dao.mapper.WageMapper;
import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.request.WageViewVo;
import com.lzjd.mis.graduate.api.service.WageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname: WageServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/12
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class WageServiceImpl implements WageService {
    @Autowired
    private WageMapper wageMapper;

    @Override
    public HttpResponse getList(WageViewVo wageViewVo) {
        try {
            PageHelper.startPage(wageViewVo.getPageNo(), wageViewVo.getPageSize());
            List<Wage> contractResDTOList = wageMapper.getList();
            BasePage<Wage> basePage = PageUtil.getPageList(wageViewVo.getPageNo(), contractResDTOList);
            return HttpResponse.success(basePage);

        } catch (Exception ex) {
            ex.printStackTrace();
            return HttpResponse.failure("查询失败");

        }
    }
    @Override
    public HttpResponse view(long id) {
        try {
            Wage wage = wageMapper.selectByPrimaryKey(id);
            return HttpResponse.success(wage);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse update(Wage wage) {
        try {
            int i = wageMapper.updateByPrimaryKeySelective(wage);
            return HttpResponse.success(i);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }
}
