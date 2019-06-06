package com.lzjd.mis.graduate.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.lzjd.mis.graduate.api.base.common.BasePage;
import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.common.PageUtil;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.dao.mapper.OderMapper;
import com.lzjd.mis.graduate.api.dao.mapper.WageMapper;
import com.lzjd.mis.graduate.api.dao.mapper.WagesMapper;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.pojo.Oder;
import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.pojo.Wages;
import com.lzjd.mis.graduate.api.domain.request.QueryOderReqVo;
import com.lzjd.mis.graduate.api.service.OderService;
import com.lzjd.mis.graduate.api.util.DateUtil;
import com.lzjd.mis.graduate.api.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
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

    @Autowired
    private WageMapper wageMapper;

    @Autowired
    private WagesMapper wagesMapper;

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
            BasePage<Oder> basePage = PageUtil.getPageList(queryOderReqVo.getPageNo(),contractResDTOList);
            return HttpResponse.success(basePage);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse view(long id) {
        try {
            Oder oder = oderMapper.selectByPrimaryKey(id);
            return HttpResponse.success(oder);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("查询失败");
        }
    }

    @Override
    public HttpResponse update(Oder oder) {
        try {


            if(oder.getStatusCode().equals("3")){
                // 异步处理工资条提成更改
                updateWags(oder);
            }
            int  i = oderMapper.updateByPrimaryKeySelective(oder);
            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("更新失败");
        }
    }

    @Override
//    @Async("taskProductExecutor")
    public void updateWags(Oder oder) {
        //查询工资信息
        Wage wage =  wageMapper.getByEmpCode(oder.getEmployeeCode());
        Wages wages = new Wages();
        wages.setEmployeeCode(wage.getEpmCode());
        Calendar c = Calendar.getInstance();
        Long year=Long.valueOf(c.get(Calendar.YEAR)) ;
        Long month = Long.valueOf( c.get(Calendar.MONTH)+1);
        wages.setMonth(month);
        wages.setYear(year);
        Wages wages1 = wagesMapper.selectByOder(wages);
        wages1.setPercentage( wages1.getPercentage()+oder.getCost()*wage.getCost()/100);
        wagesMapper.updateByPrimaryKeySelective(wages1);
    }

    @Override
    public HttpResponse delete(Long id) {
        try {
            int i = oderMapper.deleteByPrimaryKey(id);
            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return  HttpResponse.failure("删除失败");
        }
    }
}
