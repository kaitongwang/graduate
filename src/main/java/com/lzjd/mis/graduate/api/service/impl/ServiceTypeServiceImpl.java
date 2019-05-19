package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.dao.mapper.ServiceRowMapper;
import com.lzjd.mis.graduate.api.dao.mapper.ServiceTypeMapper;
import com.lzjd.mis.graduate.api.domain.pojo.*;
import com.lzjd.mis.graduate.api.domain.request.ServiceTypeReqVo;
import com.lzjd.mis.graduate.api.domain.request.ServiceTypeViewVo;
import com.lzjd.mis.graduate.api.domain.responses.ServiceTypeResVo;
import com.lzjd.mis.graduate.api.service.ServiceTypeService;
import com.lzjd.mis.graduate.api.util.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname: ServiceTypeServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/19
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {

    @Autowired
    private EncodingRuleDao encodingRuleDao;
   @Autowired
   private ServiceTypeMapper serviceTypeMapper;
   @Autowired
   private ServiceRowMapper serviceRowMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public HttpResponse add(ServiceTypeReqVo serviceTypeReqVo) {
        try {
            // copy 数据库访问实体
            ServiceType serviceType =new ServiceType();
            BeanCopyUtils.copy(serviceTypeReqVo,serviceType);

            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.SERVICE_CODE);
            //给客户设置编码
            serviceType.setCode("FW"+encodingRule.getNumberingValue());

            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());
            //添加数据
            serviceTypeMapper.insert(serviceType);
            //添加list
            List<ServiceRow> list = serviceTypeReqVo.getList();
            list.stream().forEach(dictionaryRow ->dictionaryRow.setServiceCode(serviceType.getCode()));
            serviceRowMapper.insert(list);
            return HttpResponse.success();

        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("添加失败");
        }
    }

    @Override
    public HttpResponse getList(ServiceTypeViewVo serviceTypeViewVo) {
        try {
            PageHelper.startPage(serviceTypeViewVo.getPageNo(), serviceTypeViewVo.getPageSize());
            List<ServiceType> contractResDTOList = serviceTypeMapper.getList();
            BasePage<ServiceType> basePage = PageUtil.getPageList(serviceTypeViewVo.getPageSize(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse view(Integer id) {
        try {
            ServiceTypeResVo serviceTypeResVo = new ServiceTypeResVo();
            ServiceType serviceType = serviceTypeMapper.selectByPrimaryKey(id);
            BeanCopyUtils.copy(serviceType,serviceTypeResVo);
            serviceTypeResVo.setList(serviceRowMapper.selectByPrimaryKey(serviceTypeResVo.getCode()));
            return HttpResponse.success(serviceTypeResVo);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse update(ServiceTypeReqVo serviceTypeReqVo) {

        try {
            ServiceType serviceType = new ServiceType();
            BeanCopyUtils.copy(serviceTypeReqVo, serviceType);
            //更新主表
            serviceTypeMapper.updateByPrimaryKeySelective(serviceType);
            //删除就的服务行内容
            serviceRowMapper.deleteByPrimaryKey(serviceType.getCode());
            //设置关联编码
            List<ServiceRow> list = serviceTypeReqVo.getList();
            list.stream().forEach(puchsae -> puchsae.setServiceCode(serviceType.getCode()));
            // 添加新的数据字典内容
            serviceRowMapper.insert(list);
            return HttpResponse.success();

        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("修改失败");
        }
    }
    @Override
    public HttpResponse getRowList(String serviceCode) {
        try {
            List<ServiceRow>  rows = serviceRowMapper.selectByPrimaryKey(serviceCode);
            return HttpResponse.success(rows);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }
}
