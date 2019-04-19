package com.lzjd.mis.graduate;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Classname: GraduateApiBootApplication
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/19
 * @Version 1.0
 * @Since 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = {"com.lzjd.mis.graduate.api.dao.mapper"})
@EnableAsync(proxyTargetClass = true)//线程异步
public class GraduateApiBootApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(GraduateApiBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GraduateApiBootApplication.class, args);
        LOGGER.info("============= SpringBoot Start Success =============");
    }
}
