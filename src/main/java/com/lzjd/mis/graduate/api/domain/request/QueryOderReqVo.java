package com.lzjd.mis.graduate.api.domain.request;

import com.lzjd.mis.graduate.api.base.common.PageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname: QueryOderReqVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/13
 * @Version 1.0
 * @Since 1.0
 */
@Data
@ApiModel("订单列表展示请求实体")
public class QueryOderReqVo extends PageReq {

    @ApiModelProperty("状态编码")
    private String statusCode;

    @ApiModelProperty("客户编码")
    private String customerCode;

    @ApiModelProperty("雇员编码")
    private String employeeCode;
}
