package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.ApplyMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.domain.pojo.Apply;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.request.ApplyViewReqVo;
import com.lzjd.mis.graduate.api.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname: ApplyServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/5
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class ApplyServiceImpl  implements ApplyService  {

    @Autowired
    private EncodingRuleDao encodingRuleDao;
    @Autowired
    private ApplyMapper applyMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public HttpResponse add(Apply apply) {
        try{
            // 获取客户编码
            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.APPLY_CODE);
            //给客户设置编码
            apply.setApplyCode("SQ"+encodingRule.getNumberingValue());
            // 设置状态编码，名称
          apply.setApplySatatusName("待审核");
          apply.setApplyStatusCode("0");
            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());

            //插入客户
            int i = applyMapper.insertSelective(apply);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }
    }

    /**
     * 获取申请列表
     * @param applyViewReqVo
     * @return
     */
    @Override
    public HttpResponse getList(ApplyViewReqVo applyViewReqVo) {
        try {
            if("YG1000".equals(applyViewReqVo.getApplyUserCode())){
                // 如果是管理员
                applyViewReqVo.setApplyUserCode(null);
            }else {
            }
            PageHelper.startPage(applyViewReqVo.getPageNo(), applyViewReqVo.getPageSize());
            List<Apply> contractResDTOList = applyMapper.getList(applyViewReqVo);
            BasePage<Apply> basePage = PageUtil.getPageList(applyViewReqVo.getPageNo(),contractResDTOList);
            return HttpResponse.success(basePage);

        } catch (Exception ex) {
            ex.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse view(Long id) {
        try {
            Apply employee = applyMapper.selectByPrimaryKey(id);
            return HttpResponse.success(employee);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public HttpResponse update(Apply apply) {
        try {
            int i = applyMapper.updateByPrimaryKeySelective(apply);
            return HttpResponse.success(i);
        } catch (Exception ex) {
            return HttpResponse.failure("查询失败");
        }
    }
}
