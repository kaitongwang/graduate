package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("客户实体")
public class Customer {
    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("客户编码")
    private String customerCode;

    @ApiModelProperty("客户名称")
    private String customerName;

    @ApiModelProperty("客户密码 ")
    private String customerPassword;

    @ApiModelProperty("电话")
    private String telephone;

    @ApiModelProperty("地址")
    private String address;

}