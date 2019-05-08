package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.service.SchedulerService;
import groovy.util.logging.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

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
}
