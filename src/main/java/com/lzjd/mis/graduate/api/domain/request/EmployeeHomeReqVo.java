package com.lzjd.mis.graduate.api.domain.request;

import com.lzjd.mis.graduate.api.base.common.PageReq;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname: EmployeeHomeReqVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/20
 * @Version 1.0
 * @Since 1.0
 */
@Data
public class EmployeeHomeReqVo extends PageReq {

    @ApiModelProperty("服务编码")
    private String serviceCode;
}
