package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.dao.mapper.NoticeMapper;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.pojo.Notice;
import com.lzjd.mis.graduate.api.domain.request.NoticeViewVo;
import com.lzjd.mis.graduate.api.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Classname: NoticeServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/25
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;
    @Autowired
    private EncodingRuleDao encodingRuleDao;

    @Override
    public HttpResponse add(Notice notice) {
        try {

            // 获取公告编码
            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.NOTICE_CODE);
            //设置公告编码
            notice.setCode("YG"+encodingRule.getNumberingValue());

            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());

            //插入公告
            int i = noticeMapper.insertSelective(notice);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }
    }

    @Override
    public HttpResponse getList(NoticeViewVo noticeViewVo) {
        try {
            PageHelper.startPage(noticeViewVo.getPageNo(), noticeViewVo.getPageSize());
            List<Notice> contractResDTOList = noticeMapper.getNoticeList();
            BasePage<Notice> basePage = PageUtil.getPageList(noticeViewVo.getPageNo(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse view(long id) {
        try {
            Notice employee =noticeMapper.selectByPrimaryKey(id);
            return HttpResponse.success(employee);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse update(Notice notice) {
        try {
        int i = noticeMapper.updateByPrimaryKeySelective(notice);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("修改失败");
        }
    }

    @Override
    public HttpResponse getPageList() {
        try {
            List<Notice> list = noticeMapper.getPageList(new Date());
            return HttpResponse.success(list);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("获取失败");
        }
    }
}
