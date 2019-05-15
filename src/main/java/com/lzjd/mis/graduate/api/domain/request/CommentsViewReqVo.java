package com.lzjd.mis.graduate.api.domain.request;

import com.lzjd.mis.graduate.api.base.common.PageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname: CommentsViewReqVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/15
 * @Version 1.0
 * @Since 1.0
 */
@Data
@ApiModel("评价查询")
public class CommentsViewReqVo extends PageReq {

    @ApiModelProperty("订单编码")
    private String oderCode;

    @ApiModelProperty("客户编码")
    private String customerCode;

    @ApiModelProperty("员工编码")
    private String employeesCode;
}
