package com.lzjd.mis.graduate.api.domain.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("登陆用户信息")
public class User {

    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户编码")
    private String userCode;
}