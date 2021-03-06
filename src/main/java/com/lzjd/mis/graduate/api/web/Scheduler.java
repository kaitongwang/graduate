package com.lzjd.mis.graduate.api.web;

import com.lzjd.mis.graduate.api.service.SchedulerService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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


    /**
     * 定时任务器，每月1号0时去生成工资条
     */
    @Scheduled(cron = "0 0 0 1 1-12 ? ")
//    @Scheduled(cron = "0 0,20 11 1-31 * ? ")
    public void createWages(){
        System.out.println("------每月生成工资条-------");
        schedulerService.createWages();
    }
}
