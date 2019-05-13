package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.dao.mapper.OderMapper;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.pojo.Oder;
import com.lzjd.mis.graduate.api.domain.request.QueryOderReqVo;
import com.lzjd.mis.graduate.api.service.OderService;
import com.lzjd.mis.graduate.api.util.DateUtil;
import com.lzjd.mis.graduate.api.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Classname: OderServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/13
 * @Version 1.0
 * @Since 1.0
 */
@Slf4j
@Service
public class OderServiceImpl implements OderService {

    @Autowired
    private EncodingRuleDao encodingRuleDao;
    @Autowired
    private OderMapper oderMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public HttpResponse add(Oder oder) {
        try{
            // 获取订单编码
            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.ODER_CODE);
            String time = DateUtil.formattingDate(DateUtil.DATE_FORMAT_YYYYMMDD,new Date());
            //给订单设置编码
            oder.setCode("DD"+time+encodingRule.getNumberingValue());
            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());

            //插入客户
            int i = oderMapper.insertSelective(oder);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }
    }

    @Override
    public HttpResponse list(QueryOderReqVo queryOderReqVo) {
        try {

            PageHelper.startPage(queryOderReqVo.getPageNo(), queryOderReqVo.getPageSize());
            List<Oder> contractResDTOList = oderMapper.getList(queryOderReqVo);
            BasePage<Oder> basePage = PageUtil.getPageList(queryOderReqVo.getPageSize(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }
}
