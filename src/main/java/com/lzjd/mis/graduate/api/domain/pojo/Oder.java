package com.lzjd.mis.graduate.api.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("订单")
public class Oder {
    @ApiModelProperty("")
    private Long id;

    @ApiModelProperty("编码")
    private String code;


    @ApiModelProperty("状态编码")
    private String statusCode;

    @ApiModelProperty("状态名称")
    private String statusName;

    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    @ApiModelProperty("用时")
    private Long time;

    @ApiModelProperty("服务编码")
    private String serviceCode;

    @ApiModelProperty("服务名称")
    private String serviceName;

    @ApiModelProperty("客户编码")
    private String customerCode;

    @ApiModelProperty("客户名称")
    private String customerName;

    @ApiModelProperty("雇员编码")
    private String employeeCode;

    @ApiModelProperty("雇员名称")
    private String employeeName;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("单价")
    private Long price;

    @ApiModelProperty("总价")
    private Long cost;

    @ApiModelProperty("备注")
    private String text;
}