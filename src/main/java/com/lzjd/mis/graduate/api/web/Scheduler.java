package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.service.SchedulerService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @Classname: Scheduler
 * 描述:  定时器
 * @Author: Kt.w
 * @Date: 2019/5/8
 * @Version 1.0
 * @Since 1.0
 */
@Component
public class Scheduler {

    @Autowired
    private SchedulerService schedulerService;
    /**
     * 更新订单编码的尺度
     */
    @Scheduled(cron="0 0 0 * * ?")//每天0点开始
    public void updateOderRule(){
        //业务逻辑
        schedulerService.updateOderRule();
    }

//    @Scheduled(cron="0 0/1 * * * ?")
//    public void test(){
//        System.out.println("------定时任务-------");
//    }
}
