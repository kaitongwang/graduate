package com.lzjd.mis.graduate.api.domain.responses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname: WagesTotal
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/6/5
 * @Version 1.0
 * @Since 1.0
 */
@Data
@ApiModel("总工资返回实体")
public class WagesTotal {

    @ApiModelProperty("年")
    private  Long  year;

    @ApiModelProperty("月")
    private Long  month;

    @ApiModelProperty("底薪")
    private Long salary;

    @ApiModelProperty("绩效")
    private Long  percentage;

    @ApiModelProperty("罚款")
     private Long   fine;

    @ApiModelProperty("总工资")
     private Long totalWages;




}
