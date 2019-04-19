package com.lzjd.mis.graduate.api.domain.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户对象")
@Data
public class User {

    @ApiModelProperty("主键")
    private Integer id;

    private String userName;

    private String password;

    private Integer age;
}