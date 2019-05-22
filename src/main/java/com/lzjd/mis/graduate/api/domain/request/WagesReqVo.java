package com.lzjd.mis.graduate.api.domain.request;

import com.lzjd.mis.graduate.api.base.common.PageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname: WagesReqVo
 * 描述:工资条列表展示请求保实体
 * @Author: Kt.w
 * @Date: 2019/5/22
 * @Version 1.0
 * @Since 1.0
 */
@Data
@ApiModel("工资条列表展示请求保实体")
public class WagesReqVo  extends PageReq {

    @ApiModelProperty("员工编码")
    private String employeeCode;
}
