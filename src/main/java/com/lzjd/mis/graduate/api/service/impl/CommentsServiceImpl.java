package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.CommentsMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.domain.pojo.Comments;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.request.CommentsViewReqVo;
import com.lzjd.mis.graduate.api.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname: CommentsServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/15
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private EncodingRuleDao encodingRuleDao;

    @Autowired
    private CommentsMapper commentsMapper;

    @Override
    public HttpResponse add(Comments comments) {
        try{
            // 获取评论编码
            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.COMMENTS_CODE);
            //给评论设置编码
            comments.setCode("PJ"+encodingRule.getNumberingValue());
            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());

            //插入客户
            int i = commentsMapper.insertSelective(comments);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");

        }
    }

    @Override
    public HttpResponse getList(CommentsViewReqVo commentsViewReqVo) {
        try{
            PageHelper.startPage(commentsViewReqVo.getPageNo(),commentsViewReqVo.getPageSize());
            List<Comments> contractResDTOList = commentsMapper.getList(commentsViewReqVo);
            BasePage<Comments> basePage = PageUtil.getPageList(commentsViewReqVo.getPageSize(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");

        }
    }
}
