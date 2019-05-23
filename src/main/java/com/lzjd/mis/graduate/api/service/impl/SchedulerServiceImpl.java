package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.dao.mapper.WageMapper;
import com.lzjd.mis.graduate.api.dao.mapper.WagesMapper;
import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.pojo.Wages;
import com.lzjd.mis.graduate.api.service.SchedulerService;
import groovy.util.logging.Log4j;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Classname: SchedulerServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/8
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class SchedulerServiceImpl  implements SchedulerService {

    @Autowired
    private EncodingRuleDao encodingRuleDao;

    @Autowired
    private WageMapper wageMapper;

    @Autowired
    private WagesMapper wagesMapper;

    /**
     * 更新订单编码尺度
     */
    @Override
    public void updateOderRule() {
        try {
            encodingRuleDao.updateOderRule();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //生成工资条
    @Override
    public void createWages() {

        System.out.println("开始生成工资条");
        // 查询出工资
        List<Wage>  wages =  wageMapper.getList();
        List<Wages> wages1 = new ArrayList<>();
        for (Wage wage : wages) {
            Wages wages2 = new Wages();
            wages2.setEmployeeCode(wage.getEpmCode());
            wages2.setEmployeeName(wage.getEpmName());
            wages2.setSalary(wage.getBaseSalary());
            wages2.setPercentage(0L);
            wages2.setFine(0L);
            wages1.add(wages2);
        }
        Calendar c = Calendar.getInstance();
        Long year=Long.valueOf(c.get(Calendar.YEAR)) ;
        Long month = Long.valueOf( c.get(Calendar.MONTH));
      wages1.stream().forEach(wages3-> wages3.setYear(year));
      wages1.stream().forEach(wages3-> wages3.setMonth(month));


      wagesMapper.insertList(wages1);

    }
}
