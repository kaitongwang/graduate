package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.DictionaryMapper;
import com.lzjd.mis.graduate.api.dao.mapper.DictionaryRowMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.domain.pojo.Dictionary;
import com.lzjd.mis.graduate.api.domain.pojo.DictionaryRow;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.request.DectionaryReqVo;
import com.lzjd.mis.graduate.api.domain.request.DectionaryViewVo;
import com.lzjd.mis.graduate.api.domain.responses.DectionaryResVo;
import com.lzjd.mis.graduate.api.service.DictionaryService;
import com.lzjd.mis.graduate.api.util.BeanCopyUtils;
import com.sun.org.apache.bcel.internal.generic.DDIV;
import org.codehaus.groovy.antlr.parser.GroovyTokenTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname: DictionaryServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/27
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private EncodingRuleDao encodingRuleDao;
    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Autowired
    private DictionaryRowMapper dictionaryRowMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public HttpResponse add(DectionaryReqVo dectionaryReqVo) {
        try {
            // copy 数据库访问实体
            Dictionary dictionary =new Dictionary();
            BeanCopyUtils.copy(dectionaryReqVo,dictionary);

            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.DIC_CODE);
            //给客户设置编码
            dictionary.setCode("ZD"+encodingRule.getNumberingValue());

            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());
            //添加数据
            dictionaryMapper.insert(dictionary);
            //添加list
            List<DictionaryRow> list = dectionaryReqVo.getList();
            list.stream().forEach(dictionaryRow ->dictionaryRow.setDicCode(dictionary.getCode()));
            dictionaryRowMapper.insert(list);
            return HttpResponse.success();

        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }


    }

    @Override
    public HttpResponse getList(DectionaryViewVo employee) {
        try {
            PageHelper.startPage(employee.getPageNo(), employee.getPageSize());
            List<Dictionary> contractResDTOList = dictionaryMapper.getList();
            BasePage<Dictionary> basePage = PageUtil.getPageList(employee.getPageSize(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse view(int id) {
        try {
            DectionaryResVo dectionaryResVo = new DectionaryResVo();
            Dictionary dictionary = dictionaryMapper.selectByPrimaryKey(id);
            BeanCopyUtils.copy(dictionary,dectionaryResVo);
            dectionaryResVo.setList(dictionaryRowMapper.selectByPrimaryKey(dectionaryResVo.getCode()));
            return HttpResponse.success(dectionaryResVo);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public HttpResponse update(DectionaryReqVo dectionaryReqVo) {

        try {
           Dictionary dictionary = new Dictionary();
            BeanCopyUtils.copy(dectionaryReqVo,dictionary);
            //更新主表
            dictionaryMapper.updateByPrimaryKeySelective(dictionary);
            //删除就的数据字典行内容
            dictionaryRowMapper.deleteByPrimaryKey(dictionary.getCode());
            //设置关联编码
            List<DictionaryRow> list = dectionaryReqVo.getList();
            list.stream().forEach(puchsae->puchsae.setDicCode(dictionary.getCode()));
            // 添加新的数据字典内容
            dictionaryRowMapper.insert(list);
            return HttpResponse.success();

        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("修改失败");
        }
    }

    @Override
    public HttpResponse getRowList(String dicCode) {

        try {
            List<DictionaryRow> list= dictionaryRowMapper.selectByPrimaryKey(dicCode);
            return HttpResponse.success(list);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }
}
