package com.lzjd.mis.graduate.api.service;

/**
 * @Classname: Scheduler
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/8
 * @Version 1.0
 * @Since 1.0
 */
public interface SchedulerService {


    /**
     * 更新订单编码尺度
     */
     void updateOderRule();


    /**
     * 生成每月的工资条
     */
    void  createWages();
}
